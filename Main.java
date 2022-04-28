public class Main {
    public static void main(String[] args){
        System.out.println("This is where we run our main game and also do testing");
        CombatObject player = new CombatObject("patrick");

        player.move(12, 2);
        int[] playerCoord = player.currentCoord();
        System.out.println(playerCoord[0] + ","  + playerCoord[1]);

    }
}
