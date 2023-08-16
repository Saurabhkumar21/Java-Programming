package operators;
public class TernaryOperator {
    public static void main(String[] args) {
        int a=4, b=8, result, c=5, result1 ;
        if(b>a) {
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
        result = b>a ? b : a;
        System.out.println(result);

        result1 = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;
        System.out.println(result1);
    }
}
