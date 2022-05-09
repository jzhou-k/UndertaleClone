
/**
 * Name: Patrick 
 * @author Patrick
 * Date: 5/9/2022
 * Description: This is the GameObject superclass
 */
public class GameObject {
    //attributes
    String name; 
    int[] coord = new int[2]; //(x,y)
    int[] size = new int[2];

    //this string contains all formated attributes in gameobject
    String returnString;
    
    //contructor 
    
    /**
     * Initialize a new class with name, coord array and size array.
     * @param name - name of game object
     * @param coord - coord of game object
     * @param size - size of game object
     */
    public GameObject(String name, int[] coord, int[] size){
        this.name = name;
        this.coord = coord; 
        this.size = size;
    }

    //default constructor
    /**
     * When people lazy and only type in the name, program initializes coord and size as 0,1 and 0,1. 
     * @param name - name of the gameobject
     */
    public GameObject(String name){
        this.name = name;
        this.coord[0] = 0;
        this.coord[1] = 0;
        //default size is (1,1)
        this.size[0] = 1;
        this.size[1] = 1;     
    }
    /*
    Accessors
    */

    /**
     * Gets the game-object's name 
     * @return the name of the gameobject
     */
    public String getName()
    {
        return this.name;   
    }
    
    /**
     * Gets the game-object's coordinates (x and y)
     * @return the coordinates of the gameobject
     */
    public int[] getCoord()
    {
        return this.coord;
    }
    
    /**
     * Gets the game-object's size (x and y)
     * @return the size of the gameobject 
     */
    public int[] getSize()
    {
        return this.size;
    }
    
    //mutators
    
    /**
     * Change the name of the gameobject
     * @param name of game object
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * change the coordinates of the gameobject
     * @param coord of gameobject
     */
    public void setCoord (int[] coord){
        this.coord = coord;
    }
    
    /**
     * change the size of the gameobject
     * @param size of the gameobject
     */
    public void setSize (int[] size){
        this.size = size; 
    }
    
    /**
     * Returns everything as toString
     * @return toString - String of formatted attributes in this class. 
     */
    public String toString() {
        return "Name: " + name + "\nX-Coordinate: " + coord[0] + " Y-Coordinate: " + coord[1] + "\nSize: " + size[0] + ", " + size[1];
        
    }
}
