package AlgorithmProg;

public class BinarySearchInt 
{

	public static void main(String[] args) 
	{
		int[] arr = {2, 5, 7, 9, 12, 14, 16, 18, 20, 24, 28};
		int search = 16;
		int result = Util.binarySearch1(arr, search);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element fount at psition "+result);
	}

}
