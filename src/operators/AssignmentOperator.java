package operators;
public class AssignmentOperator {
    public static void main(String[] args) {
        int a=4;
        System.out.println("a+=2: "+(a+=2));//6
        System.out.println("a-=2: "+(a-=2));//4
        System.out.println("a*=2: "+(a*=2));//8
        System.out.println("a/=2: "+(a/=2));//4
        System.out.println("a%=2: "+(a%=2));//0
    }
    
}
