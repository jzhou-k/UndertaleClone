public class GameObject {
    String name; 
    int[] coord = new int[2]; //(x,y)
    int[] size = new int[2];

    public GameObject(String name, int[] coord, int[] size){
        this.name = name;
        this.coord = coord; 
        this.size = size;
    }
}
