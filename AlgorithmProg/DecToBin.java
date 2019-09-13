package AlgorithmProg;

import java.util.Scanner;

public class DecToBin {

	public static void binary(int num)
	{
		int[] bin = new int[100];
		bin[0]=0;
		int i = 0;
		
		while(num>0)
		{
				bin[i++] = num%2;
				num = num/2;
		}
		
		for(int j = i-1 ;j>0;j--)
		{
			System.out.print(bin[j]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int no=0;
				System.out.println("Enter the number");
				Scanner sc = new Scanner(System.in);
				no = sc.nextInt();
				
				binary(no);
	}

}
