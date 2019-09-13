import java.util.Scanner;

public class ReplaceStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username : ");
		String username = sc.next();
		int a = username.length();
		if(a<3)
		{
			System.out.println("Length of the username should be greater than 3");
		}
		else
		{
			System.out.println("String before replacement");
			System.out.println("Hello...!!! " +username+  "How are you ??");
			username = username.replace(username,"Sheetal");
			System.out.println("String after replacement");
			System.out.println("Hello...!!! " +username+  "How are you ??");
		}
	}
}