import java.util.*;
class calci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the operator:");
char o=sc.next().charAt(0);
System.out.println("Enter the operands:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result is:");
switch (o){
case '+': System.out.println(a+b);
break;
case '-': System.out.println(a-b);
break;
case '*': System.out.println(a*b);
break;
case '/': System.out.println((float)a/b);
}}}
