package projectA;

public class formulas {
	
	double bmr;
	double heightMetric;
	double weightMetric;
	double heightImperial;
	double weightImperial;
	double imperialToMetric;
	
	int age;
	boolean metric;
	String gender;
	
	//calculates basal metabolic rate
	private double basalMetabolicRate() {
		if(gender == "male") {
			//male metric formula
			if(metric = true) {
				bmr = 66.47+(13.75*weightMetric)+(5.003*heightMetric)-(6.755*age);
			}
			//male imperial formula
			else {
				bmr = 66.47+(13.75*weightImperial)+(5.003*heightImperial)-(6.755*age);
			}
		}
		else {
			//female metric formula
			if(metric = true) {
				bmr = 655.1+(9.563*weightMetric)+(1.85*heightMetric)-(4.676*age);
			}
			//female imperial formula
			else {
				bmr = 655.1+(9.563*weightImperial)+(1.85*heightImperial)-(4.676*age);
			}
		}
		
		return 4;
	}
}
