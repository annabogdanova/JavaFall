package MatrixFill;

public class MatrixFill {

	public static final int HEIGHT = 5;
	public static final int WIDTH = 7;
	
	public static void main(String[] args) {
	        
		String[][] matrix = new String[HEIGHT][WIDTH];

		int index;
		if (HEIGHT <= WIDTH)
			index = HEIGHT-1;
		else
			index = WIDTH-1;
		
		for (int rowIndex = 0; rowIndex < HEIGHT; rowIndex++) {
			for (int colIndex = 0; colIndex < WIDTH; colIndex++) {
				if ((rowIndex%index == colIndex) || ((rowIndex + colIndex) % index == 0) || 
						(rowIndex == colIndex%index))
					matrix[rowIndex][colIndex] = "X";
	            else
	                matrix[rowIndex][colIndex] = ".";
	            System.out.print(matrix[rowIndex][colIndex] + " ");
	         }
	         System.out.println();
	    }
	}
}
