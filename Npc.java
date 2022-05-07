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
     *
     * @param name
     * @param coord
     * @param size
     * @param dialogue
     */
    public Npc(String name, int[] coord, int[] size, String[] dialogue) {
        super(name, coord, size); //inheritance from the super class
        this.dialogue = dialogue;
    }

    
    /** 
     * @return String[]
     */
    /*
    Accessors
    */
    
    public String[] getDialogue()
    {
        return this.dialogue;
    }
    
    //mutators:
    public void setDialogue (String dialogue, int i)
    {
        this.dialogue[i] = dialogue;
    }
 
            
    //show it, which dialogue to show, 
    public void talk ()
    {
       Scanner sc= new Scanner(System.in);
       String inputKey = " ";
       
       for (int i = 0; i<4; )
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
            //
            dialogueString += "\n" + dialogue[i];
        }

        return dialogueString;
    }

    @Override
    public String toString() {
        String dialogueString = getDialogueAsString(); 

        return super.toString() + "\nDialogue: " + dialogueString;
    }

}
