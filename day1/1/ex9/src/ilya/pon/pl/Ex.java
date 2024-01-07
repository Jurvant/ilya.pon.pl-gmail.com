package ilya.pon.pl;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите два числа:");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		if((a % 2 == 0) || (b % 3 == 0)) {
			System.out.println("a == b - " + (a == b));
		}
		
		if((a % 2 == 0) && (a % 3 == 0)) {
			if((Math.pow(a, b)) > Integer.MAX_VALUE){
				System.out.println("Результат выражения слишком большой!");
			}		
			System.out.println((int)(Math.pow(a, b)));
			
		}
		
	}

}
