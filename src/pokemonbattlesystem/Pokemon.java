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
        q.HP -= damage;
         System.out.println("O pokemon Aliado levou: " + damage + " de dano");

     }
     
     
}
     





