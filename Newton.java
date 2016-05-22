import java.util.Scanner;
import java.math.*;
public class Newton {

	double x1,x2,function,Dfunction,formula,l;
	
	public synchronized double value(double tr){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Initial value: ");
		x1 = input.nextDouble();
		
		System.out.println("\nEnter number of Iterations: ");
		l = input.nextDouble();
		
		for(int i=1;i <= l;i++){
			
		function = (3*x1)+ Math.sin(x1)-Math.exp(x1);
		System.out.println("\n"+i+"."+" value of Function is "+function);
		Dfunction = 3 + Math.cos(x1)-Math.exp(x1);
		System.out.println("value of Derivated Function is "+Dfunction);
		formula = x1 - (function/Dfunction);
		
		System.out.println("The Formulated Value is "+formula);
		x1= formula;
		
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newton n1 = new Newton();
		n1.value(0.767);
		
	}

}
