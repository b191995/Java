import java.util.*;
class StrOrder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		String[] a=new String[n];
		int i,j;
		String t;
		System.out.println("Enter names:");
		for(i=0;i<n;i++){
			a[i]=sc.next();
		}
		//Arrays.sort(a);
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j].compareTo(a[j+1])>0){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Sorted list is:");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
