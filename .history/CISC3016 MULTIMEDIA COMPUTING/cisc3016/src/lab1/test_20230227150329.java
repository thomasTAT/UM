package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "butterfly1.jpg";
        Picture picture = new Picture(fname);
        picture.show();
        Create a new picture half the size of the original picture (+ 1 if odd size)
        Picture p1 = new Picture(320,240);
        //Copy the flower to the new picture
        p1.copyFlowerSmaller();
        //Show the result
        p1.show();

    }

}
