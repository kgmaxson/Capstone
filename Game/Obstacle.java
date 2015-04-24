import java.awt.*;
import javax.swing.*;

/**
 * An obstacle that looks like a car
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle
{
    //Coordinates
    private int xLeft;
    private int yTop;
    //Image Variables
    private ImageIcon icon;
    private Image img;
    
    /**
     *Constructor for objects of class Obstacle
     */
    public Obstacle(int x, int y)
    {
        xLeft = x;
        yTop = y;
        //sets the image as a small car picture
        icon = new ImageIcon("car4.gif");
        img = icon.getImage();
    }

    /**
     * Draws the obstacle
     *
     * @post    Obstacle is drawn

     */
    public void draw(Graphics2D g2)
    {
        //draws the frog
        g2.drawImage(img,xLeft,yTop,null);
        
    }

}
