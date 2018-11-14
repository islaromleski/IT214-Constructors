package cnstrct;

public class GradStudent extends Student{
	
	// Here is a constructor which requires no arguments. By default,
	// if you inherit from another class, you do not inherit the constructors. 
	// However, you can manually access them with the "super" keyword (similar
	// in use to the "this" keyword).
	GradStudent() {
		super();
	}
	
	// Using super again, but with arguments.
	GradStudent(int newID, String newFirstName, String newLastName) {
		super(newID, newFirstName, newLastName);
	}
	
}
