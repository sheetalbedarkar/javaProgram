package AlgorithmProg;

import java.util.Scanner;

public class BinarySearch 
{
	
	public static void main(String[] args) 
	{
		String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "xyz"};
		String x = "xyz";

		int result = Util.binarySearch(arr, x);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element fount at psition "+result);
	}

}
