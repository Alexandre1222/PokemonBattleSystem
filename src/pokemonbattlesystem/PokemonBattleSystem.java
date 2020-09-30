package pokemonbattlesystem;

import java.util.*;

public class PokemonBattleSystem {
    static void HUD(int HP, int HP2, String Nome1, String Nome2){
        System.out.println("========================");
        System.out.println(Nome1 + ": " + HP);
        System.out.println(Nome2 + ": " + HP2);
        System.out.println("========================");
    }
    
    static void Battle(){
        /*
        Pokemon a = new Pokemon();
        a.setNome("Infernape(LV.50)");
        a.setTipo1("Fighting");
        a.setTipo2("Fire");
       a.setHP(185);
       a.setAt(171);
       a.setDf(135);
       a.setSpAt(171);
       a.setDf(135);
       a.setSpeed(176);
       
       Pokemon b = new Pokemon();
       b.setNome("Greninja (LV.50)");
       b.setTipo1("Water");
       b.setTipo2("Dark");
       b.setHP(179);
       b.setAt(161);
       b.setDf(130);
       b.setSpAt(170);
       b.setDf(135);
       b.setSpeed(191);
       
       Pokemon c = new Pokemon();
       c.setNome("Scizor (LV.50)");
       c.setTipo1("Bug");
       c.setTipo2("Steel");
       c.setHP(177);
       c.setAt(200);
       c.setDf(167);
       c.setSpAt(117);
       c.setDf(145);
       c.setSpeed(128);
*/
    String Pokemon1Nome = "nome aleatorio";
    String Pokemon2Nome = "Nome aleatorio";
    int Pokemon1Vida = 10;
    int Pokemon2Vida = 10;

    while(Pokemon1Vida > 0 && Pokemon2Vida > 0){
    HUD(Pokemon1Vida,Pokemon2Vida,Pokemon1Nome,Pokemon2Nome);
    }
    
    }

    public static void main(String[] args) {
    Inicio();   
    }
    static void Inicio(){
        Pokemon p1 = new Infernape();
        Pokemon p2 = new Infernape();
        System.out.println("BEM VINDO AO POKEMON BATTLE SIMULATOR");
        System.out.println("Iremos começar uma batalha entre Infernape vs Infernape");
        System.out.println("Deseja alterar o nome do seu infernape?");
        Scanner sc = new Scanner(System.in);
        int resposta = sc.nextInt();
        String nome;
        if(resposta == 1){
            System.out.println("Qual nome desejaria colocar?");
             nome = sc.next();
            p1.Nome = nome;
            System.out.println("Agora seu pokemon se chama: " + nome);
        }else{
            System.out.println("Okay então, vamos continuar");
        }
        System.out.println("\n\n\n");
        System.out.println("=====================");
        System.out.println("Jogador: " + p1.Nome + ", Eu escolho você");
        System.out.println("Inimigo: " + p2.Nome + ", Acabe com ele");
        System.out.println("=====================");
        while(p1.HP > 0 && p2.HP > 0){
        HUD(p1.HP, p2.HP, p1.Nome, p2.Nome);
           p1.printMoves();
           if(p1.HP >0){
           int choice = sc.nextInt();
          
          
           p1.CalculateDamage(p1, choice, p2);
           
           
           if(p2.HP > 0){
             Random random = new Random();
              int AtaqueInimigo = random.nextInt(4);
        p2.BotAtack(p2, AtaqueInimigo, p1);
        }else if (p2.HP <= 0){
            System.out.println(p2.Nome + " Desmaiou");
            System.out.println(p1.Nome + " é o vencedor desta batalha");
        }
           
        }else if(p1.HP <= 0){
               System.out.println(p1.Nome + " Desmaiou");
               System.out.println(p2.Nome + " é o vencedor desta batalha");
           }}
        
    }
    
}
