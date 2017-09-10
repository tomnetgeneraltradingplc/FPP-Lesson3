package lesson3.problem3;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import lesson3.problem4.Circle;
import lesson3.problem4.Rectangle;
import lesson3.problem4.Triangle;
public class MyDate {
	private GregorianCalendar date = null; 
	private String[] months = new String[]{ "january", "february", "march", "april", "may", 
	                                "june", "july", "august", "september", "october", "november", "december" }; 
	public MyDate(int month, int day, int year) { 
	    date = new GregorianCalendar(year, month-1, day); 
	} 

	public MyDate(String month, int day, int year) { 
	    date = new GregorianCalendar(year, this.getMonth(month), day); 
	} 

	public MyDate(int dayOfYear, int year) { 
	    date = new GregorianCalendar(); 
	    date.set(Calendar.DAY_OF_YEAR, dayOfYear); 
	    date.set(Calendar.YEAR, year); 
	} 
	private int getMonth(String month) { 
	    for (int i=0; i<months.length; ++i) 
	      if (month.toLowerCase().equals(months)) //equals(months)) 
	        return i; 
	    return 0; 
	} 
	public String toString() { 
	    return date.get(Calendar.MONTH)+1 + "-" + date.get(Calendar.DATE) + "-" + date.get(Calendar.YEAR); 
	} 
	public static void main(String[] args) {
		
        
        
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to exit");
		System.out.println("----------------------\n");
		String answer = scanner.nextLine();
		switch (answer) {
		case "1": {
			System.out.println("Enter the month by number: ");
			int month = scanner.nextInt();
			System.out.println("Enter the day by number: ");
			int day = scanner.nextInt();
			System.out.println("Enter the year by number: ");
			int year = scanner.nextInt();
			MyDate d1 = new MyDate(month,day,year);
			System.out.println("Area of Circle is " + circle.computeArea());
			break;
		}
		case "2": {
			System.out.println("Enter the width: ");
			int width = scanner.nextInt();
			System.out.println("Enter the height: ");
			int height = scanner.nextInt();
			Rectangle rectangle = new Rectangle(width, height);
			System.out.println("Area of Rectangle is =" + rectangle.computeArea());
			break;
		}
		case "3": {

			System.out.println("Enter the base: ");
			int base = scanner.nextInt();
			System.out.println("Enter the height : ");
			int height = scanner.nextInt();
			Triangle triangle = new Triangle(base, height);
			System.out.println("Area of Triangle is = " + triangle.computeArea());
			break;
		}
		default:
			System.out.println("You exited");
			System.exit(4);
			break;
		}
	}

}
//		scanner.close();
		
	/*Output
	 * Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
------------------------------

Choose your Choice: 
*/	
	 
		


