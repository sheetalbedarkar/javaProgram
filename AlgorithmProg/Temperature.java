package AlgorithmProg;

import java.util.Scanner;

public class Temperature {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ftemp,ctemp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter temperature in Celsius : ");
		 ctemp=sc.nextDouble();
		 System.out.println("Temperature in Fahrenheit : "+Util.ToFahrenheit(ctemp));
		
		System.out.println("Enter temperature in Fahrenheit : ");
		 ftemp=sc.nextDouble();
		 System.out.println("Temperature in Celsius : "+
		 Util.ToCelsius(ftemp));

	}

}
