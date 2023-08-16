package operators;
public class UnaryOperator {
   public static void main(String[] args) {
    int a=1, b=1;
    boolean boo=false;
    System.out.println("post-increment: "+ (a++));// 1
    System.out.println("pre-increment: "+ (++a));// 3
    System.out.println("post-decrement: "+ (b--));// 1
    System.out.println("pre-decrement: "+ (--b));// -1
    System.out.println("negation: "+ (!boo));
   }
}
