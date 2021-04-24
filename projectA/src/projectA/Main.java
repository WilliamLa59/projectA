package projectA;
import java.util.Scanner;
import java.io.File;
public class Main {

	public static void main(String[] args) {
		
		new GUI();
		
		Scanner askInput = new Scanner(System.in);
		
		//gets gender input
		System.out.println("Enter gender: ");
		formulas.gender = askInput.nextLine();
		System.out.println("gender = "+formulas.gender);
		
		//gets age input
		System.out.println("Enter age: ");
		formulas.age = askInput.nextInt();
		System.out.println("age = "+formulas.age);
		
		//asks whether user wants to use imperial or metric
		System.out.println("Will you give height/weight in Metric or Imperial? ");
		System.out.println("Answer true for metric, false for imperial: ");
		formulas.metric= askInput.nextBoolean();
		System.out.println("metric = "+formulas.metric);
		
		//gets height then weight in metric
		if(formulas.metric == true) {
			System.out.println("Enter height in cm: ");
			formulas.heightMetric = askInput.nextDouble();
			System.out.println("height = "+formulas.heightMetric);
			
			System.out.println("Enter weight in kg: ");
			formulas.weightMetric = askInput.nextDouble();
			System.out.println("weight = "+formulas.weightMetric);
		}
		//gets height then weight in imperial
		else {
			System.out.println("Enter height in inches");
			formulas.heightImperialInches = askInput.nextDouble();
			System.out.println("height = "+formulas.heightImperialInches);
			
			System.out.println("Enter weight in lbs: ");
			formulas.weightImperial = askInput.nextDouble();
			System.out.println("weight = "+formulas.weightImperial);
		}
		
		System.out.println("thank you");
		System.out.println("your Basal Metabolic Rate is: "+formulas.getBasalMetabolicRate());
		System.out.println("uwu");
		
		 }
	

}
