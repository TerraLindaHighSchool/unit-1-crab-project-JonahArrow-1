import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Evil lobster enemy.
 * 
 * @author Jonah Arrow
 * @version (8-31-21)
 */
public class Lobster extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
    }

    // Turns lobster at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}