package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "butterfly1.jpg";
        Picture picture = new Picture(fname);
        picture.show();
        copyFlowerSmaller
    }

    public void copyFlowerSmaller() {
        Picture flowerPicture = new Picture(FileChooser.getMediaPath("butterfly1.jpg"));
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        // loop through the columns
        for (int sourceX = 0, targetX = 0; sourceX < flowerPicture.getWidth(); sourceX += 2, targetX++) {
            // loop through the rows
            for (int sourceY = 0, targetY = 0; sourceY < flowerPicture.getHeight(); sourceY += 2, targetY++) {
                sourcePixel = flowerPicture.getPixel(sourceX, sourceY);
                targetPixel = this.getPixel(targetX, targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }
    }

}
