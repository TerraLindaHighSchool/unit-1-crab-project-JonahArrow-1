import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author: Jonah Arrow
 * 8/30/21
 */
public class Spaceship extends Actor
{
    // This method repeats the following actions
    
    private int canShoot;
    
    public void act()
    {
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
            move(3);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        
        // Shoots pellets
        if(Greenfoot.isKeyDown("up"))
        {
            if(canShoot == 45)
            {
                getWorld().addObject(new Bullet(),getX(),getY());
                canShoot = 0;
            }
            canShoot++;
        }
    }
    
    // Check for collisions with other objects
    private void onCollision()
    {
        if(isTouching(EnemyBullet.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}



