package Tictaktoe;

import java.util.Scanner;

public class TictaktoeTest {

	public static void main(String[] args) 
	{
		tictaktoe t = new tictaktoe();
		Scanner s = new Scanner(System.in);
		int x=0,y=0;
		do
		{
			System.out.println(t.player==t.x?"Player X turn":"Player O turn");
			System.out.println("Enter x and y places :");
			x=s.nextInt();
			y=s.nextInt();
			
			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println("_______________________");
			t.displayWinner();
		}while(t.isEmpty);
	}

}
