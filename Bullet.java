public class Bullet extends GameObject {

    /** this is the damage of the bullet */
    private int damage = 5;

    /** this is the speed of the bullet */
    private int speed = 3;
    

    /**
     * this is the constructor for Bullet
     * @param name - this is the name of the Bullet
     * @param damage - this is the damage of the bullet
     * @param speed - this is the speed of the bullet
     */
    public Bullet (String name) {

        super(name);
    }

    /**
     * this gets the value of the damage of the bullet
     */
    public int getBulletDmg() {
        
        return this.damage;
    }

    // OTHER METHODS //
    public void move(int x, int y) {
        //coord of this particular object is changed
        coord[0] = x;
        coord[1] = y;
    }

    public int getSpeed() {
        return speed;
    }
}