package data_structure;

public class PrimeWithArray {
	public static void primeNum()
	{	int count=1;
		for(int no = 2; no<=1000; no++)
		{
			int temp = 0;
			for(int i = 2; i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp = temp + 1;
				}
			}
			if(temp == 0)
			{
				count++;
				System.out.print(no+" ");
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		primeNum();
	}

}
