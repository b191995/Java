import java.util.*;
class sort{
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
for(i=0;i<n;i++){
for(j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}}}
System.out.println("Sorted array is:");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}}}
