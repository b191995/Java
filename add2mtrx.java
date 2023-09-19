import java.util.*;
class Add2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][] a=new int[r][c];
		int [][] b=new int[r][c];
		int i,j;
		System.out.println("Enter the elements of 1st matrix:");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix:");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				b[i][j]=sc.nextInt();
			}
		}	
		System.out.println("Addition of the matrices is:");	
		int k[][]=new int[r][c];
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				k[i][j]=a[i][j]+b[i][j];
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
	}
}
