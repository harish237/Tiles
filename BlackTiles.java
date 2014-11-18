import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BlackTiles extends Tiles
{
    private static final int SIZE = 3;
    //private BlackTiles
    public int flag = 0;
    static public int flag1 = 0;
    public int pos;
    public BlackTiles() {
       GreenfootImage image = getImage() ;
       image.scale( 50, 100 ) ;  
    }
    /*public void act() 
    {
        setLocation(getX(), getY()+speed);
        //System.out.println(getY());
        if( getY() == 400 ) {
            scale += speed + 1;
            getImage().scale( 50, 100 - scale ) ; 
        }
        if( scale == 98 ) {
            pos = Greenfoot.getRandomNumber(7)+1;
            if( pos % 2 == 0 ) { 
                pos--;
            }
            setLocation(25 * pos, 0);
            scale = -2;
            flag = 1;
            System.out.println(scale);
        }
        if(  getImage().getHeight() <= 100 && flag == 1 ) {
            //System.out.println("----> Width" + getImage().getWidth());
            System.out.println("----> Height" + getImage().getHeight());
            getImage().scale( 50, getImage().getHeight() + speed + 1 ) ; 
            //scale += speed + 1;
            System.out.println("----> Speed" + speed);
            System.out.println("----> Scale" + scale);
        }
    }  
    /*public BlackTiles clones() {
        return clone();
    }*/
    public void act() 
    {
        setLocation(getX(), getY()+speed);
        //System.out.println(getY());
        if( getY() == 401 ) {
            scale += speed + 1;
            getImage().scale( 50, 100 - scale ) ; 
        }
        if( scale == 98 ) {
            pos = Greenfoot.getRandomNumber(7)+1;
            if( pos % 2 == 0 ) { 
                pos--;
            }
            setLocation(25 * pos, 0);
            //getImage().scale( 50, 50 ) ;
            System.out.println("----> Y-axis" + getY());
            scale = -2;
            flag = 1;
            //System.out.println(scale);
        }
        if(  getImage().getHeight() <= 100 && flag == 1 ) {
            //System.out.println("----> Width" + getImage().getWidth());
            //System.out.println("----> Height" + getImage().getHeight());
            getImage().scale( 50, getImage().getHeight() + speed + 1) ; 
            setLocation(getX(), getY() - 1);
            //scale += speed + 1;
            //System.out.println("----> Speed" + speed);
            //System.out.println("----> Scale" + scale);
        }
        if( getImage().getHeight() <= 100 && flag1 == 0 ) {
            getImage().scale( 50, getImage().getHeight() + speed + 1) ; 
            setLocation(getX(), getY() - 1);
            if(getImage().getHeight() == 100 )
                flag1 = 1;
        }
    } 
}
