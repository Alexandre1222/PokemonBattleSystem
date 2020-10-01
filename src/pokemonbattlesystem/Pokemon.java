/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonbattlesystem;

/**
 *
 * @author 55859
 */
public class Pokemon{

     int HP;
     int At;
     int Df;
     int SpAt;
     int SpDf;
     int Speed;
     String Nome;
      String Tipo1;
      String Tipo2;
      String moves[][];
       Pokemon(String n,int h, int a, int d, int sa, int sd, int spd, String tp1, String tp2){
     Nome = n;
      HP = h;
      At = a;
      Df = d;
      SpAt = sa;
      SpDf = sd;
      Speed = spd;
      Tipo1 = tp1;
       Tipo2 = tp2;
     moves = new String [4][6];
}
    
     void printMoves(){
         System.out.println("Selecione seu movimento: ");
         for(int i = 0;i<4;i++){
             System.out.println((i+1)+"."+moves[i][0]);
         }
     
     }
    
     void CalculateDamage(Pokemon p, int m, Pokemon q){
         m--;
         double damage = 0.0;
         double r = Math.random()*100;
         System.out.println("Você usou: " + moves[m][0]);
         if(r >Double.parseDouble(moves[m][2])){
             System.out.println("Você errou o ataque");
             return;
         }
         if(moves[m][4].equals("Special")){
             System.out.println("Você selecionou um golpe especial");
             damage = p.SpAt * Double.parseDouble(moves[m][1])/q.SpDf;
         
         }else{
             System.out.println("Você selecionou um golpe fisico");
         damage = p.At * Double.parseDouble(moves[m][1])/q.Df;
         }
         double rawDam = damage;
         String TipoInimigo1 = q.Tipo1;
         String TipoInimigo2 = q.Tipo2;
         String TipoM = moves[m][3];
         
         if(TipoInimigo1.equals("Normal")){
         
         if(TipoM.equals("Fighting")){
          damage *= 2;
         }else if(TipoM.equals("Ghost")){
             damage = 0;
         }
         
         }else if(TipoInimigo1.equals("Fighting")){
             
             if(TipoM.equals("Flying")){
             damage *= 2;
             }else if(TipoInimigo1.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
                 damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Flying")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage = 0;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Poison")){
             
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Ground")){
         
             if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
                 damage/=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Rock")){
         
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
                 damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Bug")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Ghost")){
             
             if(TipoM.equals("Normal")){
             damage = 0;
             }else if(TipoM.equals("Fighting")){
             damage = 0;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Steel")){
             
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage = 0;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Dragon")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Fire")){
         
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Water")){
         
             if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
              
         }else if(TipoInimigo1.equals("Grass")){
         
             if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
            
         }else if(TipoInimigo1.equals("Electric")){
         
             if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Psychic")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
                     
         }else if(TipoInimigo1.equals("Ice")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Dragon")){
         
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Dark")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
              
         }else if(TipoInimigo1.equals("Fairy")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }
         
         }
         
         if(TipoInimigo2.equals("null")){
         p.HP -= (int)(damage);
         }else{
         
                  if(TipoInimigo2.equals("Normal")){
         
         if(TipoM.equals("Fighting")){
          damage *= 2;
         }else if(TipoM.equals("Ghost")){
             damage = 0;
         }
         
         }else if(TipoInimigo2.equals("Fighting")){
             
             if(TipoM.equals("Flying")){
             damage *= 2;
             }else if(TipoInimigo1.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
                 damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Flying")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage = 0;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Poison")){
             
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Ground")){
         
             if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
                 damage/=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Rock")){
         
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
                 damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Bug")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Ghost")){
             
             if(TipoM.equals("Normal")){
             damage = 0;
             }else if(TipoM.equals("Fighting")){
             damage = 0;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Steel")){
             
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage = 0;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Dragon")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Fire")){
         
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Water")){
         
             if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
              
         }else if(TipoInimigo2.equals("Grass")){
         
             if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
            
         }else if(TipoInimigo2.equals("Electric")){
         
             if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Psychic")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
                     
         }else if(TipoInimigo2.equals("Ice")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Dragon")){
         
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Dark")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
              
         }else if(TipoInimigo2.equals("Fairy")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }
         
         }
         
         
         
         }
         
             
             
             
             
             
             
             
             
         if(rawDam > damage){
             System.out.println("Seu golpe nao foi efetivo");
         }else if(rawDam < damage){
             System.out.println("Seu golpe foi super efetivo");
         }else if(damage == 0){
             System.out.println("Inefetivo");
         }
        q.HP -= damage;
         System.out.println("O pokemon inimigo levou: " + damage + " de dano");

     }
     void BotAtack(Pokemon p, int m, Pokemon q){
     double damage = 0.0;
         
         double r = Math.random()*100;
         System.out.println("O inimigo usou: " + moves[m][0]);
         if(r >Double.parseDouble(moves[m][2])){
             System.out.println("O inimigo errou o ataque");
             return;
         }
         if(moves[m][4].equals("Special")){
            
             damage = p.SpAt * Double.parseDouble(moves[m][1])/p.SpDf;
         
         }else{
             
         damage = p.At * Double.parseDouble(moves[m][1])/p.Df;
         }
         double rawDam = damage;
         String TipoInimigo1 = q.Tipo1;
         String TipoInimigo2 = q.Tipo2;
         String TipoM = moves[m][3];
         
         if(TipoInimigo1.equals("Normal")){
         
         if(TipoM.equals("Fighting")){
          damage *= 2;
         }else if(TipoM.equals("Ghost")){
             damage = 0;
         }
         
         }else if(TipoInimigo1.equals("Fighting")){
             
             if(TipoM.equals("Flying")){
             damage *= 2;
             }else if(TipoInimigo1.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
                 damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Flying")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage = 0;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Poison")){
             
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Ground")){
         
             if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
                 damage/=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Rock")){
         
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
                 damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         
         }else if(TipoInimigo1.equals("Bug")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Ghost")){
             
             if(TipoM.equals("Normal")){
             damage = 0;
             }else if(TipoM.equals("Fighting")){
             damage = 0;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Steel")){
             
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage = 0;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Dragon")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Fire")){
         
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Water")){
         
             if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
              
         }else if(TipoInimigo1.equals("Grass")){
         
             if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
            
         }else if(TipoInimigo1.equals("Electric")){
         
             if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Psychic")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
                     
         }else if(TipoInimigo1.equals("Ice")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
             
         }else if(TipoInimigo1.equals("Dragon")){
         
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
             
         }else if(TipoInimigo1.equals("Dark")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
              
         }else if(TipoInimigo1.equals("Fairy")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }
         
         }
         
         if(TipoInimigo2.equals("null")){
         p.HP -= (int)(damage);
         }else{
         
                  if(TipoInimigo2.equals("Normal")){
         
         if(TipoM.equals("Fighting")){
          damage *= 2;
         }else if(TipoM.equals("Ghost")){
             damage = 0;
         }
         
         }else if(TipoInimigo2.equals("Fighting")){
             
             if(TipoM.equals("Flying")){
             damage *= 2;
             }else if(TipoInimigo1.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
                 damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Flying")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage = 0;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Poison")){
             
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Ground")){
         
             if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
                 damage/=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Rock")){
         
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
                 damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         
         }else if(TipoInimigo2.equals("Bug")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Ghost")){
             
             if(TipoM.equals("Normal")){
             damage = 0;
             }else if(TipoM.equals("Fighting")){
             damage = 0;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Steel")){
             
             if(TipoM.equals("Normal")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage = 0;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Dragon")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Fire")){
         
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Water")){
         
             if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
              
         }else if(TipoInimigo2.equals("Grass")){
         
             if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }
            
         }else if(TipoInimigo2.equals("Electric")){
         
             if(TipoM.equals("Flying")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Psychic")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }
                     
         }else if(TipoInimigo2.equals("Ice")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
             
         }else if(TipoInimigo2.equals("Dragon")){
         
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Electric")){
             damage /=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage *=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
             
         }else if(TipoInimigo2.equals("Dark")){
         
             if(TipoM.equals("Fighting")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage *=2;
             }else if(TipoM.equals("Ghost")){
             damage /=2;
             }else if(TipoM.equals("Psychic")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }else if(TipoM.equals("Fairy")){
             damage *=2;
             }
              
         }else if(TipoInimigo2.equals("Fairy")){
         
             if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage *=2;
             }else if(TipoM.equals("Bug")){
             damage /=2;
             }else if(TipoM.equals("Steel")){
             damage *=2;
             }else if(TipoM.equals("Dragon")){
             damage = 0;
             }else if(TipoM.equals("Dark")){
             damage /=2;
             }
         
         }
         
         
         
         }
                 
         if(rawDam > damage){
             System.out.println("O golpe inimigo nao foi efetivo");
         }else if(rawDam < damage){
             System.out.println("O golpe inimigo foi super efetivo");
         }else if(damage == 0){
             System.out.println("Inefetivo");
         }
        q.HP -= damage;
         System.out.println("O pokemon inimigo levou: " + damage + " de dano");

     }
     
     
}
     





