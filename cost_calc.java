package construction_cost;

import java.util.Scanner;

public class cost_calc{
	public void cost(){
		int quality, automated;
		double square_feet;
		Scanner S = new Scanner(System.in);
		System.out.println("Calculating house estimated cost\nEnter the number of square feet");
		square_feet = S.nextDouble();
		System.out.println("Enter the quality of house consruction material\n1.standard\n2.above standard \n3.high standard");
		quality = S.nextInt();
		int[] cost_value={1200, 1500, 1800, 2500};
		if(quality!=3){
			System.out.println("Cost for constuction is "+(square_feet * cost_value[quality-1]));
		}
		else if(quality==3){
			System.out.println("Enter whether automated(1) or not(0)");
			automated = S.nextInt();
			System.out.println("Cost for constuction is "+(square_feet * cost_value[quality]));			
		}
		else
			System.out.println("This option is not available");
	}
}