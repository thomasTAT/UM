package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "butterfly1.jpg";
        Picture picture = new Picture(fname);
        picture.show();
        Picture p1 = new Picture(320, 240);
        p1.copyFlowerSmaller();
        p1.show();
    }

}
