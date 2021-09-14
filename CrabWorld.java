import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(256, 256, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Alien alien = new Alien();
        addObject(alien,14,14);
        Spaceship spaceship = new Spaceship();
        addObject(spaceship,64,117);
        spaceship.setLocation(77,244);
        alien.setLocation(92,49);
        alien.setLocation(24,24);
        alien.setLocation(15,20);
        alien.setLocation(17,17);
        Alien alien2 = new Alien();
        addObject(alien2,44,23);
        Alien alien3 = new Alien();
        addObject(alien3,64,23);
        Alien alien4 = new Alien();
        addObject(alien4,84,23);
        Alien alien5 = new Alien();
        addObject(alien5,104,23);
        Alien alien6 = new Alien();
        addObject(alien6,122,23);
        Alien alien7 = new Alien();
        addObject(alien7,142,21);
        Alien alien8 = new Alien();
        addObject(alien8,159,23);
        Alien alien9 = new Alien();
        addObject(alien9,174,23);
        Alien alien10 = new Alien();
        addObject(alien10,191,24);
        Alien alien11 = new Alien();
        addObject(alien11,206,24);
        Alien alien12 = new Alien();
        addObject(alien12,223,24);
        alien12.setLocation(226,20);
        alien11.setLocation(211,20);
        alien9.setLocation(177,21);
        alien8.setLocation(158,20);
        alien7.setLocation(136,24);
        alien8.setLocation(153,23);
        Alien2 alien22 = new Alien2();
        addObject(alien22,16,43);
        Alien2 alien23 = new Alien2();
        addObject(alien23,37,45);
        Alien2 alien24 = new Alien2();
        addObject(alien24,227,45);
        Alien2 alien25 = new Alien2();
        addObject(alien25,211,45);
        alien9.setLocation(176,26);
        alien10.setLocation(194,24);
        alien.setLocation(14,18);
        alien2.setLocation(36,20);
        alien3.setLocation(59,22);
        alien12.setLocation(235,23);
        alien11.setLocation(216,21);
        alien10.setLocation(191,20);
        alien10.setLocation(195,21);
        alien11.setLocation(214,20);
        alien9.setLocation(171,22);
        alien8.setLocation(157,20);
        alien22.setLocation(17,43);
        alien23.setLocation(36,44);
        alien3.setLocation(59,16);
        alien4.setLocation(74,18);
        alien5.setLocation(94,20);
        alien6.setLocation(116,21);
        alien7.setLocation(136,18);
        alien8.setLocation(156,21);
        alien7.setLocation(136,21);
        alien8.setLocation(152,23);
        spaceship.setLocation(121,244);
        alien3.setLocation(53,19);
        alien.setLocation(15,19);
        alien3.setLocation(53,18);
        alien4.setLocation(74,18);
        alien6.setLocation(108,23);
        alien6.setLocation(108,14);
        alien7.setLocation(129,15);
        alien8.setLocation(151,16);
        alien9.setLocation(168,18);
        alien10.setLocation(187,20);
        alien11.setLocation(207,16);
        alien12.setLocation(230,17);
        removeObject(alien22);
        removeObject(alien23);
        removeObject(alien25);
        removeObject(alien24);
        alien.setLocation(15,19);
        alien.setLocation(11,14);
        alien2.setLocation(33,14);
        alien3.setLocation(56,11);
        alien4.setLocation(69,12);
        alien5.setLocation(87,12);
        alien5.setLocation(88,11);
        alien6.setLocation(105,12);
        alien7.setLocation(122,16);
        alien8.setLocation(143,15);
        alien9.setLocation(163,14);
        alien10.setLocation(185,14);
        alien12.setLocation(229,16);
        Alien alien13 = new Alien();
        addObject(alien13,246,16);
        alien3.setLocation(51,10);
        alien2.setLocation(34,12);
        alien.setLocation(8,9);
        alien2.setLocation(29,8);
        alien7.setLocation(119,11);
        alien8.setLocation(136,11);
        alien7.setLocation(124,10);
        alien9.setLocation(157,13);
        alien10.setLocation(178,8);
        alien11.setLocation(194,8);
        alien12.setLocation(212,11);
        alien13.setLocation(232,9);
        alien7.setLocation(119,12);
        alien9.setLocation(149,8);
        alien10.setLocation(168,12);
        alien11.setLocation(189,12);
        alien11.setLocation(189,6);
        alien12.setLocation(207,12);
        alien12.setLocation(214,11);
        alien11.setLocation(188,13);
        alien9.setLocation(150,10);
        alien12.setLocation(206,10);
        alien13.setLocation(224,12);
        Alien alien14 = new Alien();
        addObject(alien14,244,12);
        alien.setLocation(8,9);
        alien.setLocation(11,11);
        alien2.setLocation(36,4);
        alien2.setLocation(34,7);
        alien2.setLocation(25,12);
        alien3.setLocation(47,12);
        alien3.setLocation(40,8);
        alien3.setLocation(48,8);
        Alien alien15 = new Alien();
        addObject(alien15,10,33);
        alien15.setLocation(17,31);
        Alien alien16 = new Alien();
        addObject(alien16,36,31);
        alien3.setLocation(49,10);
        Alien alien17 = new Alien();
        addObject(alien17,56,32);
        Alien alien18 = new Alien();
        addObject(alien18,77,32);
        Alien alien19 = new Alien();
        addObject(alien19,92,32);
        Alien alien20 = new Alien();
        addObject(alien20,110,32);
        Alien alien21 = new Alien();
        addObject(alien21,127,30);
        Alien alien26 = new Alien();
        addObject(alien26,144,30);
        Alien alien27 = new Alien();
        addObject(alien27,160,31);
        Alien alien28 = new Alien();
        addObject(alien28,176,31);
        Alien alien29 = new Alien();
        addObject(alien29,196,32);
        Alien alien30 = new Alien();
        addObject(alien30,216,31);
        Alien alien31 = new Alien();
        addObject(alien31,234,31);
        spaceship.setLocation(124,240);
        alien2.setLocation(32,8);
        Alien2 alien210 = new Alien2();
        addObject(alien210,28,59);
        Alien2 alien211 = new Alien2();
        addObject(alien211,61,59);
        Alien2 alien212 = new Alien2();
        addObject(alien212,228,55);
        Alien2 alien213 = new Alien2();
        addObject(alien213,192,56);
        alien212.setLocation(224,50);
        alien212.setLocation(228,56);
        EnemyBullet enemyBullet = new EnemyBullet();
        addObject(enemyBullet,6,217);
        EnemyBullet enemyBullet2 = new EnemyBullet();
        addObject(enemyBullet2,4,128);
        EnemyBullet enemyBullet3 = new EnemyBullet();
        addObject(enemyBullet3,224,248);
        EnemyBullet enemyBullet4 = new EnemyBullet();
        addObject(enemyBullet4,246,108);
        enemyBullet3.setLocation(153,80);
        enemyBullet3.setLocation(19,16);
        enemyBullet2.setLocation(64,135);
        enemyBullet3.setLocation(128,83);
        enemyBullet2.setLocation(115,82);
        enemyBullet4.setLocation(145,77);
        enemyBullet3.setLocation(128,84);
        enemyBullet.setLocation(101,77);
        EnemyBullet enemyBullet5 = new EnemyBullet();
        addObject(enemyBullet5,157,80);
        enemyBullet4.setLocation(140,80);
        enemyBullet5.setLocation(157,84);
        enemyBullet.setLocation(95,83);
        enemyBullet2.setLocation(109,84);
        enemyBullet4.setLocation(141,83);
        enemyBullet5.setLocation(167,81);
        enemyBullet4.setLocation(144,84);
        enemyBullet.setLocation(81,81);
        enemyBullet4.setLocation(147,84);
        enemyBullet5.setLocation(161,83);
        enemyBullet.setLocation(85,78);
        enemyBullet.setLocation(88,88);
        enemyBullet.setLocation(84,80);
        enemyBullet.setLocation(89,86);
    }
}