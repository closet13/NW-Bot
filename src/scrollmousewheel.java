import java.awt.Robot;
import java.awt.event.InputEvent;
 
public class scrollmousewheel {
 public static void main(String[] args) throws Exception {
            Robot robot = new Robot();
            // MIDDLE WHEEL CLICK
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            // SCROLL THE MOUSE WHEEL
            robot.mouseWheel(-100);
 
 }
}
