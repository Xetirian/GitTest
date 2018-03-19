package messagePrinter;

public class Main {

	public static void main(String[] args) {
		CountingPrinter p = new CountingPrinter();
		p.print("Hello");
		p.print("World");
		p.print("!");
		
		System.out.println("Done");
	}

}
