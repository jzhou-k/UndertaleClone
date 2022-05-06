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
}
