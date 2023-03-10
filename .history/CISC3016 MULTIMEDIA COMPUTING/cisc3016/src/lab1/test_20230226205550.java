
package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "butterfly1.jpg";
        Picture picture = new Picture(fname); // picture.show();

        World world1 = new World();
        System.out.println(world1);
        Turtle turtle1 = new Turtle(world1);
        System.out.println(turtle1);
    }
}
