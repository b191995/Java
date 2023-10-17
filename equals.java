import java.util.*;
class Equals{
	public static void equals(String s1,String s2){
		System.out.println(s1.equals(s2));
	}
	public static void ignoreCase(String s1,String s2){
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		equals(s1,s2);
		ignoreCase(s1,s2);
	}
}
