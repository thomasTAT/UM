package lab1;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.text.*;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  // 一下为修改
  public void copyFlowerSmaller()
{
   Picture flowerPicture = new Picture(FileChooser.getMediaPath("passionFlower.jpg"));
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   // loop through the columns
   for (int sourceX = 0, targetX=0; sourceX < flowerPicture.getWidth(); sourceX+=2, targetX++)
   {
       // loop through the rows
       for (int sourceY=0, targetY=0; sourceY < flowerPicture.getHeight(); sourceY+=2, targetY++)
       {
           sourcePixel = flowerPicture.getPixel(sourceX,sourceY);
           targetPixel = this.getPixel(targetX,targetY);
           targetPixel.setColor(sourcePixel.getColor());
       }
   }
}
  
} // end of class Picture, put all new methods before this
 