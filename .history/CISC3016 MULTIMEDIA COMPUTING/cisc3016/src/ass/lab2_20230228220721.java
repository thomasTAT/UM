package ass;

public class lab2 {
	public static void main(String args[]) {
		String fName ="src/mediasources/grayMotorcycle.jpg";
		//pict.show();

		

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
		left_rotate = left_rotate.scalingDown();
		left_rotate = left_rotate.LeftRotation();
		left_rotate.decreaseGreen();
		left_rotate.show();

		Picture right_rotate = new Picture(fName);
		right_rotate = right_rotate.scalingDown();
		right_rotate = right_rotate.RightRotation();
		right_rotate.decreaseRed();
		right_rotate.show();

		Picture pict = new Picture(fName);

		
	}
}