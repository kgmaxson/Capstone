import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

/**
 * Component class that creates the game
 * 
 * @author Kevin Maxson
 * @version 4/24/15
 */
public class GameComponent extends JComponent implements ActionListener
{
    //Create a timer with 1 frame every 25ms
    Timer time = new Timer(25, this);
    
    //An array of x coordinates for the obstacles and rectangles
    int[] xArray = {200, 0, 625, 550,75,100,625,250,325,650,825,325,25,325,75,650,725,25,250,625,550,125,725,775};
    
    //An array of rectangles that correspond to each obstacle
    private Rectangle[] recArray = new Rectangle[24];
    
    //An array of obstacles
    private Obstacle[] obstacleArray = new Obstacle[24];


    private Rectangle recF;
    private Background background1;
    
    //initial x and y values of the frog
    public static int xf = 400;
    public static int yf = 300;
    
    //initial velocity
    public static int velocityx=3;


    private TimerScore score;
    private NextLevel score2;
    private GameOver gameOver;
    public static int count = 0;
    
    public GameComponent()
    {
        recF = new Rectangle(xf, yf, 25,25);
        score = new TimerScore();
        score2 = new NextLevel();
        score2.reset();
        gameOver = new GameOver();
        background1 = new Background();
    }

    /**
     * Creates and draws the rectangles, obstacles, frog, and background
     *
     * @post    objects are created and drawn, repaints
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //Creates 24 rectangle and obstacle objects
        for(int i = 0; i < 24; i ++)
        {
            recArray[i] = new Rectangle(xArray[i], 25*i, 36, 22);
            obstacleArray[i] = new Obstacle(xArray[i], 25*i);
        }

        //initialize frog and corresponding rectangle
        Frog frog1 = new Frog(xf,yf);
        recF.setLocation(xf,yf);
        
        //draws background, rectangles, and objects
        background1.draw(g2);
        g2.draw(recF);
        
        for(int i = 0; i < 24; i ++)
        {
            g2.draw(recArray[i]);
            obstacleArray[i].draw(g2);
        }
        
        //draws the countdown and next level between 6 and 9 seconds
        if (count>=240 && count<=360)
        {
            score2.draw(g2);
        }
        
        //draws GAME OVER if the velocity is 0
        if (velocityx==0)        
        {
            gameOver.draw(g2);
        }
        
        //draws the frog and score above the other objects
        frog1.draw(g2);
        score.draw(g2);
        
        //starts the time
        time.start();
    }


    /**
     * Method that runs each frame.  It changes the x coordinates of the rectangles and obstacles. Changes the next level class. Increments the timer,
     *
     * @post    obstacles moved, score updated, next level condition checked
     */
    public void actionPerformed(ActionEvent e)
    {
        //keeps track of the number of frames
        count++;
        
        //while the game is not over, update the score for each frame
        if( velocityx!=0)
        {
            score.update();
        }
        
        //every 6 seconds, display the speed increase and increase the speed by 2 after 9 seconds
        //reset the speed change
        if (velocityx!=0 && count%40==0 && count>=240 && velocityx!=0)
        {
            score2.update();
            if(count >360)
            {
                count = 0;
                velocityx+=2;
                score2.reset();
            }
            
        }
        
        //change position of the obstacles. If the row is even move the obstacles and rectangles right, if the row is even move left.
        //wrap the position of the objects if they reach the end of the screen
        for(int i = 0; i < 24; i++)
        {
            if( i % 2 ==0)
            {
                xArray[i] += velocityx;
                xArray[i] = xArray[i] % 800;
            }
            else
            {
                xArray[i] -= velocityx;
                if(xArray[i]<0)
                {
                    xArray[i] += 800;
                }
            }
        }

        //collision detection
        //if the frog rectangle intersects any of the rectangles corresponding with an obstacle, game ends
        for(int i = 0; i<24; i++)
        {
            if(recArray[i]!=null && recF!=null){
                if (recF.intersects(recArray[i]))            
                {
                    velocityx = 0;
                }

            }
        }
        repaint();
    }

}
