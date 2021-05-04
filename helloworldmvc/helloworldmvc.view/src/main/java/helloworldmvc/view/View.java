package helloworldmvc.view;
import helloworldmvc.Contract.IView;

public class View implements IView{
	
	
	public String displayMessage(String message) {
		System.out.println(message);
		return message;
	}
	
	public static void main (String[] args) {
		
		View hi = new View();
		hi.displayMessage("Hello world");
	}

}
