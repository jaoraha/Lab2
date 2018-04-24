import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		//Import scanner.
		Scanner scan = new Scanner(System.in);

		//Declare input variable for do-while loop.
		String cont;

		//Utilize Do-While loop to allow measuring of multiple rooms.
		do
		{	System.out.println();

		//Prompt user to input length.
		System.out.print("Enter Length: ");
		double length = scan.nextDouble();

		//Prompt user to input width.
		System.out.print("Enter Width: ");
		double width = scan.nextDouble();

		//Prompt user to input height.
		System.out.print("Enter Height: ");
		double height = scan.nextDouble();

		//Calculate area based off user input.
		double area = (length * width);

		//Output area.
		System.out.println("Area: " + area);

		//Calculate perimeter based on user input.
		double perimeter = 2*(length + width);

		//Output perimeter.
		System.out.println("Perimeter: " + perimeter);

		//Calculate volume based on user input.
		double volume = (length * width * height);

		//Output volume.
		System.out.println("Volume: " + volume);
		System.out.println();

		//Prompt user to input y/n to continue. 
		System.out.print("Continue? (y/n): ");
		cont = scan.next();
		} 		
		//Do-While loop continues while user inputs "y" or "Y" to prior prompt.
		while(cont.equalsIgnoreCase("y"));

		System.out.println();
		
		scan.close();
	}
}