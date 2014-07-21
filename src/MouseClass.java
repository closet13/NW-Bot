import java.awt.Robot;
 public class MouseClass {
	 public static void main(String[] args) throws Exception {
            Robot robot = new Robot();
            Thread.sleep(4000);
            // SET THE MOUSE X Y POSITION
            robot.mouseMove(0, 0);
          //Pause for 4 seconds
            Thread.sleep(10000);
            System.out.println("Execution complete!!!!!");
 
 }
}