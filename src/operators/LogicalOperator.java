package operators;
public class LogicalOperator {
    public static void main(String[] args) {
        boolean x=true, y=false;
        System.out.println("x&&y: "+ (x&&y));//false
        System.out.println("x||y: "+ (x||y));// true
        System.out.println("Negation: "+ (!x));// false
    }
}
