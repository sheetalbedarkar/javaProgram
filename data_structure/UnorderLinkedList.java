package data_structure;

import java.io.File;
import java.util.*;

public class UnorderLinkedList 
{
	
	public static void main(String[] args) 
	{
		File file = new File("/home/bridgeit/Documents/workspace-spring-tool-suite-4-4.1.2.RELEASE/JavaProgram/src/data_structure/mno.txt");
		try
		{
			Scanner sc = new Scanner(file);
			String data = sc.nextLine();
			
			String arr[]= data.split(" ");
		
		LinkedList<String> list = new LinkedList<>();
			for(int i = 0; i<arr.length;i++)
			{
				list.addLast(arr[i]);
			}
		/*list.add("Nikita");
		list.addFirst("Pooja");
		list.add("Kaveri");
		list.add(2,"Sagar");
		list.add("Tanuja");
		list.addFirst("Priyanka");
		list.addLast("Dipali");
		list.add("Manju");
		list.add("Sandhya");
		list.add("Shweta");
		list.add("Neha");*/
		System.out.println("Contents in the LinkedList :: "+list);
		System.out.println("Size of the LinkedList :: "+list.size());
		System.out.println();
		
		/*list.remove(6);
		list.remove("Shweta");
		list.isEmpty();
		list.removeFirst();
		list.removeLast();*/
		System.out.println("Contents of the LinkedList after deletion :: "+list);
		System.out.println("Size of the LinkedList :: "+list.size());
		System.out.println("Enter the word you want to search");
		
		Scanner sc1 = new Scanner(System.in);
		String word = sc1.next();
		boolean status = list.contains(word);
		if(status)
		{
			System.out.println("List contains the searched element... ");
			list.remove(word);
			System.out.println("Element has been found and removed successfully...");
			System.out.println("Contents in the LinkedList :: "+list);
			System.out.println();
		}
		else
		{
			System.out.println("List doesn't contains the searched element...");
			list.push(word);
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
		
		System.out.println("Index position is :: "+list.indexOf(word));
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
