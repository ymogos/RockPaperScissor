package assignment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] dogBreeds = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
	
		
		System.out.println("What is your dong Name?");
		String dogName = sc.nextLine();
		int maxPercent = 100;
		int breedPercent = 0;
		
		System.out.println("Well then, I have this highly reliable report\non sir"+dogName+"'s prestigious baclkground right here.\n");
		
		for(int i=0;i<dogBreeds.length;i++) {
			
			if(i<4) {
				breedPercent = random.nextInt(maxPercent);
				maxPercent -=  breedPercent; 
			}else {
				breedPercent = maxPercent;
			}
			
			
			System.out.println(breedPercent + "% "+  dogBreeds[i]);
		}
		
		
		
	 System.out.println("Wow, that's QUITE the dog!");	

	}

}