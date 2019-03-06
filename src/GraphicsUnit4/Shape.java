package GraphicsUnit4;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
            xPos = x;
            yPos = y;
            width = wid;
            height = ht;
            color = col;
            xSpeed = xSpd;
            ySpeed = ySpd;

            //finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getxPos(), getyPos(), width, height);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(getxPos(), getyPos(), width, height);
   }

   public void moveAndDraw(Graphics window)
   {
        setxPos(getxPos()+getxSpeed());
        setyPos(getyPos()+getySpeed());
        draw(window);
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
 
     /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
   public String toString()
   {
   	return getxPos()+" "+getyPos()+" "+width+" "+height+" "+color+" "+getxSpeed()+" "+getySpeed();
   }

 
}