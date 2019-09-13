package data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome_checker {

	
	public static void main(String[] args) 
	{
		
		DequeMain<Character> dequeue=new DequeMain<Character>();
        System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		int flag=0;
		
		//Queue queue = new LinkedList();
		
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		dequeue.addRear(ch);
		}
		
		while(dequeue.size()>1)
		{
			if(dequeue.removeFront()!=dequeue.removerear())
			{
				flag=1;
				break;
				
			}
		}
		
		if(flag==0)
		{
		System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
