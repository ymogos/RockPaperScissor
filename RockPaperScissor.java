package assignment;

import java.util.Scanner;

public class RockPaperScissor {
	static int numRounds=0;
	static int computerWins = 0;
	static int userWins = 0;
	static int draw = 0;

	public static void main(String[] args) {

		Scanner	 scanner = new Scanner(System.in);
		char choice;
		do {

			do {
				System.out.println("How Many Rounds do you want to play?");
				numRounds = scanner.nextInt();
				if(numRounds<=0 || numRounds>10) {
					System.out.println("You Must Select Numbers between 1 and 10?\n");
				}
			}while(numRounds<=0 || numRounds>10);



			for(int i=0;i<numRounds;i++) {
				int computerChoice = getComputerChoice();
				showMenu();
				int userChoice = getUserChoice(scanner);

				decideWinner(computerChoice,userChoice);
				printGameStatistics();
			}

			System.out.println("Do you want to play More games Y/N?");
			choice = scanner.next().charAt(0);

		}while(choice =='y' || choice =='Y');



	}

	public static void showMenu() {
		System.out.println("Options to  choose from");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissor\n");
	}

	public static int getComputerChoice() {
		// computer chooses a random number using a build in function Random
		return (int)Math.floor(Math.random()*3)+1;

	}

	public static int getUserChoice(Scanner scanner) {
		// int userChoice = scanner.nextInt();
		return scanner.nextInt();
	}

	public static void decideWinner(int computerChoice,int userChoice) {
		//  1 represents Rock , 2 for Paper , 3 for scissors
		if(computerChoice == userChoice) {
			System.out.println("It is a draw!!");
			draw++;
		}else {
			switch(userChoice) {
			case 1:
				if(computerChoice == 2) {
					System.out.println("Computer wins!");
					computerWins++;

				} else if(computerChoice==3) {
					System.out.println("User wins!");
					userWins++;

				}
				break;
			case 2:
				if(computerChoice == 1) {
					System.out.println("User wins");
					userWins++;

				} else if(computerChoice == 3 ) {
					System.out.println("Computer wins!");
					computerWins++;

				}
				break;
			case 3:
				if(computerChoice == 2) {
					System.out.println("User wins!");
					userWins++;

				} else if(computerChoice == 1) {
					System.out.println("Computer wins!");
					computerWins++;

				}
				break;
			}


		}
	}

	public static void printGameStatistics() {
		System.out.println("\n====Game statistics====");
		System.out.println("Computer wins " + computerWins +"  times");
		System.out.println("Payer wins " + userWins +" times");
		System.out.println("Number of ties " + draw);
		if(computerWins>userWins) {
			System.out.println("Computer wins more rounds\n "); 
		}else if(computerWins < userWins) {
			System.out.println("User wins more round \n"); 
		}else {
			System.out.println("Computer and Users tie\n");
		}

	}

}