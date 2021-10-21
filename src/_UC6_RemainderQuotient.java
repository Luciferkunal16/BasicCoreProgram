package BasicCoreProgram;
import java.util.*;
public class _UC6_RemainderQuotient {
	void Formula(int dividend , int divisor) {
		System.out.println("Remainder is "+dividend%divisor);
		System.out.println("Quotient is "+dividend/divisor);
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC6_RemainderQuotient rv=new _UC6_RemainderQuotient();
		System.out.println("Enter the Dividend");
		int dividend=inp.nextInt();
		System.out.println("Enter the Divisor");
		int divisor=inp.nextInt();
		rv.Formula(dividend,divisor);
	}

}
