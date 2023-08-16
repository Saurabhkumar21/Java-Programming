package basics;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // int a=4, b=5, c=8;

        // if(a>b && a>c) {
        //     System.out.println(a);
        // }
        // else if(b>a && b>c) {
        //     System.out.println(b);
        // }
        // else{
        //     System.out.println(c);
        // }

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a<0) {
            a=a*-1;
        }
        System.out.println(a);

        sc.close();

        // float b=sc.nextFloat();
        // double c=sc.nextDouble();
        // byte d=sc.nextByte();
        // short e=sc.nextShort();
        // long f=sc.nextLong();
        // char g=sc.next().charAt(0);
        // boolean h=sc.nextBoolean();

    }
}
