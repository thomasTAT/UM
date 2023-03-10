package lab1;

import java.util.*;

// public class TurtleTest {
//   public static void main(String[] args) {
//     Random randNumGen = new Random();
//     World world = new World(false);
//     Turtle[] turtleArray = new Turtle[1000];
//     for (int i = 0; i < 1000; i++)
//       turtleArray[i] = new Turtle(world);

//     for (int i = 0; i < 1000; i++) {
//       turtleArray[i].turn(randNumGen.nextInt(360));
//       turtleArray[i].forward(100);
//     }
//     // world.show();
//     World world1 = new World();
//     System.out.println(world1);
//     Turtle turtle1 = new Turtle(world1);
//     System.out.println(turtle1);
//     turtle1.forward(80);
//     turtle1.turnLeft();
//     turtle1.forward(100);
//     turtle1.moveTo(200, 200);
//     turtle1.setName("thomas");
//     System.out.println(turtle1.getName());
//     drawSquare(turtle1);

//   }

//   public static void drawSquare(Turtle abc) {
//     abc.forward(130);
//     abc.turnRight();
//     abc.forward(130);
//     abc.turnRight();
//     abc.forward(130);
//     abc.turnRight();
//     abc.forward(130);
//   }
// }