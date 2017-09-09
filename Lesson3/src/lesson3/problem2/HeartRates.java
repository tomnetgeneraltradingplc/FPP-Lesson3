package lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
String firstName;
String lastName ;
LocalDate dateOfBirth;
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
public int calculateAge(LocalDate dateOfBirth) {
    
	 LocalDate today = LocalDate.now();
	 Period age=Period.between(dateOfBirth, today);
	        
	return age.getYears();
	    
	}
public int MHR(){
	   int age = calculateAge(dateOfBirth);
	   int maximumHeartRate=220-age;
	   return maximumHeartRate;
	   
}

public int AHR(){
    
	   int Average=MHR()-RHR;
	   return Average;
	   
}
//public double LBTHR(){
//    
//	double Lower=(AHR()*LB)+RHR;
//	   return Lower;
//	   
//}
//public double UTHR(){
//    
//	double Upper=(AHR()*UB)+RHR;
//	   return Upper;   
//}
public String TargetHeartRateRange(){
	int Lower=(int) ((AHR()*LB)+RHR);
	int Upper=(int) ((AHR()*UB)+RHR);

return Lower + " - " + Upper + "%";

}

@Override
public String toString() {
	return "HeartRates [firstName=" + firstName + 
			", lastName=" + lastName + 
			", dateOfBirth=" + dateOfBirth + 
			", Person age=" + calculateAge(dateOfBirth) + 
			", MHR=" +   MHR()+
			", Target-Heart-Rate=" +   TargetHeartRateRange()+
			"]";
}
}