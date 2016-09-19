/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 * 
 * The picture is supposed to represent an alien in a ship.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  James Emge
 * @version 2016.09.19
 */
public class Picture
{
    private Square top;
    private Square middle;
    private Square bottom;
    private Triangle cone;
    private Square exhaustInner;
    private Triangle exhaustLeft;
    private Triangle exhaustRight;
    private Circle porthole;
    private Person alien;
    private Circle eyeLeft;
    private Circle eyeRight;
    private Square cover;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        top = new Square();
        top.changeColor("black");
        top.moveHorizontal(-140);
        top.moveVertical(-60);
        top.makeVisible();
        
        middle = new Square();
        middle.changeColor("black");
        middle.moveHorizontal(-140);
        middle.makeVisible();

        cone = new Triangle();  
        cone.changeColor("black");
        cone.changeSize(60, 60);
        cone.moveHorizontal(-10);
        cone.moveVertical(-140);
        cone.makeVisible();

        porthole = new Circle();
        porthole.changeColor("blue");
        porthole.moveHorizontal(-55);
        porthole.moveVertical(-30);
        porthole.changeSize(50);
        porthole.makeVisible();
        
        alien = new Person();
        alien.changeColor("green");
        alien.moveHorizontal(-80);
        alien.moveVertical(-100);
        alien.makeVisible();
        
        cover = new Square();
        cover.changeColor("black");
        cover.moveHorizontal(-140);
        cover.moveVertical(-10);
        cover.makeVisible();
        
        eyeLeft = new Circle();
        eyeLeft.changeColor("black");
        eyeLeft.moveHorizontal(-36);
        eyeLeft.moveVertical(-12);
        eyeLeft.changeSize(5);
        eyeLeft.makeVisible();
        
        eyeRight = new Circle();
        eyeRight.changeColor("black");
        eyeRight.moveHorizontal(-30);
        eyeRight.moveVertical(-12);
        eyeRight.changeSize(5);
        eyeRight.makeVisible();
        
        bottom = new Square();
        bottom.changeColor("black");
        bottom.moveHorizontal(-140);
        bottom.moveVertical(60);
        bottom.makeVisible();
        
        exhaustInner = new Square();
        exhaustInner.changeColor("yellow");
        exhaustInner.moveHorizontal(-140);
        exhaustInner.moveVertical(120);
        exhaustInner.makeVisible();
        
        exhaustLeft = new Triangle();  
        exhaustLeft.changeColor("red");
        exhaustLeft.changeSize(60, 60);
        exhaustLeft.moveHorizontal(-40);
        exhaustLeft.moveVertical(100);
        exhaustLeft.makeVisible();
        
        exhaustRight = new Triangle();  
        exhaustRight.changeColor("red");
        exhaustRight.changeSize(60, 60);
        exhaustRight.moveHorizontal(20);
        exhaustRight.moveVertical(100);
        exhaustRight.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (top != null)   // only if it's painted already...
        {
            porthole.changeColor("white");
            alien.changeColor("black");
            eyeLeft.changeColor("white");
            eyeRight.changeColor("white");
            exhaustInner.changeColor("white");
            exhaustRight.changeColor("black");
            exhaustLeft.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (top != null)   // only if it's painted already...
        {
            porthole.changeColor("blue");
            alien.changeColor("green");
            eyeLeft.changeColor("black");
            eyeRight.changeColor("black");
            exhaustInner.changeColor("yellow");
            exhaustRight.changeColor("red");
            exhaustLeft.changeColor("red");
            cover.changeColor("black");
        }
    }
}
