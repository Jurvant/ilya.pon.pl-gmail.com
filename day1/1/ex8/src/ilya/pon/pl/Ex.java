package ilya.pon.pl;

import java.util.Scanner;

public class Ex {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		String name, sname, patr;
		System.out.println("Введите имя");
		name = in.nextLine();
		System.out.println("Введите фамилию");
		sname = in.nextLine();
		System.out.println("Введите отчество");
		patr = in.nextLine();
		
		//print
		
		System.out.print(name + " ");
		System.out.print(sname + " ");
		System.out.print(patr);
		System.out.println();
		
		
		//println
		System.out.println(name + " " + sname + " " + patr);
		in.close();
	}
}
