import java.util.Scanner;
import java.math.*;
public class Java {
	
	double x,x1,average,function2,c;
	double i;
	
	 
        public synchronized double limits(double r){
		Scanner input = new Scanner(System.in);
		System.out.println("\t\t\tBISECTION METHOD");
		System.out.println("\n\nF(x) = x^2 - 0.8082x - 7.46148");
		System.out.println("Enter your first lowest Limit: ");
		x = input.nextDouble();
		double function = Math.pow(x,2) - (0.8082*x) - 7.46148;
		System.out.println(function);
		
		System.out.println("Enter your second highest Limit: ");
		x1 = input.nextDouble();
		double function1 = Math.pow(x1,2) - (0.8082*x1) - 7.46148;
		System.out.println(function1+"\n");
		return 0;
	}
	
	public synchronized double equalization(double blue){
		Scanner input2 = new Scanner(System.in);
		System.out.println("\nEnter the Number of Iteration you want: ");
		i = input2.nextInt();
		for(double m=1;m <=i;m++){
		
		c = (x+x1)/2;
		System.out.println("Average = "+c);
		function2 = Math.pow(c,2) - (0.8082*c) - 7.46148;
		if (function2 < 0){
			x=c;
		    x1 = x1;
		}
		    else if (function2 > 0)
		    {
		    	x1=c;
		    	x=x;
		    }
		}
		System.out.println("\nA(negative): "+x+"    B(positive): "+x1);
		System.out.println("Expected Root is "+c);
		return 0;
	}
	
	public static void main(String[] args) {
		Java j1 = new Java();
		j1.limits(44);
		j1.equalization(45.444);
		

	}

}
