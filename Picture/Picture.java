
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture extends CopyOfSquare
{
    private Square wall;
    private CopyOfSquare door;
    private CopyOfSquare door2;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;
    private Triangle tree;
    private Square trunk;
    private Circle doorKnob;
    private CopyOfSquare window;
    private CopyOfSquare window2;
    private CopyOfSquare window3;
    private CopyOfSquare window4;
    private Square grass;
    private CopyOfSquare garage;
    private Square driveWay;

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
        wall = new Square();
        wall.changeColor("lightRed");
        wall.moveVertical(100);
        wall.changeSize(220);
        wall.makeVisible();

        door = new CopyOfSquare();
        door.changeColor("pale");
        door.changeSize(40);
        door.moveHorizontal(90);
        door.moveVertical(130);
        door.makeVisible();
        
        door2 = new CopyOfSquare();
        door2.changeColor("pale");
        door2.changeSize(40);
        door2.moveHorizontal(90);
        door2.moveVertical(150);
        door2.makeVisible();
        
        doorKnob = new Circle();
        doorKnob.changeColor("black");
        doorKnob.changeSize(10);
        doorKnob.moveHorizontal(135);
        doorKnob.moveVertical(150);
        doorKnob.makeVisible();
        
        window = new CopyOfSquare();
        window.changeColor("white");
        window.changeSize(25);
        window.moveHorizontal(28);
        window.moveVertical(120);
        window.makeVisible();
        
        window2 = new CopyOfSquare();
        window2.changeColor("white");
        window2.changeSize(25);
        window2.moveHorizontal(56);
        window2.moveVertical(120);
        window2.makeVisible();
        
        window3 = new CopyOfSquare();
        window3.changeColor("white");
        window3.changeSize(25);
        window3.moveHorizontal(56);
        window3.moveVertical(148);
        window3.makeVisible();
        
        window4 = new CopyOfSquare();
        window4.changeColor("white");
        window4.changeSize(25);
        window4.moveHorizontal(28);
        window4.moveVertical(148);
        window4.makeVisible();


        roof = new Triangle();
        roof.changeColor("lightGrey");
        roof.changeSize(50, 120);
        roof.moveHorizontal(66);
        roof.moveVertical(85);
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("lightGrey");
        roof2.changeSize(50, 120);
        roof2.moveHorizontal(169);
        roof2.moveVertical(85);
        roof2.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(140, 50);
        tree.moveHorizontal(-20);
        tree.moveVertical(30);
        tree.makeVisible();       
        
        trunk = new Square();
        trunk.changeColor("brown");
        trunk.changeSize(10);
        trunk.moveHorizontal(-33);
        trunk.moveVertical(135);
        trunk.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(220);
        sun.moveVertical(-100);
        sun.changeSize(100);
        sun.makeVisible();
        
        grass = new Square();
        grass.changeColor("darkGreen");
        grass.moveVertical(190);
        grass.changeSize(220);
        grass.makeVisible();
        
        garage = new CopyOfSquare();
        garage.changeColor("darkGrey");
        garage.changeSize(60);
        garage.moveHorizontal(150);
        garage.moveVertical(130);
        garage.makeVisible();
        
        driveWay = new Square();
        driveWay.changeColor("lightBrown");
        driveWay.changeSize(60);
        driveWay.moveHorizontal(150);
        driveWay.moveVertical(190);
        driveWay.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            door.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            door.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
