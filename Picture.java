/**
 * This image is meant to represent a person with a big head and a small body.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Tyler Friedberg
 * @version 2016.09.18
 * 
 * 
 */
public class Picture
{
    private Square leftIris;
    private Square rightIris;
    private Triangle nose;
    private Circle face;
    private Circle leftEye;
    private Circle rightEye;
    private Triangle leftEyebrow;
    private Triangle rightEyebrow;
    private Triangle hair1;
    private Triangle hair2;
    private Triangle hair3;
    private Person body;

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
        body = new Person();
        body.changeColor("beige");
        body.moveHorizontal(257);
        body.moveVertical(267);
        body.makeVisible();
        
        face = new Circle();
        face.changeColor("beige");
        face.moveHorizontal(100);
        face.moveVertical(-30);
        face.changeSize(300);
        face.makeVisible();
        
        leftEye = new Circle();
        leftEye.changeColor("white");
        leftEye.moveHorizontal(150);
        leftEye.moveVertical(100);
        leftEye.changeSize(80);
        leftEye.makeVisible();
        
        rightEye = new Circle();
        rightEye.changeColor("white");
        rightEye.moveHorizontal(300);
        rightEye.moveVertical(100);
        rightEye.changeSize(80);
        rightEye.makeVisible();
        
        leftIris = new Square();
        leftIris.changeColor("blue");
        leftIris.moveHorizontal(180);
        leftIris.moveVertical(140);
        leftIris.changeSize(30);
        leftIris.makeVisible();
        
        rightIris = new Square();
        rightIris.changeColor("blue");
        rightIris.moveHorizontal(330);
        rightIris.moveVertical(140);
        rightIris.changeSize(30);
        rightIris.makeVisible();

        nose = new Triangle();  
        nose.changeColor("brown2");
        nose.changeSize(100, 60);
        nose.moveHorizontal(270);
        nose.moveVertical(160);
        nose.makeVisible();
        
        leftEyebrow = new Triangle();
        leftEyebrow.changeColor("brown1");
        leftEyebrow.changeSize(20, 80);
        leftEyebrow.moveHorizontal(190);
        leftEyebrow.moveVertical(85);
        leftEyebrow.makeVisible();
        
        rightEyebrow = new Triangle();
        rightEyebrow.changeColor("brown1");
        rightEyebrow.changeSize(20, 80);
        rightEyebrow.moveHorizontal(340);
        rightEyebrow.moveVertical(85);
        rightEyebrow.makeVisible();
        
        hair1 = new Triangle();
        hair1.changeColor("brown3");
        hair1.changeSize(35, 45);
        hair1.moveHorizontal(235);
        hair1.moveVertical(-10);
        hair1.makeVisible();
        
        hair3 = new Triangle();
        hair3.changeColor("brown1");
        hair3.changeSize(35, 45);
        hair3.moveHorizontal(275);
        hair3.moveVertical(-10);
        hair3.makeVisible();
        
        hair2 = new Triangle();
        hair2.changeColor("brown2");
        hair2.changeSize(-35, -45);
        hair2.moveHorizontal(255);
        hair2.moveVertical(25);
        hair2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (body != null)   // only if it's painted already...
        {
            body.changeColor("black");
            face.changeColor("black");
            leftEye.changeColor("white");
            rightEye.changeColor("white");
            leftIris.changeColor("black");
            rightIris.changeColor("black");
            nose.changeColor("white");
            leftEyebrow.changeColor("white");
            rightEyebrow.changeColor("white");
            hair1.changeColor("white");
            hair2.changeColor("black");
            hair3.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (body != null)   // only if it's painted already...
        {
            body.changeColor("beige");
            face.changeColor("beige");
            leftEye.changeColor("white");
            rightEye.changeColor("white");
            leftIris.changeColor("blue");
            rightIris.changeColor("blue");
            nose.changeColor("brown2");
            leftEyebrow.changeColor("brown1");
            rightEyebrow.changeColor("brown1");
            hair1.changeColor("brown3");
            hair2.changeColor("brown2");
            hair3.changeColor("brown1");
    }
}
}
