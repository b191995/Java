import java.util.*;
class prmfact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int k=2;
int c,f;
System.out.println("Prime factors of "+a+" are");
while(k<=a){
if(a%k==0){
c=0;
f=2;
while(f<k){
if(k%f==0)
c++;
f++;
}
if(c==0)
System.out.println(k);
}
k++;
}}}
