

public class Main {
    public static void main(String[] args){
        System.out.println("This is where we run our main game and also do testing");
        CombatObject player = new Player("A");
        Player player2 =  new Player("B");
        //? does bullet need to have a name? 
        Bullet bullet  = new Bullet("bullet", 10);

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
