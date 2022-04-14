package ie.tudublin;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import processing.core.PApplet;

public class BasicShapes  extends PApplet{

    public static void main(String[] args) {

  // Create a frame

  Frame frame = new Frame();

  // Add a component with a custom paint method

  frame.add(new CustomPaintComponent());

  // Display the frame

  int frameWidth = 800;

  int frameHeight = 800;

  frame.setSize(frameWidth, frameHeight);

  frame.setVisible(true);


    }

  /**
    * To draw on the screen, it is first necessary to subclass a Component 
    * and override its paint() method. The paint() method is automatically called 
    * by the windowing system whenever component's area needs to be repainted.
    */
    static class CustomPaintComponent extends Component {

  public void paint(Graphics g) {

    // Retrieve the graphics context; this object is used to paint shapes

    Graphics2D g2d = (Graphics2D)g;

    /**

* The coordinate system of a graphics context is such that the origin is at the 

* northwest corner and x-axis increases toward the right while the y-axis increases 

* toward the bottom.

*/

    int x = 0;

    int y = 0;

    int w = getSize().width-1;

    int h = getSize().height-1;

    Shape line = new Line2D.Float(x, y, w, h);

    Shape oval = new Ellipse2D.Float(x, y, w, h);

    Shape rectangle = new Rectangle2D.Float(x, y, w, h);

    Shape roundRectangle = new RoundRectangle2D.Float(x, y, w, h, w/2, h/2);

    // A start angle of 0 represents a 3 o'clock position, 90 represents a 12 o'clock position,

    // and -90 (or 270) represents a 6 o'clock position

    int startAngle = 45;

    int arcAngle = -60;

    Shape arc = new Arc2D.Float(x, y, w/2, h/2, startAngle, arcAngle, Arc2D.OPEN);

    g2d.draw(line);

    g2d.draw(oval);

    g2d.draw(rectangle);

    g2d.draw(roundRectangle);

    g2d.draw(arc);

  }


    }
    public void settings()
    {
        size(1024, 1000, P3D);
        //fullScreen(P3D, SPAN);
    }


}


