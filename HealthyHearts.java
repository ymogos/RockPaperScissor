package assignment;
import java.util.Scanner;

public class HealthyHearts {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("What is your age?");
	int age = input.nextInt();
	int maxHeartRate = 220 - age;
	int lowerHeartZone =(int) (0.5 * 170);
	int higherHeartZone = (int)( 0.85 * 170);
	 
	System.out.println("Your maximum heart rate shoud be " +maxHeartRate+" beats per minute.");
	
	System.out.println("Your target HR Zone is "+lowerHeartZone+" - "+higherHeartZone+" beats per minute.");	
	input.close();
	}
	
	

}
