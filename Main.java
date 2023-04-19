import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		UserInput userInput = new UserInput();

		// Ask the user for the number of records to enter
		System.out.println("How many records do you wish to enter? ");
		int n = sc.nextInt();

		// Create an array of Student objects with length n
		Student[] student = new Student[n];

		// Loop through the array and get details of each student from user
		for (int i = 0; i < n; i++) {
			Object[] details = userInput.inputStudent();
			student[i] = new Student((String) details[0], (String) details[1], (Integer) details[2]);
		}

		Main main = new Main();
		//Display student records
		main.display(student);

		// Prn of student to update
		System.out.println("Enter PRN to update: ");
		int updPrn = sc.nextInt();
		main.update(student, updPrn);

		// Prn of student to delete
		System.out.println("Enter PRN to delete: ");
		int delPrn = sc.nextInt();

		main.delete(student, delPrn);
	}

	// Display the details of all students in the array
	public void display(Student[] students) {
		System.out.println("Name: , dob: , prn: ");

		for (Student student : students) {
			System.out.println(student.getName() + ", " + student.getDOB() + ", " + student.getPRN());
		}
	}

	// Method to delete a student from the array based on their PRN
	public void delete(Student[] students, int delPrn)
	{
		List<Student> list = new ArrayList<Student>(Arrays.asList(students));
		Iterator<Student> iterator = list.iterator();

		while (iterator.hasNext())
		{
			Student student = iterator.next();

			if (student.getPRN() == delPrn)
			{
				iterator.remove();
				break;
			}
		}

		students = list.toArray(new Student[list.size()]);
		for (int i = 0; i < students.length; i++)
		{
			students[i] = list.get(i);
		}
	}

	// Method to update the details of a student based on their PRN
	public void update(Student[] students, int updPrn) {
		for (Student student : students) {
			if (student.getPRN() == updPrn) {
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter new name: ");
				String newName = sc.next();
				student.setName(newName);

				System.out.println("Enter new dob: ");
				String newDob = sc.next();
				student.setDOB(newDob);

				break;
			}
		}
	}

}
