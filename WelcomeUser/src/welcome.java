import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		System.out.println("Hi Welcome to class CS 556");
		System.out.println("Please enter your name: ");
		Scanner S = new Scanner(System.in);
		String name = S.nextLine();
		System.out.println("Please enter your email: ");
		String email = S.nextLine();
		
		System.out.println("******WELCOME******");
		System.out.println("Your name is "+name);
		System.out.println("Your email is "+email);
	}
}
