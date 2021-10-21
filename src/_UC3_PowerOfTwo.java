package BasicCoreProgram;
import java.util.*;
public class _UC3_PowerOfTwo {
	void power(int num){
		int pow;
		for(int i=1;i<=num;i++) {
			pow=(int)Math.pow(2, i);
			System.out.println("2 power "+i+" is "+pow);
		}
		
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC3_PowerOfTwo rv=new _UC3_PowerOfTwo();
		System.out.println("Enter a Number :-");
		int num=inp.nextInt();
		if(num<32 && num>0)
		rv.power(num);
	}

}
