
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float w,h = 0;
	int k;
	
	System.out.println("Enter your Wight (1 for kg and 2 for  pound)");
	k=sc.nextInt();
	System.out.print("Enter:");
	
	/*If user Enter 1 than direct kg value scan 
	 * other wise as we know that 1pound=0.453592Kg*/
	
	if(k==1)w=sc.nextFloat();
	else {
		float e=sc.nextFloat();
		w=e*0.453592f;
	}
	
	
	System.out.println("Enter your hight( 1 for feet and 2 for  inch and 3 for feet+inch)");
	k=sc.nextInt();
	System.out.print("Enter:");
	
	/*If Enter 1 than direct scan in feet and 1feet=.3048f meter
	 * if User Enter 2 than scan value as inches only than /12 and than convert in to meter*
	 * and at last if 3 than just converts inch into feet and than add with first input and than to meter*/
	
	
	if(k==1) h=sc.nextFloat()*0.3048f;
	else if(k==2)h=(sc.nextFloat()/12)*0.3048f;
	else {
		float h1,h2;
		System.out.println("Feet inch");
		h1=sc.nextFloat();
		h2=sc.nextFloat();
		h=(h1+h2/12)*0.3048f;
	}
	
	sc.close();
	
	float BMI=w/(h*h);
	
	
	/*if BMI is <18.5 print "Person is Under-weight",
	 *  if BMI is >18.5 & < 24.9 print "Person is having Normal  
	 *  BMI" & if BMI is >25 & <29.9 print "Person is Over-weight", 
	 *  if BMI>30 print "Person Is Obese".*/
	
	
	if(BMI<18.5) System.out.print("Person is Under-weight:");
	else if(BMI>18.5 && BMI<24.9) System.out.print("Person is having Normal  BMI:");
	else if(BMI>25 && BMI<29.9) System.out.print("Person is Over-weight:");
	else System.out.print("Person Is Obese:");
	
	System.out.printf("%.2f",BMI);
	
	
	}

}