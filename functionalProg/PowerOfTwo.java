
public class PowerOfTwo {

	public static void main(String[] args)
	{

		int n = Integer.parseInt(args[0]);
		int i = 0;
		int power = 1;
		if(n<31 && n>=0)
		{
			while(i<=n)
			{
				System.out.println(i+ " " +power);
				power = 2 * power;
				i = i+1;
			}
		}
		else
			System.out.println("The value of N should be in range of 0 to 32");
	}
}