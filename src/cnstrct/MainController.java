package cnstrct;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Make a new console using the default "empty constructor".
		// This constructor is automatically added to any class that
		// doesn't have a constructor explicitly written.
		ConsoleView aView = new ConsoleView();
		
		// Make a new student using the constructor.
		Student aStudent1 = new Student(2, "Sally", "Jones");
				
		// Print out the toString of said student.
		aView.print(aStudent1.toString());
		
	}

}
