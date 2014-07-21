import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
public class Punky1 {
	public static void main(String[] args) throws Exception {

		 Robot robot = new Robot();
	 
		 // -570,1076 forward button 
		 // -631,484 feed the needy continue button
		 // -616, 991 start task button
		 // -1898, 339 swordcoast adventures button
		 // -1894,497 professions button on left
		 // -628,669 continue for feed the needy
		 // -624,989 start task for feed the needy
		 // -965,991 buy supplies button
		 // -801,498 solvent
		 // -590,497 brimstone
		 // -1005,500 poridge -- ok button -869,416
		 
	 
		 // leadership quest 1
		 robot.mouseMove(-1078,428); // move to choose task/collect task button
		 Thread.sleep(2000);
		 robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         robot.mouseMove(-632,581); // move to continue button on feed the needy
         Thread.sleep(2000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         robot.mouseMove(-624,989); // 
		 Thread.sleep(2000);
		 robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
		 // sleep 10m 
         
         
		 
/*		 
		 // collect leadership 1
		 robot.mouseMove(-1078,428); // move to choose task/collect task button
		 Thread.sleep(2000);
		 robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(1000);
         robot.mouseMove(-981,370);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // return to leadership quest 1 and execute
*/
		 
   /*
		 // buy supplies code
         robot.mouseMove(-965,991); // move to buy supplies button
         Thread.sleep(1000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         
         // buy poridge
         robot.mouseMove(-1005,500);
         Thread.sleep(1000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         robot.mouseMove(-869,416);
         Thread.sleep(1000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
   */
/*	 
		 // return to overview screen
		 
		 robot.mouseMove(-1298,297);
         Thread.sleep(1000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
*/		 
		 
		 
		 
         // button 1
     /*    robot.mouseMove(-1078,428);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");  
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         robot.mouseMove(-979,568);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
     */
         
      // button 2
   /*      robot.mouseMove(-858,432);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         
         robot.mouseMove(-970,568);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
     */    
         
      // button 3
   /*      robot.mouseMove(-654,428);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         
         robot.mouseMove(-969,565);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
     */    
     // button 4 
       /* robot.mouseMove(-1070,580);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         
         robot.mouseMove(-983,326);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    */
		 
      // button 5
     /*    robot.mouseMove(-873,582);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         
         robot.mouseMove(-976,378);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
   */      
      // SET THE MOUSE X Y POSITION
   /*      robot.mouseMove(-858,432);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         
         Thread.sleep(2000);
         // click collection 1 button
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(2000);
         // move to collection 1 collect button
         
         robot.mouseMove(-970,568);
         System.out.println("("+MouseInfo.getPointerInfo().getLocation().x+", "+MouseInfo.getPointerInfo().getLocation().y+")");
         Thread.sleep(2000);
         
         // click left button to collect rewards
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         
         robot.mouseMove(-1081,426);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
         Thread.sleep(1000);
         robot.mouseMove(-572,1073);
         Thread.sleep(1000);
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
      */
         }   
	 }
