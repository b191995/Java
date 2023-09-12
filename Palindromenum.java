import java.util.*;
class pal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int n=a;
int p=0,r=0;
while(a!=0){
r=a%10;
a=a/10;
p=(p*10)+r;
}
if(p==n)
System.out.println("Palindrome Number");
else
System.out.println("Not a Palindrome");
}}
