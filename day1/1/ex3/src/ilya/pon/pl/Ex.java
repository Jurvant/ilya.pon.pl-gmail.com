package ilya.pon.pl;
import java.util.Scanner;
public class Ex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите числа a:");
		double a = in.nextInt();
		System.out.println("Введите числа a:");
		double b = in.nextInt();
		double c;
		c = b*a*(a + b)/(a*a);
		System.out.println("Результат выражения b*a*(a + b)/(a*a) равен:" + c);
		int d = (int)c;
		System.out.println(d);
		boolean e = ((double) d == c);
		System.out.println("равность с переменной типа int :" + e);
		
		
		in.close();
	}

}
