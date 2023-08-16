package string;
import java.util.*;
public class StringMethod {
	public static void main(String[] args) {
		//1.int length(): Returns the number of characters in the String.
		String str1="Saurabh";
		int len = str1.length();
		System.out.println(len);//returns 7
		
		//2.char charAtAt(): Returns the character at [i]th index.
		char ch = str1.charAt(3);
		System.out.println(ch); //returns 'r'
		
		int x[] = {1,2,3,4,5};
		System.out.println(x[3]); //prints 4
	    //Similarly,		
		System.out.println(str1.charAt(0)); //prints 'S'
		
		char ch2 = str1.charAt(len-1);
		System.out.println(ch2); //returns 'h'
		//or,
		//char ch2 = charAt(str1.length()-1);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string data: ");
		String str2 = s.nextLine();
		System.out.println(str2);
		int len2 = str2.length();
		System.out.println(len2);
		char ch3 = str2.charAt(8);
		System.out.println(ch3);
		char y = str2.charAt(len2-1);
		System.out.println(y);
		
		//3. String substring(int i):return the substring from the [i]th index character to the end.
		
		String ch4 = str1.substring(3); //finding substring from ith position
		System.out.println(ch4);//returns "rabh"
		
		//4. String substring(int i,int j): Return the substring from i to j-1 index character to end.
		
		String ch5 = str1.substring(1,5); //finding substring from ith position till (j-1)th position
		System.out.println(ch5);// returns "aura"
		
		//5. String concat(String str):Cocatenates specified string to the end of this string.
		
		String ch6 = str1.concat(" Arora");
		System.out.println(ch6);// returns "Saurabh Arora"
		
		//6. int indexOf(String str): Returns the index within the string of the first occurrence of the specified string. If same words are present many times in a string then indexOf will return the first occurrence of that word. 
		
		int return1 = str2.indexOf("boy");
		System.out.println(return1);//returns 24
		
		//7. int indexOf(String str,int i):Returns the index within the string of the first occurrence of the specified string after the given position. If same words are present many times in a string then indexOf will return the first occurrence of that word after the given position. 
		//   Here we pass 2 things in indexOf: 
		//   First one is the string which we want to find 
		//   Other one is the index after which we want to find the given string.

		int return2 = str2.indexOf("boy",25);
		System.out.println(return2);// 55
		
		//8.int lastIndexOf(String str):Returns the index of the last occurrence of a specified substring.
		int return3 = str2.lastIndexOf("boy");
		System.out.println(return3);//55
		
		//9. boolean equals(String str):Compare two strings
		
		String s1="Saurabh";
		String s2="Saurabh";
		System.out.println(s1.equals(s2));
		
		String s3="Kumar";
		String s4="kumar";
		System.out.println(s3.equals(s4));
		
		//10.  boolean equalsIgnoreCase(String str):compare two strings without comparing their cases.
		
		String s5 = "Kumar";
		String s6 = "kumar";
		System.out.println(s5.equalsIgnoreCase(s6));
		
		/*11. int compareTo( String str): Compares two string lexicographically.
		It subtracts Ascii value of the last string from the first string.*/
		
		String s7="a";
		String s8="A";
		int compareTo = s7.compareTo(s8);
		System.out.println(compareTo);
		System.out.println(s8.compareTo(s7));
		
		//12. int compareToIgnoreCase( String str): Compares two string lexicographically without considering their cases.
		
		String s9="a";
		String s10="A";
		System.out.println(s9.compareToIgnoreCase(s10));
		System.out.println(s10.compareToIgnoreCase(s9));
		
		//13. String toLowerCase(): Converts all the characters in the String to lower case.
         
		String s11="Saurabh";
		System.out.println(s11.toLowerCase());
		
		//14. String toUpperCase(): Converts all the characters in the String to lower case.
       
		String s12="Saurabh";
		System.out.println(s12.toUpperCase());
		
		//15.String trim(): Removes the unwanted spaces from the front and end of a string.
		
		String s13="         Saurabh";
		System.out.println(s13.trim());
		
		String s14="Saurabh         ";
		System.out.println(s14.trim());
		
		//16. String replace(char oldchar, char newchar): Replaces old char with new char in a string.
		
		String s15="Kumar";
		System.out.println(s15.replace('K','T'));

		


		
	
			
	}
	
}
