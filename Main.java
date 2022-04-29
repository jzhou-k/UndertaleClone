public class Main {
    public static void main(String[] args){
        System.out.println("This is where we run our main game and also do testing");
        CombatObject player = new CombatObject("patrick");
        Player player2 =  new Player("Julia");
        //? does bullet need to have a name? 
        Bullet bullet  = new Bullet("bullet", 10);

        player.printCoord();
        player2.printCoord();
        bullet.printCoord();

        player.move(12, 2);
        player2.move(2, 3);

        player.printCoord();
        player2.printCoord();
        bullet.printCoord();

    }
}
