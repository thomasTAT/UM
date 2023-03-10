package ass;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.text.*;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param width  the width of the desired picture
	 * @param height the height of the desired picture
	 */
	public Picture(int width, int height) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	public void decreaseRed() {
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int value = 0;
		int index = 0;
		while (index < pixelArray.length) {
			pixel = pixelArray[index];
			value = pixel.getRed();
			value = (int) (value * 0.5);
			pixel.setRed(value);
			index = index + 1;
		}
	}

	public void decreaseBlue() {
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int value = 0;
		int index = 0;
		while (index < pixelArray.length) {
			pixel = pixelArray[index];
			value = pixel.getBlue();
			value = (int) (value * 0.5);
			pixel.setBlue(value);
			index = index + 1;
		}
	}

	public void decreaseGreen() {
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int value = 0;
		int index = 0;
		while (index < pixelArray.length) {
			pixel = pixelArray[index];
			value = pixel.getGreen();
			value = (int) (value * 0.5);
			pixel.setGreen(value);
			index = index + 1;
		}
	}

	public Picture scalingDown() {
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		Picture new_pic = new Picture(this.getWidth() / 4, this.getHeight() / 4);
		// loop through the columns
		for (int sourceX = 0, targetX = 0; sourceX < this.getWidth(); sourceX += 4, targetX++) {
			// loop through the rows
			for (int sourceY = 0, targetY = 0; sourceY < this.getHeight(); sourceY += 4, targetY++) {
				sourcePixel = this.getPixel(sourceX, sourceY);
				targetPixel = new_pic.getPixel(targetX, targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}
		}
		return new_pic;
	}

	public void scalingDown_collapse() {  
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		// loop through the columns
		for (int sourceX = 0, targetX = 0; sourceX < this.getWidth(); sourceX += 4, targetX++) {
			// loop through the rows
			for (int sourceY = 0, targetY = 0; sourceY < this.getHeight(); sourceY += 4, targetY++) {
				sourcePixel = this.getPixel(sourceX, sourceY);
				targetPixel = this.getPixel(targetX, targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}
		}
	}

	public void clearBlue() {
		Pixel[] pixelArray = this.getPixels();
		Pixel pixel = null;
		int index = 0;
		while (index < pixelArray.length) {
			pixel = pixelArray[index];
			pixel.setBlue(0);
			index++;
		}
	}

	public Picture rotate90Degree() {
		Picture newPic = new Picture(this.getHeight(), this.getWidth());
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		int targetX, targetY = 0;
		for (int sourceX = 0; sourceX < this.getWidth(); sourceX++) {
			for (int sourceY = 0; sourceY < this.getHeight(); sourceY++) {
				sourcePixel = this.getPixel(sourceX, sourceY);
				targetX = sourceY;
				targetY = this.getWidth() - 1 - sourceX;
				targetPixel = newPic.getPixel(targetX, targetY);
				targetPixel.setColor(sourcePixel.getColor());

			}

		}
		return newPic;
	}

	public void LeftRotation() {

		Picture sourcePicture = new Picture(this.getHeight());
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		int targetX, targetY = 0;
	
		// loop through the columns
		for (int sourceX = 0; sourceX < sourcePicture.getWidth(); sourceX++) {
			// loop through the rows
			for (int sourceY = 0; sourceY < sourcePicture.getHeight(); sourceY++) {
				// set the target pixel color to the source pixel color
				sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
				targetX = sourceY;
				targetY = sourcePicture.getWidth() - 1 - sourceX;
				targetPixel = this.getPixel(targetX,targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}
		}
	}

	public void copyPicture(Picture _pic) {
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		for (int sourceX = 0, targetX = 0; sourceX < _pic.getWidth(); sourceX++, targetX++) {
			// loop through the rows
			for (int sourceY = 0, targetY = 0; sourceY < _pic.getHeight(); sourceY++, targetY++) {
				sourcePixel = _pic.getPixel(sourceX, sourceY);
				targetPixel = this.getPixel(targetX, targetY);
				targetPixel.setColor(sourcePixel.getColor());
			}
		}
	}

	public Picture MirrorXaix() {
		int midpoint = this.getHeight() / 2;
		Picture picture = new Picture(this.getWidth(),this.getHeight());
		for (int x = 0; x < picture.getWidth(); x++) {
			for (int y = 0; y < midpoint; y++) {
				Pixel TopPixel = this.getPixel(x, y);
				Pixel BottomPixel = picture.getPixel(x, this.getHeight() - 1 - y);
				BottomPixel.setColor(TopPixel.getColor());
				
				BottomPixel = picture.getPixel(x, y);
				BottomPixel.setColor(TopPixel.getColor());
			}
		}
		return picture;
	}

	public Picture MirrorXaiy() {
		int midpoint = this.getWidth() / 2;
		Picture picture = new Picture(this.getWidth(),this.getHeight());
		for (int y = 0; y < picture.getHeight(); y++) {
			for (int x = 0; x < midpoint; x++) {
				Pixel leftPixel = this.getPixel(x, y);
				Pixel rightPixel = picture.getPixel(this.getWidth() - 1 - x, y);
				rightPixel.setColor(leftPixel.getColor());
				
				rightPixel = picture.getPixel(x, y);
				rightPixel.setColor(leftPixel.getColor());
			}
		}

		return picture;
	}

	public void collage(Picture _pic, int _x, int _y) {
		Pixel sourcePixel = null;
		Pixel targetPixel = null;

		for (int sourceX = 0, targetX = _x; sourceX < _pic.getWidth(); sourceX++, targetX++) {
			for (int sourceY = 0, targetY = _y; sourceY < _pic.getHeight(); sourceY++, targetY++) {
				targetPixel = this.getPixel(targetX, targetY);
				sourcePixel = _pic.getPixel(sourceX, sourceY);
				targetPixel.setColor(sourcePixel.getColor());
			}

		}

	}

} // end of class Picture, put all new methods before this
