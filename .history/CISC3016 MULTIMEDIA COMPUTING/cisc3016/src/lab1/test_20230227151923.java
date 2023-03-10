package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "butterfly1.jpg";
        Picture picture = new Picture(fname);
        picture.show();

        public static void copyPictureSmaller(Picture picture)
        {
        new Picture(
        FileChooser.getMediaPath("passionFlower.jpg"));
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        // loop through the columns
        for (int sourceX = 0, targetX=0;
        sourceX < picture.getWidth();
        sourceX+=2, targetX++)
        {
            // loop through the rows
            for (int sourceY=0, targetY=0;
            sourceY < picture.getHeight();
            sourceY+=2, targetY++)
            {
            sourcePixel = 
            picture.getPixel(sourceX,sourceY);
            targetPixel = picture.getPixel(targetX,targetY);
            targetPixel.setColor(sourcePixel.getColor());
            }
        }
        picture.show();
    }

}

