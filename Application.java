import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 */

/**
 * 	@author Reece Pennington 
 */
public class Application {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		StudentRoster roster = new StudentRoster();
		Menu menu = new Menu();
		File aFile = new File("ProgramOutput.txt");
		FileWriter fw = new FileWriter(aFile);	
		
		int runProgram = 1;
		
		while (runProgram == 1) {
			//prints main menu
			menu.mainMenu();
		
			int menuNum = scnr.nextInt();
	
			//enter student information
			if (menuNum == 1) {
				menu.addStudentsMenu(roster);
			}
			//prints roster
			else if (menuNum == 2) {
			roster.printStudentRoster();
			}
			//search for a student's information
			else if (menuNum == 3) {
				menu.searchStudentMenu(roster);
			}
			//save student roster to disk
			else if (menuNum == 4) {
				roster.saveRoster(fw);
			}
			//read student roster from disk
			else if (menuNum == 5) {
				roster.readRoster(aFile);
			}
			//ends program
			else {
				runProgram = 0;
			}
		}
	}

}
