import java.util.*;
class Mul2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns of 1st matrix:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter no. of rows and columns of 2nd matrix:");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int [][] a=new int[r1][c1];
		int [][] b=new int[r2][c2];
		int i,j,k,s=0;
		if(c1==r2){
			System.out.println("Enter the elements of 1st matrix:");
			for(i=0;i<r1;i++){
				for(j=0;j<c1;j++){
					a[i][j]=sc.nextInt();
				}
			}	
			System.out.println("Enter the elements of 2nd matrix:");
			for(i=0;i<r2;i++){
				for(j=0;j<c2;j++){
					b[i][j]=sc.nextInt();
				}
			}	
			System.out.println("Multiplication of the matrices is:");	
			int m[][]=new int[r1][c2];
			for(i=0;i<r1;i++){
				for(j=0;j<c2;j++){
					for(k=0;k<c1;k++)
						s=s+(a[i][k]*b[k][j]);
					m[i][j]=s;
					System.out.print(m[i][j]+" ");
					s=0;
				}
				System.out.println();
			}
		}
		else
		System.out.println("Multiplication cannot be performed!");
	}
}
