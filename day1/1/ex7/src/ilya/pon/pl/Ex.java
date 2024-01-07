package ilya.pon.pl;

import java.util.Scanner;

public class Ex {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		//if-else
		System.out.println("Введите строку:");
		String phrase = in.nextLine();
		if(phrase.equals("Hi")) {
			System.out.println("Hello");
		}
		else if(phrase.equals("Bye")) {
			System.out.println("Good bye");
		}
		else if(phrase.equals("How are u")){
			System.out.println("How are you doing");
		}
		else {
			System.out.println("Unknown message");
		}
		
		
		
		//switch-case
		System.out.println("Введите строку:");
		String phrase2 = in.nextLine();
		switch(phrase2) {
		case "Hi" :
			System.out.println("Hello");
			break;
		case "Bye" :
			System.out.println("Good bye");
			break;
		case "How are u" :
			System.out.println("How are you doing");
			break;
		default :
			System.out.println("Unknown message");
		}
		
		in.close();
	}
}
