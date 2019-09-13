package AlgorithmProg;

import java.util.Scanner;

public class monthlyPayment {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		Double P,Y,R;
		System.out.println("Enter Principal: ");
		P=sc.nextDouble();
		System.out.println("Enter Year:");
		Y=sc.nextDouble();
		System.out.println("Enter Rate of interest: ");
		R=sc.nextDouble();
*/
		Double P=Double.parseDouble(args[0]);
		Double Y=Double.parseDouble(args[1]);
		Double R=Double.parseDouble(args[2]);
		Double result=Util.payment(P, Y, R);
		System.out.println("monthly payment="+result);
	}
	
	
	
	
	

}
