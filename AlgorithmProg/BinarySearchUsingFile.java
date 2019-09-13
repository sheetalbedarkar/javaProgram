package AlgorithmProg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingFile 
{
	//static String arr[];

	public static void main(String[] args) throws IOException 
	{
		File file = new File("/home/bridgeit/Documents/workspace-spring-tool-suite-4-4.1.2.RELEASE/JavaProgram/src/AlgorithmProg/aaa.txt");
		try
		{
			Scanner sc = new Scanner(file);

			String data=sc.nextLine();
			String arr1[] = data.split(",");
            Arrays.sort(arr1);
			System.out.println("which element you want to search");
			Scanner sc1 = new Scanner(System.in);
			String word = sc1.nextLine();
			int high=arr1.length-1;
			
				//String x = "xyz"; 
				int result =Util.Search(arr1, word,0,high);
				if(result == -1)
				{

					System.out.println("Element not found");

				}
				else
				{
					System.out.println("Element fount at psition "+result);

				}

		


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
}
