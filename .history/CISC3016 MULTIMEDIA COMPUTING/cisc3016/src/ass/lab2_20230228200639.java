package ass;

public class lab2 {
	public static void main(String args[]) {
		String fName ="src/mediasources/grayMotorcycle.jpg";
		Picture pict = new Picture(fName);
		//pict.show();
		
		Picture pict_collapse = new Picture(fName);
		pict_collapse.scalingDown_collapse();
		//pict_collapse.show();
		
		
		Picture scale_down1 = pict.scalingDown();
		scale_down1.decreaseRed();
		scale_down1.show();

		Picture Mirrorx = new Picture(fName);
		Mirrorx = Mirrorx.MirrorXaix();
		Mirrorx.show();
		
		Picture Mirror = new Picture(fName);
		Mirrorx = Mirrorx.MirrorXaix();
		Mirrorx.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}