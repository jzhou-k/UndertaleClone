public class Bullet extends GameObject {

    /** this is the damage of the bullet */
    private int damage = 5;

    /** this is the speed of the bullet */
    private int speed = 3;
    

    /**
     * this is the constructor for Bullet
     * @param name - this is the name of the Bullet
     */
    public Bullet (String name) {

        super(name);
    }

    /** ACCESSORS */

    /**
     * this gets the value of the damage of the bullet
     */
    public int getBulletDmg() {
        
        return this.damage;
    }
    
    /**
     * this gets the value of the speed of the bullet
     */
    public int getSpeed() {
        return this.speed;
    }

    /** MUTATORS */

    /**
     * this is the settor of the bullet's new damage
     * @param newDamage - this is the new damage of the bullet
     */
    public void setDamage (int newDamage) {

        this.damage = newDamage;
    }

    /**
     * this is the settor of the bullet's new speed
     * @param newSpeed - this is the new speed of the bullet
     */
    public void setSpeed (int newSpeed) {

        this.speed = newSpeed;
    }

    // OTHER METHODS //
    
    /**
     * this is the method to determine to position of the bullet 
     * @param x - the x intercept position
     * @param y - the y intercept position
     */
    public void move(int x, int y) {
        //coord of this particular object is changed
        coord[0] = x;
        coord[1] = y;
    }
}
