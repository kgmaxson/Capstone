import java.awt.*;
import javax.swing.*;

/**
 * Displays and increments the level of the game
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel
{
    //countdown and level variables
    private int score2;
    private int level;
    

    /**
     * Default constructor for objects of class Timer
     */
    public NextLevel()
    {

    }

    /**
     * Draws the level and increase speed strings
     *
     * @post    level number and increase speed drawn
     */
    public void draw(Graphics2D g2)
    {
        //draws the level number and the increase speed countdown in the middle of the screen
        //sets font and color
        g2.setFont(new Font(null, Font.BOLD,30));
        g2.setColor(Color.RED);
        g2.drawString("Level "+level,340,300);
        g2.drawString("Increase Speed: "+score2,280,350);
        
    }

    /**
     * Decrements the countdown
     *
     * @post    Countdown decremented
     */
    public void update()
    {
        score2--;
    }
    
    /**
     * Countdown is reset to 4 and the game level is incremented
     *
     * @post    countdown is reset and the game level is incremented

     */
    public void reset()
    {
        score2=4;
        level++;
    }
}
