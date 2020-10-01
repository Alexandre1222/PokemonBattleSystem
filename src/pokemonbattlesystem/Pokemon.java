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
         String TipoM = moves[m][0];
         String TipoQ1 = p.Tipo2;
         
                  if(TipoQ1.equals("Fire")){
             if(TipoM.equals("Fire")){
                 System.out.println("Dano divido pela metade");
             damage /= 2;
             }else if(TipoM.equals("Water")){
             damage *= 2;
             }else if(TipoM.equals("Grass")){
                 damage /= 2;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
                 damage *= 2;
              }else if(TipoM.equals("Ice")){
              damage /= 2;
              }
         
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
         Double rawDamage = damage;
         String TipoM = moves[m][3];
         String TipoP1 = p.Tipo1;
         String TipoP2 = p.Tipo2;
         String TipoQ1 = q.Tipo1;
         String TipoQ2 = q.Tipo2;
         if(TipoQ1.equals("Fire")){
             if(TipoM.equals("Fire")){
             damage /= 2;
             }else if(TipoM.equals("Water")){
             damage *= 2;
             }else if(TipoM.equals("Grass")){
                 damage /= 2;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
                 damage *= 2;
              }else if(TipoM.equals("Ice")){
              damage /= 2;
              }
         
         }else if(TipoQ1.equals("Water")){
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Grass")){
             if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Psychic")){
             if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Flying")){
            if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage *=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage =0;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Ground")){
             if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         }else if(TipoQ1.equals("Poison")){
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }
         }if(TipoQ2.equals("null")){
         q.HP -= damage;
         }else{
         
             
          if(TipoQ1.equals("Fire")){
             if(TipoM.equals("Fire")){
             damage /= 2;
             }else if(TipoM.equals("Water")){
             damage *= 2;
             }else if(TipoM.equals("Grass")){
                 damage /= 2;
             }else if(TipoM.equals("Ground")){
             damage *= 2;
             }else if(TipoM.equals("Rock")){
                 damage *= 2;
              }else if(TipoM.equals("Ice")){
              damage /= 2;
              }
         
         }else if(TipoQ1.equals("Water")){
             if(TipoM.equals("Fire")){
             damage /=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Grass")){
             if(TipoM.equals("Fire")){
             damage *=2;
             }else if(TipoM.equals("Water")){
             damage /=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Ground")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Flying")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Psychic")){
             if(TipoM.equals("Psychic")){
             damage /=2;
             }else if(TipoM.equals("Dark")){
             damage *=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Flying")){
            if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage *=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }else if(TipoM.equals("Rock")){
             damage *=2;
             }else if(TipoM.equals("Ground")){
             damage =0;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }
         }else if(TipoQ1.equals("Ground")){
             if(TipoM.equals("Ice")){
             damage *=2;
             }else if(TipoM.equals("Eletric")){
             damage =0;
             }else if(TipoM.equals("Water")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage *=2;
             }
         }else if(TipoQ1.equals("Poison")){
             if(TipoM.equals("Ground")){
             damage *=2;
             }else if(TipoM.equals("Psychic")){
             damage *=2;
             }else if(TipoM.equals("Grass")){
             damage /=2;
             }else if(TipoM.equals("Poison")){
             damage /=2;
             }else if(TipoM.equals("Fighting")){
             damage /=2;
             }              
             
         }
         }
        p.HP -= (int)(damage);
        
        if (damage == 0){
            System.out.println(moves[m][0] + "não teve efeito algum");
        }else if(damage > rawDamage){
            System.out.println(moves[m][0] + "o golpe foi super efetivo");
        }else if(damage < rawDamage){
            System.out.println(moves[m][0] + "o golpe não foi muito efetivo");
        }
         System.out.println("O pokemon Aliado levou: " + damage + " de dano");

     }
     
     
}
     





