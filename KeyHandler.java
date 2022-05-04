import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, rightPressed, leftPressed = false;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    //this method runs **once** everytime key gets pressed
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //this converts keyevent e into numbered code corressponding to keys
        int keyCode = e.getKeyCode(); 


        if (keyCode == KeyEvent.VK_W){
            System.out.println(keyCode);
            upPressed = true;
        }
        if (keyCode == KeyEvent.VK_A){
            rightPressed = true;
        }
        if (keyCode == KeyEvent.VK_S){
            downPressed = true;
        }
        if (keyCode == KeyEvent.VK_D){
            leftPressed = true;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int keyCode = e.getKeyCode(); 

        if (keyCode == KeyEvent.VK_W){
            upPressed = false;
        }
        if (keyCode == KeyEvent.VK_A){
            rightPressed = false;
        }
        if (keyCode == KeyEvent.VK_S){
            downPressed = false;
        }
        if (keyCode == KeyEvent.VK_D){
            leftPressed = false;
        }
        
    }




}

