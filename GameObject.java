
/**
 *
 * @author sunzi
 */
public class GameObject {
    String name; 
    int[] coord = new int[2]; //(x,y)
    int[] size = new int[2];

    public GameObject(String name, int[] coord, int[] size){
        this.name = name;
        this.coord = coord; 
        this.size = size;
    }

    public GameObject(String name){
        this.coord[0] = 0;
        this.coord[1] = 0;
        //default size is (1,1)
        this.size[0] = 1;
        this.size[0] = 1;     
    }
    /*
    Accessors
    */

    public String getName()
    {
        return this.name; 
        
        //method overiding for npc to be stationary.
    }
    
    public int[] getCoord()
    {
        return this.coord;
    }
            
    public int[] getSize()
    {
        return this.size;
    }
    //mutators
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCoord (int[] coord){
        this.coord = coord;
    }
    
    public void setSize (int[] size){
        this.size = size; 
    }
    public String toString() {
        return "Name: " + name + "\nX-Coordinate: " + coord[0] + " Y-Coordinate: " + coord[1] + "\nSize: " + size[0] + ", " + size[1];
        
    }
}
