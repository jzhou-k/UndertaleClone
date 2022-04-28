public class CombatObject {
    
    //this object will take info from settings 
    //default speed will be taken from settings 

    String name; 
    int speed;
    int[] coord = new int[2]; //(x,y)
    int[] size = new int[2]; //(Width,length), need to check collision

    //default class contructor
    public CombatObject(String name){
        this.name = name;
        //default coordinate is (0,0) (theres gotta be a better way of doing this)
        this.coord[0] = 0;
        this.coord[1] = 0;
        //default size is (1,1)
        this.size[0] = 1;
        this.size[0] = 1;
        this.speed = 10;

    }

    public CombatObject(String name, int[] coord, int[] size){
        this.name = name;
        this.coord = coord; 
        this.size = size;
        this.speed = 10;
    }


    //what does public header do again? 
    //what does static do? 
    public void move(int x, int y) {
        //coord of this particular object is changed
        coord[0] = x;
        coord[1] = y;
    }

    public int[] currentCoord(){
        return this.coord;
    }
}
