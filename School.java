import java.util.*;
class Person{
	String name,address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	String getName(){
		return name;
	}
	String getAddress(){
		return address;
	}
	public String toString(){
		return name+"("+address+")";
	}
}
class Student extends Person{
	int numCourse;
	String courses[];
	int grades[];
	final int maxCourse=30;
	Student(String name,String address){
		super(name,address);
		numCourse=0;
		courses=new String[maxCourse];
		grades=new int[maxCourse];
	}
	void addCourseGrade(String course,int grade){
		courses[numCourse]=course;
		grades[numCourse]=grade;
		numCourse++;
	}
	void printGrades(){
		int i;
		for(i=0;i<numCourse;i++)
		System.out.println(grades[i]+" ");	
	}
	double getAverageGrade(){
		double avg=0;
		int i;
		for(i=0;i<numCourse;i++)
		avg+=grades[i];
		return avg/numCourse;
	}
	public String toString(){
		return "Student:"+super.toString();
	}
}
class Teacher extends Person{
	int numCourse;
	String courses[];
	final int maxCourse=5;
	Teacher(String name,String address){
		super(name,address);
		numCourse=0;
		courses=new String[maxCourse];
	}
	boolean addCourse(String course){
		int i;
		for(i=0;i<numCourse;i++){
			if(courses[i].equals(course))
			return false;
		}
		courses[numCourse]=course;
		numCourse++;
		return true;
	}
	boolean removeCourse(String course){
		int i;
		int c=numCourse;
		for(i=0;i<numCourse;i++){
			if(courses[i].equals(course)){
				c=i;
				break;
			}
		}
		if(c==numCourse)
			return false;
		else{
			for(i=c;i<numCourse-1;i++)
				courses[i]=courses[i+1];
			numCourse--;
			return true;
		}
	}
	public String toString(){
		return "Teacher:"+super.toString();
	}
}
class School{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student s1 = new Student("Tan Ah Teck", "1 Happy Ave");
		s1.addCourseGrade("IM101", 97);
		s1.addCourseGrade("IM102", 68);
		s1.printGrades();
		System.out.println("Average is " + s1.getAverageGrade());
		Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
		System.out.println(t1);
		String[] courses = {"IM101", "IM102", "IM101"};
		for (String course: courses) {
		if (t1.addCourse(course)) {
		System.out.println(course + " added.");
		} else {
		System.out.println(course + " cannot be added.");
		}
		}
		for (String course: courses) {
		if (t1.removeCourse(course)) {
		System.out.println(course + " removed.");
		} else {
		System.out.println(course + " cannot be removed.");
		}
		}
		}
		}
