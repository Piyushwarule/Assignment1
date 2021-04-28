import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++)
		{
			System.out.println("Piyush Warule");
		}
	}catch(Exception e) {
		System.err.println("enter a integer value only");
	}
	
	}

}
