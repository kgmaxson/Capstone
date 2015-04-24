import java.awt.*;

/**
 * Background class
 * 
 * @author Kevin Maxson
 * @version (a version number or a date)
 */
public class Background
{

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        
    }

    /**
     * Creates a rectangle filled with a gradient as the background
     * It is the size of the window
     *
     * @post    background created
     */
    public void draw(Graphics2D g2)
    {
        //Creates a rectangle the size of the window
        //Sets the color to a white blue gradient and fills
        Rectangle background = new Rectangle(0,0,800,600);
        GradientPaint gp = new GradientPaint(0,0,Color.WHITE, 0,600,Color.BLUE);
        g2.setPaint(gp);
        g2.fillRect(0,0,800,600);
    }

}
