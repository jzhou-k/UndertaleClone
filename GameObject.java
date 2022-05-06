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
}
