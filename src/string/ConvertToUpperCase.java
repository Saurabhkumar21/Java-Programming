package string;
import java.util.Scanner;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
//		s1="i love you";
		String s2[] = s1.split(" ");
		for(int i=0; i<=s2.length-1; i++) {
			String s3=s2[i].charAt(0);
			System.out.println(s3);
			
		}
	}

}
