import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		int count = 0;
		int temp=year;
		while(temp>0)
		{
			temp = temp/10;
			count = count + 1;
		}
		if(count==4)
		{
			if(((year%4==0) && (year%100!=0)) || (year%400==0))
			{
				System.out.println(year+ " is the leap year");
			}
			else
			{
				System.out.println(year+ " is not the leap year");
			}
		}
		else
			System.out.println("Year should be 4 digits");

	}

}


