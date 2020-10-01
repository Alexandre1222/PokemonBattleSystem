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
public class Scizor extends Pokemon{
    Scizor(){
    super("Scizor",177, 200, 167, 117, 145, 128, "Bug", "Steel");
    
    moves[0][0] = "Bug Buzz";
        moves[0][1] = "90";
        moves[0][2] = "100";
        moves[0][3] = "Bug";
        moves[0][4] = "Special";
        
        moves[1][0] = "Iron Head";
        moves[1][1] = "80";
        moves[1][2] = "100";
        moves[1][3] = "Steel";
        moves[1][4] = "Physical";
        
        moves[2][0] = "Quick Attack";
        moves[2][1] = "40";
        moves[2][2] = "100";
        moves[2][3] = "Normal";
        moves[2][4] = "Physical";
        
        moves[3][0] = "Acrobatics";
        moves[3][1] = "55";
        moves[3][2] = "100";
        moves[3][3] = "Flying";
        moves[3][4] = "Physical";
    }
}
