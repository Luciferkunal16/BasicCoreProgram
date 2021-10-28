package bridgelabz;

import java.util.Scanner;

public class _2D_ARRAY {
	static Scanner inp=new Scanner(System.in);
	void Array2Int(int row, int column) {
		
	    int[][] arr=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=inp.nextInt();
				
			}
		}
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(arr[i][j]);
					}
			}
		}
	void Array2boolean(int row, int column) {
		
	    boolean[][] arr=new boolean[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=inp.nextBoolean();
				
			}
		}
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(arr[i][j]);
					}
			}
		}
	void Array2Float(int row, int column) {
		
	    float[][] arr=new float[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=inp.nextFloat();
				
			}
		}
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(arr[i][j]);
					}
			}
		}
		
		
public static void main(String[] args) {
	_2D_ARRAY rv=new _2D_ARRAY();
	
	System.out.println("Enter the Number of rows");
	int row=inp.nextInt();
	System.out.println("Enter the Number of Column");
	int column=inp.nextInt();
	rv.Array2Int(row,column);
	rv.Array2boolean(row, column);
	rv.Array2Float(row, column);
}
}
