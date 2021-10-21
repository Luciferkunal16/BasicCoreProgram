package BasicCoreProgram;
import java.util.*;
public class _UC4_HarmonicNumber {
	float harmonicNumber(int num){
		float harmonicFormula=0;
		for(float i=2;i<num;i++) {
			harmonicFormula=(1/i)+harmonicFormula;
		}
		return harmonicFormula;
	}
	public static void main(String[] args) {
		_UC4_HarmonicNumber rv=new _UC4_HarmonicNumber();
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter A Number Whose Harmonic Value u need");
		int num=inp.nextInt();
		if (num>0)
		System.out.println("Harmonic value is "+rv.harmonicNumber(num));
				
	}

}
