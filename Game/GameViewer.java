import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
/**
 * Main method runs the game
 * 
 * @author Kevin Maxson
 * @version 4/24/15
 */
public class GameViewer implements KeyListener
{

    /**
     * Viewer class
     */
    
    public GameViewer(){
        //Creates and sets the size, name, and exit of the frame
        JFrame frame = new JFrame();
        frame.setSize(800 , 600);
        frame.setTitle("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        //frame contains the GameComponent
        GameComponent component = new GameComponent();
        frame.add(component);
        
        //make the frame visible which will result in the paintComponent method being invoked on the
        //component.
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        new GameViewer();
    }
    
      public void keyPressed(KeyEvent e)
    {
        //changes the position of the frog and the corresponding frog rectangle based on arrow keys being pressed
        //frog does not change position if it is near the edge of the window
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
        {
            if (GameComponent.xf>10)
                {GameComponent.xf -= GameComponent.velocityx*3;}
        }
        if (key == KeyEvent.VK_UP)
        {
            if (GameComponent.yf>10)
                {GameComponent.yf -= GameComponent.velocityx*3;}
        }
        if (key == KeyEvent.VK_RIGHT)
        {
            if (GameComponent.xf<740)
                {GameComponent.xf += GameComponent.velocityx*3;}
        }
        if (key == KeyEvent.VK_DOWN)
        {
            if (GameComponent.yf<525)
                {GameComponent.yf += GameComponent.velocityx*3;}
        }
    }
    
    public void keyReleased(KeyEvent e)
    {

    }
    
    public void keyTyped(KeyEvent e)
    {
        
    }
    
}
