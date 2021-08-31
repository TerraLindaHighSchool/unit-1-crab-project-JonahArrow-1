import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author: Jonah Arrow
 * 8/30/21
 */
public class Crab extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }

    // Turns crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    // Check for user key presses so the user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(1);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-1);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
        
    }
}



