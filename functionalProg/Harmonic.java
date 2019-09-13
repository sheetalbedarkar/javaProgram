import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
	System.out.println("Enter any number :");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	System.out.println("The Harmonic series is : ");
	double result = 0.0;
	//while(num > 0)
	for( int i=1;i<=num;++i)
	{
		
		System.out.print("1/"+i+"+");
		result = result + (double) 1 / i;
	}
	
	System.out.println("\n The output of harmonic number is :"+result);
	}

}
