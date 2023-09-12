import java.util.*;
class lrgsml{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] a=new int[5];
int i;
System.out.println("Enter array elements:");
for(i=0;i<5;i++){
a[i]=sc.nextInt();
}
int m=a[0];
int x=a[0];
for(i=1;i<5;i++){
if(a[i]<m)
m=a[i];
if(a[i]>x)
x=a[i];
}
System.out.println("Largest of the given integers is: "+x);
System.out.println("Smallest of the given integers is: "+m);
}}
