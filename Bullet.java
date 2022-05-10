public class Bullet extends GameObject {

    /** this is the damage of the bullet */
    private int damage;

    /** this is the speed of the bullet */
    private int speed;

    /**
     * this is the constructor for Bullet
     * @param name - this is the name of the Bullet
     * @param damage - this is the damage of the bullet
     * @param speed - this is the speed of the bullet
     */
    public Bullet (String name, int damage, int speed) {

        super(name);
        this.damage = 5;
        this.speed = 3;
    }

    /**
     * this gets the value of the damage of the bullet
     */
    public int getBulletDmg(){
        
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