package cnstrct;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsoleView aView = new ConsoleView();
		Student aStudent1 = new Student(2, "Sally", "Jones");
				
		aView.print(aStudent1.toString());
		
	}

}
