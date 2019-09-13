import java.util.Scanner;

public class PrimeFact {

	public static void main(String[] args)
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = sc.nextInt();
		for(int i = 2; (i*i) <= number; i++)
		{
			while(number%i==0)
			{
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number>1)
		{
			System.out.println(number);
		}
		else
		{
			System.out.println("");
		}

	}
}
