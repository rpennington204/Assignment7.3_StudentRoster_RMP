import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 */

/**
 *  @author Reece Pennington
 */
public class StudentRoster {
	
	//private array
	private Student [] studentRoster;
	private int count = 0;
	
	//array constructor
	public StudentRoster() {
		studentRoster = new Student[5];
	}
	
	//used to add new students to the array
	public void addStudents(Student s) {		
			studentRoster[count] = s;			 
			count ++;							
	}
	
	//print one student and their information
	public void printStudent(String name) {
		int i;
		for (i = 0; i < studentRoster.length; i++) {
			if ((studentRoster[i] != null && (name.compareTo(studentRoster[i].getFirstName() + 
				" " + studentRoster[i].getLastName())==0 || name.compareTo(studentRoster[i].getFirstName() + 
				" " + studentRoster[i].getLastName() + " ")==0))) {
				System.out.println(studentRoster[i].toString());
			}
		}
	}
	
	//save student roster to disk
	public void saveRoster(FileWriter f)throws IOException {
		int i;
		for (i = 0; i < studentRoster.length; i++) {
			if (studentRoster[i] != null) {
				f.write(studentRoster[i].toString() + "\n");
			}
		}
		f.close();
		System.out.println("Saved student roster to disk.");
		
	}
	
	//read student roster from disk
	public void readRoster (File f) throws IOException{
		Scanner fileReader = new Scanner(f);
		while (fileReader.hasNextLine()) {
			String data = fileReader.nextLine();
			System.out.println(data);
		}
		fileReader.close();
	}
	
	//print multiple students
	public void printStudentRoster() {
		int i;
		for (i = 0; i < studentRoster.length; i++) {
			if (studentRoster[i] != null) {
				System.out.println(studentRoster[i].getFirstName() + " " + studentRoster[i].getLastName());
			}
		}
	}
	
	//gets the number of items in the array
	public int getCount() {
		return count;
	}

}
