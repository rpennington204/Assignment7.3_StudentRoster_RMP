/**
 * 
 */

import java.util.Scanner;

/**
 * 	@author Reece Pennington
 */
public class Menu {
	
	Scanner scnr = new Scanner(System.in);

	//prints main menu
	public void mainMenu() {
		System.out.println("1: Enter student information.");
		System.out.println("2: Print student roster.");
		System.out.println("3: Search for a student.");
		System.out.println("4: Save student roster to disk.");
		System.out.println("5: Read student roster from disk.");
		System.out.println("6: Exit program");
	}
	
	//allows user to add students with information
	public void addStudentsMenu(StudentRoster r) {
		System.out.println("How many students would you like to add (up to 5 total)?");
		int numStudents = scnr.nextInt();
		if (numStudents + r.getCount() < 6) {
			for (int i = 0; i < numStudents; i++) { 
				System.out.println("Enter the student's first name.");
				String firstName = scnr.next();
				System.out.println("Enter the student's last name.");
				String lastName = scnr.next();
				System.out.println("Enter the student's GPA.");
				double GPA = scnr.nextDouble();
				//consume the newline character
				scnr.nextLine();
				System.out.println("Enter the student's current address.");
				String currentAddress = scnr.nextLine();
				System.out.println("Enter the student's home address.");
				String homeAddress = scnr.nextLine();
				System.out.println("Enter the student's phone number.");
				String phoneNumber = scnr.next();
	
				r.addStudents(new Student(firstName, lastName, GPA, currentAddress, 
				homeAddress, phoneNumber));
				
				if (r.getCount() == 1) {
					System.out.println("There is one student in the roster.");
				}
				else {
					System.out.println("There are " + r.getCount() + " students in the roster.");
				}
				
			}
		}
		else {
			System.out.println("Too many students.");
		}
	}
	//allows user to search for a student
	public void searchStudentMenu(StudentRoster r) {
		//consume the newline character
		scnr.nextLine();
		System.out.print("Enter student name: ");
		String studentName = scnr.nextLine();
		r.printStudent(studentName);
	}
}
