package string;
import java.util.Scanner;

public class ConvertToLowerCase {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String inputFromUser = sc.nextLine();
//		String res=inputFromUser.toLowerCase();
		inputFromUser=inputFromUser.toLowerCase();
		System.out.println(inputFromUser);
		
	}

}
