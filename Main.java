import javax.swing.JFrame;


public class Main {
    public static void main(String[] args){



        Player playerDemo = new Player("PAT");
        Consumable water = new Consumable("water", 1);
        Weapon stick = new Weapon("stick", 1);
        Armor tutu = new Armor("tutu", 20);
        playerDemo.takeDamage(15);
        System.out.println(playerDemo.getHealth());


        playerDemo.useConsumable(water);
        System.out.println(playerDemo.getHealth());



        /** 
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setResizable(false);
        window.setTitle("Undertale");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); //equivolent of adding a normal jpanel 

        window.pack();
        gamePanel.startGamePanel();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        */

        System.out.println("demo");
        
    

    }
}
