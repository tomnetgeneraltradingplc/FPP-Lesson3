package lesson3.problem4;

public final class Circle {
private double radius;

public Circle(double radius) {
	this.radius = radius;
}

public double getRadius() {
	return radius;
}
public double computeArea(){
return Math.PI*radius*radius;
}
}
