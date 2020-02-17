package simplecompound;

import java.lang.Math;
import java.util.Scanner;

public class interest{
	double principle_amount, roi, interest_applied;
	int number_months;
	public void calc(){
		int option;
		double result;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		principle_amount = S.nextDouble();
		System.out.println("Enter the rate of interest");
		roi = S.nextDouble();
		System.out.println("Enter the option\n1.Simple interest\n2.Compound interest\n");
		option = S.nextInt();
		if(option==1){
			System.out.println("Enter the time period");
			number_months = S.nextInt();
			result = simple_interest(principle_amount, roi, number_months);
			System.out.println("\nThe amount to be paid "+result);
		}
		else{
			System.out.println("Enter the time period");
			number_months = S.nextInt();
			System.out.println("Enter the number of times interest is applied");
			interest_applied = S.nextDouble();
			result = compound_interest(principle_amount, roi, interest_applied, number_months);
			System.out.println("\nThe amount to be paid "+result);
		}
	}
	public double simple_interest(double amount,double r,int time){
		principle_amount = amount;
		roi = r;
		number_months = time;
		return ((number_months * principle_amount * roi)/100);
	}
	public double compound_interest(double amount,double r,double time,int num){
		principle_amount = amount;
		roi = r;
		number_months = num;
		interest_applied = time;
		return (principle_amount * (Math.pow((1+(roi*number_months)),(number_months*interest_applied))));
	}
}