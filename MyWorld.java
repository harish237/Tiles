import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 402, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        BlackTiles blacktiles1 = new BlackTiles();
        int pos = getRandom();
        addObject(blacktiles1, 25 * pos, 351);
        System.out.println(+pos*25);
        
        BlackTiles blacktiles2 = new BlackTiles();
        pos = getRandom();
        addObject(blacktiles2, 25 * pos, 251);
        System.out.println(+pos*25);
        
        BlackTiles blacktiles3 = new BlackTiles();
        pos = getRandom();
        addObject(blacktiles3, 25 * pos, 151);
        System.out.println(+pos*25);
        
        BlackTiles blacktiles4 = new BlackTiles();
        pos = getRandom();
        addObject(blacktiles4, 25 * pos, 51);
        System.out.println(+pos*25);
        
        BlackTiles blacktiles5 = new BlackTiles();
        pos = getRandom();
        blacktiles5.getImage().scale( 50, 1) ; 
        addObject(blacktiles5, 25 * pos, 0);
        System.out.println(+pos*25);
        System.out.println(+blacktiles5.getY());
        
        
        
        //BlackTiles blacktiles = blacktiles1.clones();
        //addObject(blacktiles, 50, 50);
        
        
        //white Tiles
        //1st Row
        /*WhiteTiles whitetiles11 = new WhiteTiles();
        pos = getRandom();
        addObject(whitetiles11, 25 * pos, 350);
        System.out.println(+pos*25);*/
        
        
    }
    
    public int getRandom() {
        int pos = Greenfoot.getRandomNumber(7)+1;
        if( pos % 2 == 0 ) {
            pos--;
        }
        return pos;
    }
}
