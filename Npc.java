/*
 * Name: Patrick Sun
 * Date: 5/06/2022
 * Description: This is the npc subclass of GameObject class.
 */

import java.util.*;


public class Npc extends GameObject{ //new doctor class
/**
* @param args the command line arguments
*/

    /*
    Attributes
    */
    private String[] dialogue = new String[3];


    /*
    Constructor
    */

    /**
     * Initializes a new Npc class with name, coord arrays, size arrays and dialogue arrays. 
     * @param name - name of npc 
     * @param coord - coord of npc 
     * @param size - size of npc
     * @param dialogue - dialogue of npc 
     */
    public Npc(String name, int[] coord, int[] size, String[] dialogue) {
        super(name, coord, size); //inheritance from the super class
        this.dialogue = dialogue;
    }

     
    /*
    Accessors
    */
    
    /**
     * Gets the dialogue of npc 
     * @return the dialogue of the npc 
     */
    public String[] getDialogue()
    {
        return this.dialogue;
    }
    
    //mutators:
   /**
     * Changes the dialogue of Npc
     * @param dialogue - dialogue of npc 
     * @param i the index of dialogues array user wishes to change 
     */ 
    public void setDialogue (String dialogue, int i)
    {
        this.dialogue[i] = dialogue;
    }
 
            
   /**
     * Npc talks, press A to talk and move to next line. 
     */
    public void talk ()
    {
       Scanner sc= new Scanner(System.in);
       String inputKey = " ";
       
       for (int i = 0; i<3;)
       {
         inputKey  = sc.nextLine();
         if (inputKey.equals("A"))
         {
            System.out.println(this.dialogue[i]);
            i++;
         }
       }
    }

    public String getDialogueAsString(){
        String dialogueString = ""; 
        for(int i=0; i< dialogue.length; i++){
            
            dialogueString += "\n" + dialogue[i];
        }

        return dialogueString;
    }
    
    /**
     * Returns everything as toString
     * @return toString - String of formatted attributes in this class. 
     */
    @Override
    public String toString() {
        String dialogueString = getDialogueAsString(); 

        return super.toString() + "\nDialogue: " + dialogueString;
    }

}
