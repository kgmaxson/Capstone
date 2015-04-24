import java.awt.*;
import javax.swing.*;

/**
 * Displays GAME OVER if the game has ended
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver
{
    private int gameOver;

    /**
     * Default constructor for objects of class GameOver
     */
    public GameOver()
    {

    }

    /**
     * Displays the string GAME OVER if the game has ended
     *
     * @post    GAME OVER drawn
     */
    public void draw(Graphics2D g2)
    {
        //sets the font, color, and text of GAME OVER and drawn in the middle of the screen
        g2.setFont(new Font(null,Font.BOLD,80));
        g2.setColor(Color.RED);
        g2.drawString("GAME OVER",200,300);
    }

}
