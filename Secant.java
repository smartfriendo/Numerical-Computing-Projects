import java.util.Scanner;
import java.math.*;
public class Secant {
	double x1,x2,function1,function2,function3,function4,tag,gat,cat,tr,trr,function41,gats,l,function31;
	
	public synchronized double values(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first value for Starting point: ");
		x1 = input.nextDouble();
		function1 = (3*x1)+Math.sin(x1)-Math.exp(x1);
		System.out.println("\n"+"The point at "+x1+" has a function "+"  F(x) = "+function1);
		System.out.println("Enter second value for Starting point: ");
		x2 = input.nextDouble();
		function2 = (3*x2)+Math.sin(x2)-Math.exp(x2);
		System.out.println("\n"+"The point at "+x2+" has a function "+"  F(x) = "+function2);
		function3 = x2 - function2 *(x1-x2/(function1 - function2));
		function4 = (3*function3)+Math.sin(function3)-Math.exp(function3);
		System.out.println("\nThe Formula value is "+function3+" and the function value is F(x) = "+function4);
		System.out.println("\n\n");
		Scanner input2 = new Scanner(System.in);
		
		
		System.out.println(x2+"      "+x1+"     "+function3+"      "+function4);
		return 0;
	}
		//System.out.println("\n"+"Enter you number of iteration: ");
		//l = input2.nextDouble();
		public synchronized double cr(){
		for(double i=0;i <= 26;i++){
		
		x2=x1;   // x2 == x1
		x1=function3;
		
		
		trr = (3*x1)+Math.sin(x1)-Math.exp(x1);   //formula
		tr = (3*x2)+Math.sin(x2)-Math.exp(x2);	 //function of x2
		function3 = x2 - tr *(x2-x1/(tr - trr));  //function of x1
		
		function41 = (3*function3)+Math.sin(function3)-Math.exp(function3);
		
		System.out.println(x2+"      "+x1+"      "+function3+"      "+function41);
		}
		return 0;
		}
	public static void main(String[] args) {
		Secant s1 = new Secant();
		s1.values();
		s1.cr();
		

	}

}
