package data_structure;

import java.io.*;
import java.util.*;



public class OrderedListNumber {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner scanner = new Scanner(new File("/home/bridgeit/Documents/workspace-spring-tool-suite-4-4.1.2.RELEASE/JavaProgram/src/data_structure/lmk.txt"));
		try
		{		
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			while (scanner.hasNext()) {
			    if (scanner.hasNextInt()) {
			       
			    	list.add(scanner.nextInt());
			    } else {
			        scanner.next();
			    }
			}
			Collections.sort(list);
			
			for (Integer i: list) System.out.println(i);
			
			System.out.println("Contents in the LinkedList :: "+list);
			System.out.println("Size of the LinkedList :: "+list.size());
			System.out.println();
			
			System.out.println("Enter the number you want to search");
			Scanner sc1 = new Scanner(System.in);
			int number = sc1.nextInt();
			//int number1 = sc1.nextInt();
			boolean status = list.contains(number);
			if(status) 
			{
				System.out.println("List contains the searched element... "+number);
				list.remove(number);
				for (Integer i: list) System.out.println(i);
				System.out.println("Element has been found and removed successfully...");
				System.out.println("Contents in the LinkedList :: "+list);
				System.out.println();
			}
			else
			{
				System.out.println("List doesn't contains the searched element...");
				list.push(number);
				for (Integer i: list) System.out.println(i);
				System.out.println("The element is not in the list. It is added to the list...");
				System.out.println("Contents in the LinkedList :: "+list);
				System.out.println();
			}
			
			boolean isEMPTY = list.isEmpty();
			if(isEMPTY)
			{
				System.out.println("The list is EMPTY...");
			}
			else
			{
				System.out.println("The list is not EMPTY...");
				System.out.println("Size of the LinkedList :: "+list.size());
			}
			
			System.out.println("Index position is :: "+list.indexOf(number));
			
			}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}