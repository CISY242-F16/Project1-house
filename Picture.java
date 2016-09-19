/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Triangle tent;
    private Triangle open;
    private Square ground;
    private Circle manaout;
    private Circle mana;
    private Circle healthout;
    private Circle health;
    private Square bar1;
    private Square bar2;
    private Square bar3;
    private Square bar4;
    private Square bar5;
    private Square item1;
    private Square item2;
    private Square item3;
    private Person player;
    private Person wizard;
    private Triangle hat;
    private Square quest1;
    private Square quest2;
    private Circle quest3;

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
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveHorizontal(-350);
        ground.moveVertical(-150);
        ground.changeSize(1000);
        ground.makeVisible();       

        tent = new Triangle();  
        tent.changeColor("yellow");
        tent.changeSize(100, 180);
        tent.moveHorizontal(-80);
        tent.moveVertical(-100);
        tent.makeVisible();
        
        open = new Triangle();
        open.changeColor("black");
        open.changeSize(60,20);
        open.moveHorizontal(-80);
        open.moveVertical(-60);
        open.makeVisible();
        
        bar1 = new Square();
        bar1.changeColor("black");
        bar1.moveHorizontal(-260);
        bar1.moveVertical(110);
        bar1.changeSize(80);
        bar1.makeVisible();
        
        bar2 = new Square();
        bar2.changeColor("black");
        bar2.moveHorizontal(-180);
        bar2.moveVertical(110);
        bar2.changeSize(80);
        bar2.makeVisible();
        
        bar3 = new Square();
        bar3.changeColor("black");
        bar3.moveHorizontal(-100);
        bar3.moveVertical(110);
        bar3.changeSize(80);
        bar3.makeVisible();
        
        bar4 = new Square();
        bar4.changeColor("black");
        bar4.moveHorizontal(-20);
        bar4.moveVertical(110);
        bar4.changeSize(80);
        bar4.makeVisible();
        
        bar5 = new Square();
        bar5.changeColor("black");
        bar5.moveHorizontal(60);
        bar5.moveVertical(110);
        bar5.changeSize(80);
        bar5.makeVisible();
        
        item1 = new Square();
        item1.changeColor("red");
        item1.moveHorizontal(-40);
        item1.moveVertical(125);
        item1.changeSize(40);
        item1.makeVisible();
        
        item2 = new Square();
        item2.changeColor("blue");
        item2.moveHorizontal(20);
        item2.moveVertical(125);
        item2.changeSize(40);
        item2.makeVisible();
        
        item3 = new Square();
        item3.changeColor("white");
        item3.moveHorizontal(-100);
        item3.moveVertical(125);
        item3.changeSize(40);
        item3.makeVisible();
        
        healthout = new Circle();
        healthout.changeColor("black");
        healthout.moveHorizontal(-270);
        healthout.moveVertical(90);
        healthout.changeSize(145);
        healthout.makeVisible();
        
        health = new Circle();
        health.changeColor("red");
        health.moveHorizontal(-260);
        health.moveVertical(100);
        health.changeSize(125);
        health.makeVisible();
        
        manaout = new Circle();
        manaout.changeColor("black");
        manaout.moveHorizontal(160);
        manaout.moveVertical(90);
        manaout.changeSize(145);
        manaout.makeVisible();
        
        mana = new Circle();
        mana.changeColor("blue");
        mana.moveHorizontal(170);
        mana.moveVertical(100);
        mana.changeSize(125);
        mana.makeVisible();
        
        
        player = new Person();
        player.changeColor("black");
        player.moveHorizontal(80);
        player.moveVertical(-30);
        player.changeSize(60, 30);
        player.makeVisible();
        
        wizard = new Person();
        wizard.changeColor("magenta");
        wizard.moveHorizontal(-70);
        wizard.moveVertical(-50);
        wizard.changeSize(60, 30);
        wizard.makeVisible();
        
        hat = new Triangle();
        hat.changeColor("magenta");
        hat.changeSize(40,30);
        hat.moveHorizontal(0);
        hat.moveVertical(-50);
        hat.makeVisible();
        
        quest1 = new Square();
        quest1.changeColor("red");
        quest1.changeSize(15);
        quest1.moveHorizontal(-108);
        quest1.moveVertical(-80);
        quest1.makeVisible();
        
        quest2 = new Square();
        quest2.changeColor("red");
        quest2.changeSize(13);
        quest2.moveHorizontal(-107);
        quest2.moveVertical(-65);
        quest2.makeVisible();
        
        quest3 = new Circle();
        quest3.changeColor("red");
        quest3.changeSize(15);
        quest3.moveHorizontal(-29);
        quest3.moveVertical(-15);
        quest3.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (tent != null)   // only if it's painted already...
        {
            ground.changeColor("white");
            bar1.changeColor("black");
            bar2.changeColor("black");
            bar3.changeColor("black");
            bar4.changeColor("black");
            bar5.changeColor("black");
            tent.changeColor("black");
            open.changeColor("white");
            manaout.changeColor("black");
            mana.changeColor("white");
            healthout.changeColor("black");
            health.changeColor("white");
            item1.changeColor("white");
            item2.changeColor("white");
            item3.changeColor("white");
            player.changeColor("black");
            wizard.changeColor("black");
            hat.changeColor("black");
            quest1.changeColor("black");
            quest2.changeColor("black");
            quest3.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (tent != null)   // only if it's painted already...
        {
            ground.changeColor("green");
            bar1.changeColor("black");
            bar2.changeColor("black");
            bar3.changeColor("black");
            bar4.changeColor("black");
            bar5.changeColor("black");
            tent.changeColor("yellow");
            open.changeColor("black");
            manaout.changeColor("black");
            mana.changeColor("blue");
            healthout.changeColor("black");
            health.changeColor("red");
            item1.changeColor("red");
            item2.changeColor("blue");
            item3.changeColor("white");
            player.changeColor("black");
            wizard.changeColor("magenta");
            hat.changeColor("magenta");
            quest1.changeColor("red");
            quest2.changeColor("red");
            quest3.changeColor("red");
        }
    }
}
