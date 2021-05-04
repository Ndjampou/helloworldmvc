package helloworldmvc.Contract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	
	public static void main (String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("D:\\HelloWorld.txt"));
		String line;
		while ((line = in.readLine()) != null)
		{
	      // Afficher le contenu du fichier
			  System.out.println (line);
		}
		in.close();

    }
	
	String FileName="D:\\HelloWorld.txt";
	DAOHelloWorld instance= null;
	String HelloWorldMessage = null;
	
	private DAOHelloWorld() {
		
	}

	public DAOHelloWorld getinstance() {
		return instance;
	}
	
	private void setinsistance(DAOHelloWorld insistance) {
		instance=this.instance;
	}
	
	private void readFile() {
		
	}
	
	public String getHelloWorldMessage() {
		return HelloWorldMessage;	
		
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		
	}
}
