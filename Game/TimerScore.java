import java.awt.*;
import javax.swing.*;

/**
 * A class that displays the score in the top left corner
 * 
 * @author Kevin Maxson
 * @version 4/24/15
 */
public class TimerScore
{
    //score variable
    private int score;
    

    /**
     * Default constructor for objects of class Timer
     */
    public TimerScore()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     * @post    score displayed
     * @param    Graphics2D
     */
    public void draw(Graphics2D g2)
    {
        //Created a background rectangle to inlay the score
        Rectangle blank = new Rectangle(6,4,180,32);
        g2.setColor(Color.BLACK);
        g2.fill(blank);
        g2.draw(blank);
        
        //Creates and displays the score
        g2.setFont(new Font(null, Font.BOLD,30));
        g2.setColor(Color.RED);
        g2.drawString("Score:"+score,10,30);
        
        
        
    }

    /**
     * Increments the score
     *
     * @post    score is incremented by 1

     */
    public void update()
    {
        score++;
    }
    
    
}
