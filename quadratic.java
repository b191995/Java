import java.util.*;
class quadratic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the coefficient of x2:");
int a=sc.nextInt();
System.out.println("Enter the coefficient of x:");
int b=sc.nextInt();
System.out.println("Enter the constant:");
int c=sc.nextInt();
int k=(b*b)-(4*a*c);
if(k<0){
double h=Math.sqrt(-1*k);
h=(double)h/2;
double u=(double)b/2;
System.out.print("Solutions for given equation are: "+u+"+"+h+"i  , ");
System.out.println(u+"-"+h+"i");
}
else{
double h=Math.sqrt(k);
double u=(double)(b+h)/2;
double v=(double)(b-h)/2;
System.out.print("Solutions for given equation are: "+u);
System.out.println(" , "+v);
}}}
