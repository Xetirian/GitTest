package messagePrinter;

public class CountingPrinter {

	private static int count = 0;
	
	public void print(String string) {
		count++;
		System.out.println("Message"+count+": "+string);		
	}

}
