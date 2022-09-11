package binaryTree;

public class String1 {
	
	public static void main(String[] args) {
		
		//Array-Basics in Java Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order). 
		
		//Syntax:

//data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];
		
		//where:

//data_type: Type of data to be stored in the array. For example: int, char, etc.
//dimension: The dimension of the array created. For example: 1D, 2D, etc.
//array_name: Name of the array
//size1, size2, …, sizeN: Sizes of the dimensions respectively.
		
		//Size of multidimensional arrays: The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.
		
		//For example: The array int[][] x = new int[10][20] can store a total of (10*20) = 200 elements. Similarly, array int[][][] x = new int[5][10][20] can store a total of (5*10*20) = 1000 elements.
		
		//Two – dimensional Array (2D-Array)
		
		//Two – dimensional array is the simplest form of a multidimensional array. A two – dimensional array can be seen as an array of one – dimensional array for easier understanding. 

		//Indirect Method of Declaration:

		//Declaration – Syntax:
		//data_type[][] array_name = new data_type[x][y];
		       // For example: int[][] arr = new int[10][20];
		        
		//Initialization – Syntax:
		//array_name[row_index][column_index] = value;
		       // For example: arr[0][0] = 1;
		
		
		 int[][] arr = new int[10][20];
	        arr[0][0] = 100;
	 
	        System.out.println("arr[0][0] = " + arr[0][0]);
	        
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        int[][] arr1 = { { 1, 2 }, { 3, 4 } };
	        
	        for (int i = 0; i < 2; i++)
	            for (int j = 0; j < 2; j++)
	                System.out.println("arr[" + i + "][" + j + "] = "
	                                + arr1[i][j]);

		
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        int[][] arr2 = { { 1, 2 }, { 3, 4 } };
	        
	        System.out.println("arr[0][0] = " + arr2[0][0]);
	        
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        int[][] arr4 = { { 1, 2 }, { 3, 4 } };
	        
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(arr4[i][j] + " ");  }}
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        
	        int[][][] arr5 = new int[10][20][30];
	        arr5[0][0][0] = 1;
	 
	        System.out.println("arr[0][0][0] = " + arr5[0][0][0]);
	        
	        
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        int[][][] arr6 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
	        
	        for (int i = 0; i < 2; i++)
	            for (int j = 0; j < 2; j++)
	                for (int z = 0; z < 2; z++)
	                    System.out.println("arr6[" + i
	                                    + "]["
	                                    + j + "]["
	                                    + z + "] = "
	                                    + arr6[i][j][z]);
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
	        
	        
	        System.out.println("<<<<<<<<<new program>>>>>>>>>");
		
	}
	

}
