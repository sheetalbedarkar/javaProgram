package AlgorithmProg;

import java.util.Scanner;

public class AnagramStr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String s1=sc.next();
		
		System.out.println("Enter the String1:");
		String s2=sc.next();
        System.out.println(Util.anagram(s1,s2)?"Words are anagram":"words are not anagram");
	}

	
	
	
}
