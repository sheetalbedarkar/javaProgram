import java.util.Scanner;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
	 int heads=0;
	 int tails=0;
	 int counter=1;
	 double randNum=0.0; 
	 double Hperc,Tperc;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("How many times will the coin be fliped:");
	 int flips=sc.nextInt();
	 if(flips<0)
	 {
		 System.out.println("please enter positive number");
	 }
	 else
	 {
	 while(counter<=flips)
	 {
		 randNum=Math.random();
		 System.out.print(counter+ "\t"+randNum);
		 
		 if(randNum < 0.5)
		 {
			 heads++;
			 System.out.println("\t Head");
		 }
		 else
		 {
			 tails++;
			 System.out.println("\t Tail");
		 }
		 counter++;
		
	 }
	
	
	 System.out.println("number of heads "+heads);
	 System.out.println("number of tails "+tails);
	 Hperc=(heads*100/flips);
	 System.out.println("Heads percentage:"+Hperc);
	 Tperc=(tails*100/flips);	
	 System.out.println("Tails percentage:"+Tperc);
	}
	}
	
}
