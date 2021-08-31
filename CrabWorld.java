import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,77,59);
        Worm worm = new Worm();
        addObject(worm,408,73);
        Worm worm2 = new Worm();
        addObject(worm2,74,198);
        Worm worm3 = new Worm();
        addObject(worm3,464,375);
        Worm worm4 = new Worm();
        addObject(worm4,63,366);
        Worm worm5 = new Worm();
        addObject(worm5,216,460);
        Worm worm6 = new Worm();
        addObject(worm6,320,275);
        Worm worm7 = new Worm();
        addObject(worm7,216,28);
        Worm worm8 = new Worm();
        addObject(worm8,261,147);
        worm8.setLocation(308,111);
        worm6.setLocation(432,162);
        worm8.setLocation(63,280);
        Lobster lobster = new Lobster();
        addObject(lobster,358,377);
    }
}