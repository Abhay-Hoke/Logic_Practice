//7. **Matrix Multiplication**



class MatrixMultiplication{
    
    public static void multiply(int[][] m1,int[][] m2,int row1, int col1,int row2, int col2){
          if (col1 != row2) {
            System.out.println("Matrix multiplication not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }
        
        int[][] result = new int[row1][col2];
        
        for(int i=0;i<row1;i++){
            
            for(int j=0;j<col2;j++){
                
                for(int k=0;k<row2;k++){//row2 == col1
                    result[i][j] = result[i][k] + m1[i][k]*m2[k][j];
                }
            }
        }
        
       for(int i=0;i<row1;i++){
            
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
       }
    }
    
    public static void main(String Args[]){
        int row1 = 3;
        int col1 = 3;
        int row2 = 3;
        int col2 = 3;
        
        int[][] matrix1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] matrix2 = {{6,5,4},{6,5,4},{6,5,4}};
        
        multiply(matrix1,matrix2,row1,col1,row2,col2);
    }
}