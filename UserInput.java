import java.util.*;

public class UserInput
{
	// Create a scanner object to read user input
	Scanner sc = new Scanner(System.in);

	// Declare variables to hold student name, dob, and prn
	String dob;
	String name;
	int prn;

	// Create an Object array to hold the input values
	Object[] input = new Object[3];

	public Object[] inputStudent()
	{
		// Prompt user to enter student name, dob, and prn
		System.out.println("Enter student name: ");
		name = sc.next();

		System.out.println("Enter student dob: ");
		dob = sc.next();

		System.out.println("Enter student prn: ");
		prn = sc.nextInt();

		// Store the values in the Object array
		input[0] = name;
		input[1] = dob;
		input[2] = prn;

		// Return input array
		return input;
	}
}
