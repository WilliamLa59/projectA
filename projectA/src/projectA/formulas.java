package projectA;

public class formulas {
	
	static double bmr;
	static double heightMetric;
	static double weightMetric;
	static double heightImperialFeet;
	static double heightImperialInches;
	static double weightImperial;
	static double imperialToMetric;
	static double convertedWeightMetric;
	static double convertedHeightMetric;
	static int age;
	static boolean metric;
	public static String gender;
	
	//converts imperial to metric
	private static double getMetricHeight(){
			 //adds the feet and inches given and returns total inches
			 double heightImperialInchesTotal = heightImperialInches + heightImperialFeet*12;
			 
			 //converts total inches to total cm for height
			 convertedHeightMetric = heightImperialInchesTotal*2.54;
			 
		return convertedHeightMetric;
	}
	
	private static double getMetricWeight(){
		
			 //converts weight in lbs to kg
			 convertedWeightMetric = weightImperial*0.45359237;
		return convertedWeightMetric;	 
	}
	
	
	
	//calculates basal metabolic rate
	public static double getBasalMetabolicRate() {
		
		if(gender == "male") {
			//male metric formula
			if(metric == true) {
				bmr = 66.47+(13.75*weightMetric)+(5.003*heightMetric)-(6.755*age);
			}
			//male imperial formula
			else {
				bmr = 66.47+(13.75 * getMetricWeight()) + (5.003 * getMetricHeight()) - (6.755 * age);
			}
		}
		else {
			//female metric formula
			if(metric == true) {
				bmr = 655.1+(9.563*weightMetric)+(1.85*heightMetric)-(4.676*age);
			}
			//female imperial formula
			else {
				bmr = 655.1+(9.563 * getMetricWeight())+(1.85 * getMetricHeight())-(4.676*age);
			}
		}
		return bmr;
	}
	
	public static double getBMR() {
		
		bmr=0;
		if (gender == "male") {
			bmr = 66.47 + (13.75*weightMetric) + (5.003*heightMetric) - (6.755*age);
		}else if (gender == "female") {
			bmr = 655.1 + (9.563*weightMetric) + (1.85*heightMetric) - (4.676*age);
		}
		
		return bmr;
	}
	
	
}
