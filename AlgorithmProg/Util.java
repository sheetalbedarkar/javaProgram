package AlgorithmProg;

import java.sql.Date;

public class Util {
/****************************************
			//Anagram Program//
*****************************************/

	public static boolean anagram(String first,String second)
	{
		if(first.length()!=second.length())
		{
			return false;
		}

		for(int i=0;i<second.length();i++)
		{
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
			{
				return false;
			}
		}
		return true;

	}

/****************************************
		//PrimeNumber Program//
*****************************************/

	public static void primeNum()
	{
		for(int no = 2; no<=1000; no++)
		{
			int temp = 0;
			for(int i = 2; i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp = temp + 1;
				}
			}
			if(temp == 0)
			{
				System.out.print(no+" ");
			}
		}

	}

/*************************************************
//Anagram and Palindrome of PrimeNumber Program//
**************************************************/
	public static void Palindrome1() 
	{	
		for(int no = 2; no<=1000; no++)
		{
			int temp = 0, temp1=0, rev= 0; 
			for(int i = 2; i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp = temp + 1;
				}
			}
			if(temp == 0)
			{
				
				temp1=no;
					while(temp1>0)
					{
						rev = (rev*10)+(temp1%10);
						temp1 = temp1/10;
					}
				
					if(rev == no)
					{
						System.out.print(rev+" ");
					}
			}
		}
	}


/*************************************************
	//Binary Search Program for String//
**************************************************/

	static int binarySearch(String[] arr, String x)
	{
		int low = 0, high = arr.length - 1;
		while(low <= high)
		{
			int mid = (low +high)/2;
			int res = x.compareTo(arr[mid]);

			if(res == 0)
			{				
				return mid;
			}
			else if((x.compareTo(arr[mid]))> 0)
			{	
				
				low = mid + 1;
			}
			else
			{
				
				high = mid - 1;
			}

		}
		return -1;
	}
	
	
	
	static int Search(String[] arr, String x,int low,int high)
	{
		
		int mid = Math.round(low +high)/2;
		while(low <= high)
		{
	
			int res = x.compareTo(arr[mid]);

			if(res == 0)
			{				
				return mid;
			}
			else if(res > 0)
			{	
				
				low = mid + 1;
			}
			else
			{
				
				high = mid - 1;
			}
			mid = Math.round(low +high)/2;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	

/*************************************************
	//Binary Search Program for Integer//
**************************************************/

	static int binarySearch1(int arr[], int search)
	{
		int low = 0, high = arr.length - 1;
		int mid = (low+high)/2;
		while(low <= high)
		{

			if(search == arr[mid])
			{
				return mid;
			}
			else if(search>arr[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
			mid = (low+high)/2;
		}
		return -1;
	}



/*************************************************
    	//Bubble sort Program for Integer//
**************************************************/


	public static void bubblesortInteger(int b[]) 
	{
		int temp;
		int n=b.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			} 
		}
		System.out.println("Sorted array is::");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}

/*************************************************
		//Bubble sort Program for String//
**************************************************/


	public static void bubblesortString(String a[])
	{
		String temp;

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)	
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is::");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

/*************************************************
    //Insertion sort Program for Integer//
**************************************************/


	public static void insertionsort(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

/*************************************************
	//Insertion sort  Program for String//
**************************************************/

	public static void insertionsortString(String str[])
	{
		String temp="";

		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}

		System.out.println("Sorted array is::");
		for(int i=0;i<str.length;i++) 
		{
			System.out.println(str[i]);
		}
	}

/*************************************************
	//Monthly Payment calculate Program //
**************************************************/

	public static double payment(double P, double Y, double R)
	{
		double n = 12 * Y;
		double r = R / ( 12 * 100 );
		double pay = P * r / ( 1 - Math.pow((1 + r), -n));
		return pay;
	}

	
/*************************************************
		//Temperature Conversion//
**************************************************/

	public static double ToFahrenheit(double ctemp)
	{
		return (ctemp * 9/5)+32;
	}
	
	public static double ToCelsius(double ftemp)
	{
		return (ftemp - 32 ) * 5/9 ;
	}

/*************************************************
			//Day of Week//
**************************************************/


	public static int dayOfWeek(int d,int m,int y)
	{
		
		int y0,x,m0,d0;
		
		y0=y-(14-m)/12;
		x=y0+(y0/4)-(y0/100)+(y0/400);
        m0=m+12*((14-m)/12)-2;		
		return d0=(d+x+31*m0/12)%7;
		
	}

/*************************************************
			//Vending Machine//
**************************************************/
	
	static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
	static int total, i;
	static void note(int value)
	{
		
		if(value/notes[i] != 0)
		{
			total += (value/notes[i]);
			System.out.println(total);
			System.out.println(notes[i]+" is notes "+value/notes[i]);
			value = value % notes[i];
			
		}
		i++;
		if(value == 0)
		{
			System.out.println("Total notes :: "+total);
			return;
		}
		note(value);
	}

	

	}

	
	
	
	
	






















