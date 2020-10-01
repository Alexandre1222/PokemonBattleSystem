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
public class Machamp extends Pokemon{
    
    Machamp() {
        super("Machamp",90, 130, 80, 65, 85, 55, "Fighting", "Null");
    
    moves[0][0] = "Superpower";
        moves[0][1] = "120";
        moves[0][2] = "100";
        moves[0][3] = "Fighting";
        moves[0][4] = "Physical";
        
        moves[1][0] = "Strength";
        moves[1][1] = "80";
        moves[1][2] = "100";
        moves[1][3] = "Fighting";
        moves[1][4] = "Physical";
        
        moves[2][0] = "Knock Off";
        moves[2][1] = "65";
        moves[2][2] = "100";
        moves[2][3] = "Dark";
        moves[2][4] = "Physical";
        
        moves[3][0] = "Stone Edge";
        moves[3][1] = "100";
        moves[3][2] = "80";
        moves[3][3] = "Rock";
        moves[3][4] = "Physical";
    }
    
}
