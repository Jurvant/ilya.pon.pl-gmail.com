package ilya.pon.pl;

public class Ex {
	
		  public static void main(String[] args) {
		    int a = 5;
		    int b = 10;

		    a += b;
		    b = a - b;
		    a = a - b;

		    System.out.println("Значение а: " + a + ". Значение b: " + b);
		  }
		
}
