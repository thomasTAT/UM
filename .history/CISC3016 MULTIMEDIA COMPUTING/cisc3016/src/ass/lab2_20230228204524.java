package ass;

public class lab2 {
	public static void main(String args[]) {
		String fName ="src/mediasources/grayMotorcycle.jpg";
		Picture pict = new Picture(fName);
		//pict.show();
		
		Picture pict_collapse = new Picture(fName);
		pict_collapse.scalingDown_collapse();
		//pict_collapse.show();
		
		

		Picture Mirrorx = new Picture(fName);
		Mirrorx = Mirrorx.scalingDown();
		Mirrorx = Mirrorx.MirrorXaix();
		Mirrorx.decreaseRed();
		Mirrorx.show();
		
		Picture Mirrory = new Picture(fName);
		Mirrory = Mirrory.scalingDown();
		Mirrory.decreaseBlue();
		Mirrory = Mirrory.MirrorXaiy();
		Mirrory.show();
		
		Picture left_rotate = new Picture(fName);
		left_rotate = left_rotate.rotate90Degree();
		show.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}