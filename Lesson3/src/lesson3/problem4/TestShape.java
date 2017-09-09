package lesson3.problem4;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		System.out.println("----------------------\n");

		String answer = scanner.nextLine();
		switch (answer) {
		case "C": {
			System.out.println("Enter the radius: ");
			int radius = scanner.nextInt();
			Circle circle = new Circle(radius);
			System.out.println("Area of Circle is " + circle.computeArea());
			break;
		}
		case "R": {
			System.out.println("Enter the width: ");
			int width = scanner.nextInt();
			System.out.println("Enter the height: ");
			int height = scanner.nextInt();
			Rectangle rectangle = new Rectangle(width, height);
			System.out.println("Area of Rectangle is =" + rectangle.computeArea());
			break;
		}
		case "T": {

			System.out.println("Enter the base: ");
			int base = scanner.nextInt();
			System.out.println("Enter the height : ");
			int height = scanner.nextInt();
			Triangle triangle = new Triangle(base, height);
			System.out.println("Area of Triangle is = " + triangle.computeArea());
			break;
		}
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
/*Output
Enter C for Circle
Enter R for Rectangle
Enter T for Triangle
----------------------

R
Enter the width: 
120
Enter the height: 
200
Area of Rectangle is =24000.0
*/