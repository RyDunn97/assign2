package cse360assign2;
import java.util.*; //import necessary packages for using a scanner

//using this class to test the calculator class 
public class TestingCalc {

	public static void main(String[] args) {

		Calculator testCalc = new Calculator();
		char userChoice = 'a';
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		String input;
		
		do 
		{
			System.out.println("\nHere are your options. Please choose which action you would like to make.\n"
							+ "g: get total\n"
							+ "a: add \n"
							+ "s: subtract \n"
							+ "m: multiply \n"
							+ "d: divide \n"
							+ "h: get history \n" 
							+  "q: quit\n");
			input = scan.next();
			userChoice = input.charAt(0);
			
			switch(userChoice)
			{
				case 'g':
					System.out.println(testCalc.getTotal());
				case 'a':
					System.out.println("enter an integer: \n");
					userInput = scan.nextInt();
					testCalc.add(userInput);
					break;
					
				case 's':
					System.out.println("enter an integer: \n");
					userInput = scan.nextInt();
					testCalc.subtract(userInput);
					break;
					
				case 'm':
					System.out.println("enter an integer: \n");
					userInput = scan.nextInt();
					testCalc.multiply(userInput);
					break;
				
				case 'd':
					System.out.println("enter an integer: \n");
					userInput = scan.nextInt();
					testCalc.divide(userInput);
					break;
					
				case 'h':
					System.out.println(testCalc.getHistory());
					break;
				case 'q': 
					break;
				default:
					break;
				
			}
			
		}
		while(userChoice != 'q');
		scan.close();
	}

}
