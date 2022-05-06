public class Weapon extends Item {
    
    int attackDmg;

    public Weapon(String name, int[] coord, int[] size, String description, int price, int attackDmg){
        super(name, coord, size, description, price);
        this.attackDmg = attackDmg;
    }
}
