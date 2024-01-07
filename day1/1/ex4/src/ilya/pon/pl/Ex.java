package ilya.pon.pl;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("введите число 1:\n");
		int a = in.nextInt();
		System.out.println("введите число 1:\n");
		int b = in.nextInt();
		a = (a * a * a);
		b = (b * b);
		System.out.println("a3 > b2 = " + (a > b));
		in.close();
	}

}
