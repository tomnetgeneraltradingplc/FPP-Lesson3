package lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String firstName;
	private String lastName ;
	private LocalDate dateOfBirth;
int RHR=70;
float LB= 0.5f;
float UB= 0.85f;
public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

	public int calculateAge() {
		LocalDate today = LocalDate.now();
		return Period.between(this.dateOfBirth, today).getYears();
	}

	public int getMaximumHeartRate() {
		return 220 - this.calculateAge();
	}

	

public String getTargetHeartRateRange(){

	int RHR = 70;
	double AHR = this.getMaximumHeartRate() - RHR;
	double LB = 0.5;
	double UB = 0.85;
	double LBTHR = (AHR*LB) + RHR;
	double UBTHR = (AHR*UB) + RHR;
	String result = "The Result of Target Heart Rate Range is between " + LBTHR + " and " + UBTHR;
	return result;
	}
	@Override
	public String toString() {
	return "[firstName=" + firstName +
	", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth +
	",age = " + this.calculateAge()+
	",MHR = " + this.getMaximumHeartRate()+
	",THR = " + this.getTargetHeartRateRange()+
	"]";
	}


}