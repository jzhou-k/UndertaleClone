public class Armor extends Item {
    
    private int defense; 

    public Armor(String name, int[] coord, int[] size, String description, int price, int defense){
        super(name, coord, size, description, price);
        this.defense = defense;
    }

    public Armor(String name, int defense){
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
