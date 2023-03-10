package lab1;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        String fname = "";
        Picture picture = new Picture("C:\git-repos\UM\CISC3016 MULTIMEDIA COMPUTING\cisc3016\butterfly1.jpg); 
        picture.show();
        World world1 = new World();
        System.out.println(world1);
        Turtle turtle1 = new Turtle(world1);
        System.out.println(turtle1);
    }
}
