/**
 * Tests the Balloon class
 * You don't need to modify or change this file
 * @param length is the permiter
 * @return the perimeter
 */
public class BalloonTester
{
   public static void main(String[] args)
   {
       Balloon balloon = new Balloon();
       balloon.addAir(100);
       System.out.println(balloon.getRadius());
       System.out.println("expected: 2.8794119114848606");
       System.out.println(balloon.getVolume());
       System.out.println("expected: 100.0");
       System.out.println(balloon.getSurfaceArea());
       System.out.println("expected: 104.18794157356089");
       
       balloon.addAir(100);
       System.out.println(balloon.getRadius());
       System.out.println("expected: 3.6278316785978095");
       System.out.println(balloon.getSurfaceArea());
       System.out.println("expected: 165.38804805627188");
       
       String name = "run";
       int one = 1;
       int length = name.length();
       System.out.println(length);
       String first = name.substring(0,1);
       System.out.println(first);
       String nameup = name.toUpperCase();
       System.out.println(nameup);
       double volume = 0.0;
       System.out.println("now");
       System.out.println(volume);
       final int HOURS_PER_DAY = 24;
       System.out.println(HOURS_PER_DAY);
       int score = 90;
       if (score > 90)
    	   one = 1;
       else
    	   one = 2;
       System.out.println(one);
     
   }
}
