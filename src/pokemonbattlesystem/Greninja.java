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
public class Greninja extends Pokemon{
   
     Greninja() {
        super("Greninja",179, 161, 130, 170, 135, 191, "Water", "Dark");
        moves[0][0] = "Hydro Pump";
        moves[0][1] = "110";
        moves[0][2] = "80";
        moves[0][3] = "Water";
        moves[0][4] = "Special";
        
        moves[1][0] = "Ice Beam";
        moves[1][1] = "90";
        moves[1][2] = "100";
        moves[1][3] = "Ice";
        moves[1][4] = "Special";
        
        moves[2][0] = "Acrobatics";
        moves[2][1] = "110";
        moves[2][2] = "100";
        moves[2][3] = "Flying";
        moves[2][4] = "Physical";
        
        moves[3][0] = "Dark Pulse";
        moves[3][1] = "80";
        moves[3][2] = "100";
        moves[3][3] = "Dark";
        moves[3][4] = "Special";
        
        
    }
   
}
