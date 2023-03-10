package lab1;

public class assignment1 {
	
	public static void main(String[] args) {

		String path = "src/mediasources/grayMotorcycle.jpg";
		Picture original_picture = new Picture(path);
		int width = original_picture.getWidth();
		int height = original_picture.getHeight();
		
		Picture new_picture = new Picture(width+40,height);
		new_picture.collage(original_picture,20,0);
		
		Picture scale_down1 = original_picture.scalingDown();
		scale_down1.decreaseRed();
		
		
		Picture scale_down2 = original_picture.scalingDown();
		scale_down2.decreaseBlue();

		Picture scale_down3 = original_picture.scalingDown();
		scale_down3.decreaseGreen();

		Picture scale_down4 = original_picture.scalingDown();
		scale_down4.decreaseRed();
		scale_down2.decreaseBlue();

		
		new_picture.collage(scale_down1, 0, height - scale_down1.getHeight());
		new_picture.collage(scale_down2, scale_down1.getWidth() + 10, height - scale_down1.getHeight());
		new_picture.collage(scale_down3, scale_down1.getWidth() * 2 + 20, height - scale_down1.getHeight());
		new_picture.collage(scale_down4.rotate90Degree(), scale_down1.getWidth() * 3 + 30, height - scale_down1.getHeight()-50);


		
		
		Picture new_picture_mirror = new Picture(width+40,height*2);
		new_picture_mirror.collage(new_picture, 0, 0);
		new_picture_mirror.collage(new_picture.MirrorXaix(), 0, height);
		original_picture.show();
		new_picture_mirror.show();

		original_picture.write("original_picture.jpg");
		new_picture_mirror.write("new_picture.jpg");
		
	}


}
