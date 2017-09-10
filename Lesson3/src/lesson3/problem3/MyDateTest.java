package lesson3.problem3;

import java.util.Scanner;

public class MyDateTest {
	public static void main(String[] args) {
		boolean continueExecution = false;
		do {
			System.out.println("Enter 1 for format : MM/DD/YYYY");
			System.out.println("Enter 2 for format : Month DD,YYYY");
			System.out.println("Enter 3 for format : DDD YYYY");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your choice :");
			Scanner scanner = new Scanner(System.in);
			String userSelection = scanner.nextLine();
			switch (userSelection) {
			case "1":
				System.out.println("Choice 1");
				System.out.println("Enter Month :");
				int month = scanner.nextInt();
				System.out.println("Enter Day");
				int day = scanner.nextInt();
				System.out.println("Enter Year");
				int year = scanner.nextInt();
				MyDate myDate = new MyDate();
				System.out.println("MM/dd/yyyy : " + myDate.getformat1(month, day, year));
				System.out.println("MMMM dd,yyyy : " + myDate.getformat2(month, day, year));
				System.out.println("DDD yyyy : " + myDate.getformat3(month, day, year));
				break;
			case "2":
				System.out.println("Choice 2");
				System.out.println("Enter Month in text");
				System.out.println("Enter Day");
				System.out.println("Enter Year");
				break;
			case "3":
				System.out.println("Choice 3");
				System.out.println("Enter Day of Year");
				System.out.println("Enter Year");
				break;
			case "4":
				System.out.println("You Exit");
				break;
			
			}
			System.out.println("Do you want to Continue : ");
			String usercontinueExecution = scanner.nextLine();
			if (usercontinueExecution.equalsIgnoreCase("Y")) {
				continueExecution = true;
			} 
			else {
				continueExecution = false;
			}
		} while (continueExecution);
		System.out.println("Terminated");
	}
}
/*Output
Enter 1 for format : MM/DD/YYYY
Enter 2 for format : Month DD,YYYY
Enter 3 for format : DDD YYYY
Enter 4 to exit
Enter your choice :
1
Choice 1
Enter Month :
12
Enter Day
28
Enter Year
2015
MM/dd/yyyy : 12/28/2015
MMMM dd,yyyy : December 28,2015
DDD yyyy : 362 2015
Do you want to Continue : N
Terminated
*/