package ilya.pon.pl;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int a = in.nextInt();
		System.out.println("Введите число: ");
		int b = in.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("Произведение:");
			System.out.println(a * b);
		}
		else {
			System.out.println("Частное:");
			System.out.println((double)a / (double)b);
		}
		in.close();
    }
}
