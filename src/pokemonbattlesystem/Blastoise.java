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
public class Blastoise extends Pokemon{
    
     Blastoise() {
        super("Blastoise",79, 83, 100, 85, 105, 78, "Water", "Null");
    
    moves[0][0] = "Body Slam";
        moves[0][1] = "85";
        moves[0][2] = "100";
        moves[0][3] = "Normal";
        moves[0][4] = "Physical";
        
        moves[1][0] = "Ice Punch";
        moves[1][1] = "75";
        moves[1][2] = "100";
        moves[1][3] = "Ice";
        moves[1][4] = "Physical";
        
        moves[2][0] = "Earthquake";
        moves[2][1] = "100";
        moves[2][2] = "100";
        moves[2][3] = "Ground";
        moves[2][4] = "Physical";
        
        moves[3][0] = "Waterfall";
        moves[3][1] = "40";
        moves[3][2] = "100";
        moves[3][3] = "Water";
        moves[3][4] = "Physical";
    }
    
    
    
}
