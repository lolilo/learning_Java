import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		System.out.println("Enter a double: ");
		double value = input.nextDouble();
		System.out.println("You entered: " + value);
	}
}
