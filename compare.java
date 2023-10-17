import java.util.*;
class Compare{
	public static void compare(String s1,String s2){
		System.out.println(s1.compareTo(s2));
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		compare(s1,s2);
	}
}
