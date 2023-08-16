package operators;
public class BitwiseOperator {
    public static void main(String[] args) {
        int x=2, y=6;
        System.out.println("x&y: "+(x&y));
        System.out.println("x|y: "+(x|y));
        System.out.println("x^y: "+(x^y));
        System.out.println("~x: "+(~x));
        System.out.println("~y: "+(~y));
        System.out.println("y>>x: "+(y>>x));
        System.out.println("y<<x: "+(y<<x));
        // 2 = 0010
        // 6 = 0110
        // & = 0010 = 2
        // | = 0110 = 6
        // ^ = 0100 = 4
        // ~2 = 1101 = -3
        // ~6 = 1001 = -7
        // 6>>2 = a>>n = a/2^n = 1
        // 6<<2 = a<<n = a*2^n = 24 
    }
}
