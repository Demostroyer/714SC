import java.util.*;
public class matixConstruct {

	
	public static void main(String args[])
	{
		
		
		Scanner matrixLength = new Scanner(System.in);
		System.out.print("Enter the size of your matrix: ");
		int size = matrixLength.nextInt();
				
		int [][] x = inputMatrix(size);

		Scanner diagonalString = new Scanner(System.in);
		System.out.print("Enter your matrix diagonal: ");
		String diagonal = diagonalString.nextLine();
		
		Scanner noDiag = new Scanner(System.in);
		System.out.print("Enter no of diag: ");
		int noDiag_ = noDiag.nextInt();

		
		if(noDiag_>0){
		inputDiagonal(x, diagonal,noDiag_);
		}
		
		Scanner rowNo = new Scanner(System.in);
		System.out.print("Enter row number: ");
		int numberofrows = rowNo.nextInt();
		
		Scanner rowString = new Scanner(System.in);
		System.out.print("Enter the string you want in your row");
		String poo = rowString.nextLine();
		
		inputRow(x,poo,numberofrows-1);
		
		for(int i =0; i<=x.length-1; i++){
			for(int j =0; j <= x.length-1; j++){
				
				if(j == x.length-1){
					System.out.println(x[i][j] + ";");
				}
				else
				{
				System.out.print(x[i][j] + ",");
				}
			}
		}

	}
	
	public static int[][] inputMatrix(int size){
		
		int[][] matrix = new int[size][size];

		for(int i=0; i<matrix.length; i++){
			for(int j = 0; j<matrix.length; j++){
				matrix[i][j] = 0;
			}
		}
		
		for(int i =0; i<matrix.length; i++){
			for(int j =0; j < matrix.length; j++){
				
			}
		}
		return matrix;
	}
	
	public static int[][] inputRow(int[][] x, String here, int noRow){
		String[] q = here.split(";");
		for(int i =0; i<x.length; i++){
			if(q.length < x.length)
			{	
			here = here.concat(here);	
			String[] b = here.split(";");
			int a  = Integer.parseInt(b[i]);
			x[noRow][i]=a;
			}
			else{
				int a = Integer.parseInt(q[i]);
				x[noRow][i]=a;
			{
		}
		
		
		
		
		
		
		
		
	}}return x;}
		
	
	public static int[][] inputDiagonal(int[][] x, String here, int noDiag){
	
		Double succ1=Math.floor(noDiag/2);
		int succ=succ1.intValue();
		for(int j=succ;j>=0;j--)
		{
			
		for(int i =0; i<x.length-j; i++){
			
			String[] q = here.split(";");
			
			if(q.length < x.length)
			{	
				here = here.concat(here);
				String[] b = here.split(";");
				int a  = Integer.parseInt(b[i]);
				x[i+j][i]=a;
				x[i][i+j]=a;
				
			}
			
			else
			
			{	
				int a = Integer.parseInt(q[i]);
				x[i+j][i]=a;
				x[i][i+j]=a;

			}
			}
		}

		return x;

	}
}
