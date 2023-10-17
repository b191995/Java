import java.util.*;
class Concat{
	public  static void concat(String s1,String s2){
		System.out.println("After concatenation: "+s1.concat(s2));
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		concat(s1,s2);
	}
}
