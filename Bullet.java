import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Bullet moves to the top of the screen
        setRotation(-90);
        move(10);
        bulletDestroy();
    }

    //Bullet destroying on contact
    private void bulletDestroy()
    {
        if(isTouching(Alien.class) || isTouching(Alien2.class) || isAtEdge())
        {
            removeTouching(Aliens.class);
            getWorld().removeObject(this);
        }
    }
}
