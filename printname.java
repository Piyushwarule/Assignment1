import java.util.Scanner;
public class printname {

	public static void main(String[] args) {
		
//		Print your name
		System.out.println("Piyush Warule");
		
//		Print name 10 times
		for(int i=0;i<10;i++)
		{
			System.out.print("Piyush");
		}
		System.out.println("");
		
//		Print name 10 times on new line
		for(int i=0;i<10;i++)
		{
			System.out.println("Piyush Warule");
		}
		
//		using for loop
		for(int i=0;i<2;i++)
		{
			System.out.println("Piyush");
		}
		
//		using while loop
		int loop=1;
		while(loop<=2)
		{
			System.out.println("Piyush Warule");
			loop++;
		}
		
//      using do while loop
		int c=1;
		do{
			System.out.println("Piyush");
			c++;
		}while(c<=3);
		
//		read a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++)
		{
			System.out.println("Piyush Warule");
		}
		
//		prints your name in double quotes
		System.out.println("\"Piyush Warule\"");

	}

}
