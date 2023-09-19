import java.util.*;
class sort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Binary bs=new Binary();
System.out.println("Enter size:");
int n=sc.nextInt();
int[] a=new int[n];
int i,j,t,m;
System.out.println("Enter array elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the key:");
int k=sc.nextInt();
int r=bs.bin(0,n-1,a,k);
if(r==-1)
System.out.println("Key not found");
else
System.out.println("Key found at "+(r+1)+" position");
}}
class Binary{
int bin(int l,int h,int a[],int k){
int i,j,m,t;
for(i=0;i<=h;i++){
for(j=0;j<h-i;j++){
if(a[j]>a[j+1]){
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}}}
for(i=l;i<=h;i++){
System.out.print(a[i]+" ");
}
while(l<=h){
m=(l+h)/2;
if(a[m]==k){

return m;
}
else if(a[m]>k)
h=m-1;
else
l=m+1;
}
return -1;
}}
