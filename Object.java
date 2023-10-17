import java.util.*;
class Shape
{
	void getArea(int a){
		System.out.println("Area is: "+a);
	}
	void getPerimeter(int p){
		System.out.println("Perimeter is: "+p);
	}
}
class Square extends Shape{
	int s;
	Square(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		s=sc.nextInt();
	}
	void getArea(){
		int area=s*s;
		super.getArea(area);
	}
	void getPerimeter(){
		int p=4*s;
		super.getPerimeter(p);
	}
}
class Rectangle extends Shape{
	int l,b;
	Rectangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth:");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void getArea(){
		int area=l*b;
		super.getArea(area);
	}
	void getPerimeter(){
		int p=2*(l+b);
		super.getPerimeter(p);
	}
}
class Circle extends Shape{
	int r;
	final float pi=3.14f;
	Circle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		r=sc.nextInt();
	}
	void getArea(){
		int area=(int)(pi*r*r);
		super.getArea(area);
	}
	void getPerimeter(){
		int p=(int)(2*pi*r);
		super.getPerimeter(p);
	}
}
class Object{
	public static void main(String args[]){
		Square k=new Square();
		k.getArea();
		k.getPerimeter();
		Rectangle r=new Rectangle();
		r.getArea();
		r.getPerimeter();
		Circle c=new Circle();
		c.getArea();
		c.getPerimeter();
	}
}
