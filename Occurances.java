import java.util.*;
class Occurances{
public static int occured(String str,char ch){
	int c=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				c++;
			}
		}
		return c;
	} 
	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter a char:");
		char a=sc.next().charAt(0);
		int k=occured(str,a);
		System.out.println("The total number of occurances of "+a+" in "+str+" is "+k);
	}
}
