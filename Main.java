

public class Main {
    public static void main(String[] args){
<<<<<<< Updated upstream
        System.out.println("This is where we run our main game and also do testing");
        CombatObject player = new Player("A");
        Player player2 =  new Player("B");
        //? does bullet need to have a name? 
        Bullet bullet  = new Bullet("bullet", 10);
=======
        System.out.println("Our code demo");
        
        Player playerDemo = new Player("PAT");
        Consumable water = new Consumable("water", 1);
        Weapon stick = new Weapon("stick", 1);
        Armor tutu = new Armor("tutu", 20);
        Bullet bullet = new Bullet ("bullet");

        
        
        playerDemo.takeDamage(bullet);          
        playerDemo.pickUpItem(tutu);
        playerDemo.pickUpItem(stick);
        playerDemo.equipArmor(tutu);
        playerDemo.equipWeapon(stick);

        //System.out.println(playerDemo.getHealth());

        playerDemo.useConsumable(water);
        //System.out.println(playerDemo.getHealth());
>>>>>>> Stashed changes

        player.printCoord();
        bullet.printCoord();

        player.move(12, 2);
        bullet.move(1, 2);
        
        player.printCoord();
        bullet.printCoord();

        System.out.println(player2.checkDeath());
        player2.takeDamage(bullet.getBulletDmg());
        System.out.println(player2.getHealth());
        player2.takeDamage(15);
        System.out.println(player2.checkDeath());
        System.out.println(player2.getHealth());
    

    }
}
