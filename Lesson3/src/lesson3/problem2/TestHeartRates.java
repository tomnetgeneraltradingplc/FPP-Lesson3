package lesson3.problem2;

import java.time.LocalDate;

public class TestHeartRates {
public static void main(String[] args) {
		
	
HeartRates H1 = new HeartRates("Thomas", "Tibebu", LocalDate.of(1978, 6, 10));
System.out.println(H1);
}
}
/*Output
[firstName=Thomas, lastName=Tibebu, dateOfBirth=1978-06-10,age = 39,MHR = 181,THR = The Result of Target Heart Rate Range is between 125.5 and 164.35]
*/