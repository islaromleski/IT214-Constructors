package cnstrct;

public class Student {
	 		
	// These constructors are "Overloaded" because the have
	// different numbers / orders / types of parameters.
	
	// This one takes no arguments.
	Student() {
		this(-1, "N/A", "N/A");
	}
	
	// This one takes 1 argument.
	Student(int newID) {
		this(newID, "N/A", "N/A");
	}
	
	// This one takes 2.
	Student(String newFirstName, String newLastName) {
		this(-1, newFirstName, newLastName);
		
	}
	
	// This one takes 3.
	Student(int newID, String newFirstName, String newLastName) {

		if(newID > 0) {
			this.ID = newID;
		} else {
			this.ID = -1;
		}
		
		this.setFirstName(newFirstName);
		this.setLastName(newLastName);
		
	}
	
	// This one takes 2, but will not work. This is because
	// we cannot have two constructors where the parameters
	// match in type due to the computer differentiating
	// between constructors using both number of operands
	// and type of said operand. Thus, two constructors	share
	// number and type of operands (along with the same order
	// for these types), the computer will think they're the
	// same constructor. 
	
	// Student(String x, String y) {
	//
	// }
	
	private int ID = -1;
	private String firstName = "N/A";
	private String lastName = "N/A";
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newFirstName) {
		if(newFirstName.length() >= 5) {
			this.firstName = newFirstName;
		} else {
			newFirstName = "N/A";
		}
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public int getID() {
		return this.ID;
	}
	
	// We don't want to let people set new IDs for users normally.
	/*public void setID(int newID) {
		this.ID = newID;
	}
	*/
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "ID: " + this.getID() + "\n";
		aMessage += "First name: " + this.getFirstName() + "\n";
		aMessage += "Last name: " + this.getLastName() + "\n";
		
		return aMessage;
	}
	
}
