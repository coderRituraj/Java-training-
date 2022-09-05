import java.util.*;
public class main {

	public static void main(String[] args) {
		 Scanner n = new Scanner(System.in);
		 System.out.print("Enter the number of rows ");
		 int row =n.nextInt();
		 System.out.print("Enter Number of column");
		 int col =n.nextInt();
		 
		 int mat1[][] = new int[row][col];
		 int mat2[][] = new int[row][col];
		 int mat3[][] = new int[row][col];
		 System.out.print("Enter value of  1 matrix");
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
			    mat1[i][j]=n.nextInt();
			 }
		 }
		 
		 System.out.print("Enter value of  2 matrix");
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
			    mat2[i][j]=n.nextInt();
			 }
		 }
		 // for addition 
		 
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
			    mat3[i][j] = mat1[i][j]+mat2[i][j];
			 }
		 }
 // for printing matrix addition 
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
			    System.out.print(mat3[i][j] +"\t"); 
			 }
			 System.out.println();
		 }
		 
	}

}
