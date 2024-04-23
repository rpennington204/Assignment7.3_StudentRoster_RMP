/**
 * 
 */

/**
 *  @author Reece Pennington
 */
public class Student {
	
	//private variables for student information
	private String firstName;
	private String lastName;
	private double GPA;
	private String currentAddress;
	private String homeAddress;
	private String phoneNumber;
	
	//student constructor
	public Student (String fName, String lName, double gpa, String cAddress, 
	String hAddress, String pNumber) {
		firstName = fName;
		lastName = lName;
		GPA = gpa;
		currentAddress = cAddress;
		homeAddress = hAddress;
		phoneNumber = pNumber;
	}
	
	//name setter
	public void setName(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	//GPA setter
	public void setGPA(double gpa) {
		GPA = gpa;
	}
	
	//address setters
	public void setCurrentAddress(String cAddress) {
		currentAddress = cAddress;
	}
	
	public void setHomeAddress(String hAddress) {
		homeAddress = hAddress;
	}

	//phone number setter
	public void setPhoneNumber(String pNumber) {
		phoneNumber = pNumber;
	}
	
	//name getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//GPA getter
	public double getGPA() {
		return GPA;
	}
	
	//address getters
	public String getCurrentAddress() {
		return currentAddress;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}
	
	//phone number getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//converts student information to a string
	public String toString() {
		String studentInfo = firstName + " " + lastName + ":\n" + "GPA: " + GPA + "\n" + 
							 "Current Address: " + currentAddress + "\n" + "Home Address: " +
							 homeAddress + "\n" + "Phone Number: " + phoneNumber;
		return studentInfo;
	}
	
	
	

}
