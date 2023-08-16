package basics;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter a number:" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Your value is : "+n); 

        System.out.println("Enter a byte data type:" );
        byte by = sc.nextByte();
        System.out.println("Your byte value is : "+by); 

        System.out.println("Enter a short data type:" );
        short sh = sc.nextShort();
        System.out.println("Your short value is : "+sh); 

        System.out.println("Enter a long data type:" );
        long lo = sc.nextLong();
        System.out.println("Your long value is : "+lo); 

        System.out.println("Enter a float data type:" );
        float fl = sc.nextFloat();
        System.out.println("Your float value is : "+fl); 

        System.out.println("Enter a double data type:" );
        double d = sc.nextDouble();
        System.out.println("Your long value is : "+d); 

        System.out.println("Enter a boolean data type:" );
        boolean bo = sc.nextBoolean();
        System.out.println("Your boolean value is : "+bo); 

        System.out.println("Enter a char data type:" );
        char c = sc.next().charAt(0);
        System.out.println("Your char value is : "+c); 

        sc.close();
    }
}
