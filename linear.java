import java.util.*;
class linear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
int n=sc.nextInt();
int[] a=new int[n];
int i,j,t;
System.out.println("Enter array elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the search key:");
int k=sc.nextInt();
for(i=0;i<n;i++){
if(a[i]==k){
System.out.println("Key found at "+(i+1)+"th position");
break;
}}
if(i==n)
System.out.println("Key not found");
}}
