import java.awt.*;
import javax.swing.*;

/**
 * Frog class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog
{
    //Coordinates
    private int xLeft;
    private int yTop;
    
    //Image variables
    private ImageIcon icon;
    private Image img;
    /**
     * Default constructor for objects of class Dog
     */
    public Frog(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        //sets the image to a frog picture
        icon = new ImageIcon("frog.png");
        img = icon.getImage();
    }

    /**
     * Draws a frog object
     *
     * @post    Draws a frog object
     */
    public void draw(Graphics2D g2)
    {
        g2.drawImage(img,xLeft,yTop,null);
    }

}
