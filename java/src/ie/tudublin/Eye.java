package ie.tudublin;

import processing.core.PApplet;

public class Eye extends PApplet
{

    public void settings()
    {
        size(500, 500);
    }

    public void setup() {
        colorMode(RGB);
        background(0);
        
    }
    
    public void draw()
    {    stroke(255);
        background(255,0,0); //greyscale
        line(10,10,200,200); //x1, y1, x2, y2
        circle (200,250,50); //cx,cy, r
        ellipse(50,200,90,200);//cx,cy,w,h

        rectMode(CENTER);
        rect(300,20,100,20);//tlx,tly,w,h

        rectMode(CORNER);
        rect(300,20,100,20);//tlx,tly,w,h

        point(20,300);//x,y

        triangle(10,400,50,450,300,200);

    }
}