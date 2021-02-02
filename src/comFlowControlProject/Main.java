package comFlowControlProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World");

		System.out.println("Here are numbers:");
		System.out.println("Numbers:");
		AsciiChars.printNumbers();
		System.out.println("Here are lowercase letters:");
		System.out.println("Lowercase letters:");
		AsciiChars.printLowerCase();
		System.out.println("Here are uppercase letters:");
		System.out.println("Uppercase letters:");
		AsciiChars.printUpperCase();

		ArrayList<String> questions = new ArrayList<>();
		
		questions.add("What is your pet's name?");
		questions.add("What is your favorite number");
		questions.add("What is the 2-digit year of your car?");
		questions.add("What is your high school mascot?");
		questions.add("Name a state in the US.");
		questions.add("Name a country you want to visit");
		questions.add("Pick a number between 10 - 40.");
		
		ArrayList<String> answers = new ArrayList<>();
		ArrayList<Integer> jackpot = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);

		System.out.println("Do you wish to continue to the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();

		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			// need to add the survey questions
			for (String question : questions) {
				System.out.println(question);
				String resp = userInput.nextLine();
				answers.add(resp);
			}
			userInput.close();
		} else { // anything other than y or yes response goes to exit
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			userInput.close();
			System.exit(0);
		}
		jackpot = genNumbers(answers, jackpot);
		

	}
	
	private ArrayList<Integer> genNumbers(ArrayList<String> ansStrings, ArrayList<Integer> numbers) {
		
		Integer numTwo = Integer.parseInt(null, numbers.get(1));
		
		return numbers;
	}
	
	
}





//Scanner userInput = new Scanner(System.in);
//System.out.println("Please enter your name:");
//String inputName = userInput.nextLine();
//System.out.printf("Hello %s\n", inputName);
//
//System.out.println("Do you wish to continue to the interactive portion? (y/n)");
//String userResponse = userInput.nextLine();
//
//if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
//	// need to add the survey questions
//} else { // anything other than y or yes response goes to exit
//	System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
//	userInput.close();
//	System.exit(0);
//}
//
//userInput.close();
