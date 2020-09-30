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
public class Infernape extends Pokemon{
   
     Infernape() {
        super("Infernape",185, 171, 135, 171, 135, 176, "Fighting", "Fire");
        moves[0][0] = "Flamethrower";
        moves[0][1] = "90";
        moves[0][2] = "100";
        moves[0][3] = "Fire";
        moves[0][4] = "Special";
        
        moves[1][0] = "Stone Edge";
        moves[1][1] = "100";
        moves[1][2] = "80";
        moves[1][3] = "Rock";
        moves[1][4] = "Physical";
        
        moves[2][0] = "Close Combat";
        moves[2][1] = "120";
        moves[2][2] = "100";
        moves[2][3] = "Fighting";
        moves[2][4] = "Physical";
        
        moves[3][0] = "Thunder Punch";
        moves[3][1] = "75";
        moves[3][2] = "100";
        moves[3][3] = "Eletric";
        moves[3][4] = "Physical";
        
        
    }
   
}
