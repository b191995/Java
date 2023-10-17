import java.util.*;
class Circle{
	int radius;
	Circle(){
		this.radius=radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public double getPerimeter(){
		return 2*3.14*radius;
	}
}
class Area{
	public static void main(String args[]){
		Circle c1=new Circle();
		c1.radius=5;
		Circle c2=new Circle();
		c2.radius=10;
		Circle c3=new Circle();
		c3.radius=15;
		System.out.println("Area of c1 is "+c1.getArea());
		System.out.println("Perimeter of c1 is "+c1.getPerimeter());
		System.out.println("Area of c2 is "+c2.getArea());
		System.out.println("Perimeter of c2 is "+c2.getPerimeter());
		System.out.println("Area of c3 is "+c3.getArea());
		System.out.println("Perimeter of c3 is "+c3.getPerimeter());
	}
}
