/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package underclonepatrick;

/**
 *
 * @author sunzi
 */
public class main {
    public static void main(String[] args){
        int[] coord = {1,20};
        int[] size ={10,13};
        String[] dialogue = {"1"};
        Npc character1 = new Npc ("lucifer",coord,size,dialogue); //initiallize 
        coord=character1.getCoord();
        
        character1.getCoord(); //testing getCoord

        System.out.println(coord[0]+" "+coord[1]);
        System.out.println(size[0]+" "+size[1]);
        
        
        System.out.println(character1);
    }
}
