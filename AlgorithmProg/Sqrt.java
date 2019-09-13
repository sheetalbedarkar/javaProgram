package AlgorithmProg;

public class Sqrt {

	/*initialize t = c
			- replace t with the average of c/t and t
			- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;

	*/
	
	public static double Sqrt(Double c)
	{
		double epsilon= 1.0e-15;
		double t=c;
		
		while(Math.abs(t-c/t)> epsilon*t)
		{
			t=(c/t+t)/2;
		}
		return t;
	}
	
	
		public static void main(String[] args) {
		Double c=Double.parseDouble(args[0]);
		double res=Sqrt(c);
		System.out.println("Square root of "+c+" is "+res);
		
	}

}
