import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
 public class bot1 {
	 public static void main(String[] args) throws Exception 
	 {
            // code to open website...not working perfect yet
		/* try {
			 System.out.println("Preparing to open gateway");
			 Thread.sleep(2000);
			 //Set your page url in this string. For eg, I m using URL for Google Search engine	 
             String url = "https://gateway.playneverwinter.com";
             java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
           }
           catch (java.io.IOException e) {
               System.out.println(e.getMessage());
           } */
		 
		 Thread.sleep(2000);
		 System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
		 Robot robot = new Robot();
		 System.out.println("Preparing to move mouse to left screen neverwinter");
		 Thread.sleep(2000);
            // SET THE MOUSE X Y POSITION
            robot.mouseMove(-1075,360);
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
            robot.mouseMove(-402,491); // professions
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
            robot.mouseMove(-1081,426); // collect 1
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
          //  robot.mousePress(InputEvent.BUTTON1_MASK);
          //  robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mouseMove(-858,432); // collect 2
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
            robot.mouseMove(-654,428); // collect 3
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
            robot.mouseMove(-1070,580); // collect 4
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
            Thread.sleep(2000);
            robot.mouseMove(-873,582); // collect 5
            System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
        /*  Thread.sleep(2000);
            robot.mouseMove(-402,491); // 
            Thread.sleep(2000);
            robot.mouseMove(-402,491); // 
            Thread.sleep(2000);
            robot.mouseMove(-402,491); // 
            Thread.sleep(2000);
            robot.mouseMove(-402,491); // */
         
            	}
            
	 }
