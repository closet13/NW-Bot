import java.awt.MouseInfo;
import java.awt.Point;

public class Portia {
     public static void main(String args[]) throws InterruptedException {
    	Thread.sleep(4000);  // some time for user to position mouse
    	Point spot = MouseInfo.getPointerInfo().getLocation();
    	System.out.println(
    			String.valueOf(spot.getX())
    			+","+
    			String.valueOf(spot.getY()));
     }
}