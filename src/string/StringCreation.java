package string;
import java.util.*;
public class StringCreation {
	public static void main(String[] args) {
		//String literal
		String str1 ="Saurabh";
		System.out.println(str1);
		
		String str2 ="Kumar";
		System.out.println(str2);
		
		String str3 ="java";
		System.out.println(str3);
		
		String str7 ="Saurabh";
		System.out.println(str7);
		
		String str8;//declare
		str8="Chocolate";//initialize
		System.out.println(str8);
		
		//Using new keyword
		//The syntax for creating Class:
		//ClassName objectName= new ClassName();
		String str4= new String("C"); // assign the value directly
		System.out.println(str4); //here we use the value through objectName(str4)
		
		String str5= new String("webdev");
		System.out.println(str5);
		
		String str6= new String("java");
		System.out.println(str6);
		
		boolean result1 = str3==str6;//false
		System.out.println(result1);
		boolean result2 = str1==str7;//true
		System.out.println(result2);
		
		//or,
		
		String str9= new String(); //create the object first
		str9="java";               //then assign the value to that object
		System.out.println(str9);  //here we use the value through objectName(str4)
		
		
		//String User Input-
		//String str10 = sc.next(); -take input till space is not reached or enter is not pressed
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string data: ");
		String str10 = sc.next();
		System.out.println(str10);
		
		//String str11 = sc.nextLine(); -take input until enter is not pressed
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter a string data: ");
		String str11 = scc.nextLine();
		System.out.println(str11);
		
	}
		
}
