import java.util.*;
class vowels{
	public static void vowel(String s1){
		for(int i=0;i<s1.length;i++){
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
				System.out.println(s1.charAt(i));
				cv++;
			}
		}
		int cc=s1.length-cv;
		System.out.println("Number of Vowels in "+s1+ " are "+cv);
		System.out.println("Number of Consonants in "+s1+ " are "+cc);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		vowel(str);
	}
}
