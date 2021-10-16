//example of armstronng numbers are 0,1,153,370,371,407
import java.util.Scanner;
public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int num = number, length = 0, res = 0;
		
		while(num!=0){
		    length++;
		    num/=10;
		}
		num = number;
		while(num!=0){
		    int rem = num%10;
		    res = res+(int)Math.pow(rem,length);
		    num/=10;
		}
		if(res == number){
		    System.out.println("ARMSTRONG NUMBER");
		}
		else{
		    System.out.println(" NOT AN ARMSTRONG NUMBER");
		}
		sc.close();													
	}
}