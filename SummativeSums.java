package assignment;

public class SummativeSums {

	public static void main(String[] args) {
		
		int[] a = {1, 90, -33, -55, 67, -16, 28, -55, 15};
		int[] b = {999, -60,-77, 14, 160, 301};
		int[] c = {10, 20, 30, 40,50, 60,70,80,90, 100, 110, 120, 130};
		int[] d = {140, 150, 160, 170, 180, 190, 200, -99};
		
		int sumOfa = sumOfArray(a);
		int sumOfb = sumOfArray(b);
		int sumOfc = sumOfArray(c);
		int sumOfd = sumOfArray(d);
		System.out.println("============Results==============");
		System.out.println("The Summative Sum of array a is: " + sumOfa);
		System.out.println("The Summative Sum of array b is: " + sumOfb);
		System.out.println("The Summative Sum of array c is: " + sumOfc);
		System.out.println("The Summative Sum of array d is: " + sumOfd);
		
	}
	
	
	
	public static int sumOfArray(int[] arrSum) {
		int sum =0;
		for(int i=0;i<arrSum.length;i++) {
			sum += arrSum[i];
		}
		return sum;
	}
}
