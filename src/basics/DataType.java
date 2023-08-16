package basics;
public class DataType {
    public static void main (String[] args) {
		int x=11; //-2147483648 to 2147483647 , 32 bits = 4 byte
		System.out.println(x);

		float y=2.2f; //upto 7 decimal digits , 32 bits = 4 byte
		System.out.println(y);

		double z=2.425688d;//upto 16 decimal digits , 64 bits = 8 byte
		System.out.println(z);

		char ch='a';// 16 bits = 2 byte
		System.out.println(ch);

		boolean boo=true;// 1 bit
		System.out.println("your value is : "+boo);

		byte by=4; //-128 to 127 , 8 bits = 1 byte
		System.out.println("your value is: "+by);

		short sh=6; //-32768 to 32767  , 16 bits = 2 byte
		System.out.println("your value is: "+sh);

		long lo=7L;// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 ,  64bits = 8 byte
		System.out.println("your value is: "+lo);
	}    
}
