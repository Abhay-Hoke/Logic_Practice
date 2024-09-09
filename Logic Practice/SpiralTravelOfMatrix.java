// Problem Statement 
// Write the code to traverse a matrix in a spiral format.
// Sample Input 

// Input 

// 5   4

// 1   2   3   4
// 5   6   7   8
// 9   10  11  12
// 13  14  15  16
// 17  18  19  20
// Output 

// 1  2  3  4  8  12  16  20  19  18  17  13  9  5  6  7  11  15  12  14 10

// import java.util.Scanner;



// class SpiralTravelOfMatrix{
    
//     public static void printSpiral(int [][]spiral,int row,int col){
        
//         int colCount = 0;
//         int rowCount = 0;
        
//           for(int i=0;i<row;i++){
//           rowCount++;
//           if(rowCount<=row){
        
//             if(colCount<col && colCount!=0){
//                 for(int j=0;j<col;j++){
               
//                 System.out.print(spiral[i][j]+" ");
//                 colCount++;
                
//                 }
                
//             }else if(rowCount!=row) {
//                 System.out.print(spiral[i][col-1]+" ");
                
                
//             }else{
//                 for(int j=col-1;j>=0;j--){
               
//                 System.out.print(spiral[rowCount-1][j]+" ");
                
//                 colCount--;
//                 }
//               rowCount--;
//             //   System.out.println(colCount);
//             //   System.out.println(rowCount);
                
//             }
           
//             }
            
//         }
        
//     }
    
//     public static void main(String[] Args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of Rows and Col ");
//         int row = sc.nextInt();
//         int col = sc.nextInt();
        
//         int [][]spiral = new int[row][col];
        
//         for(int i=0;i<row;i++){
            
//             for(int j=0;j<col;j++){
//                 System.out.print("Enter element ["+i+"]["+j+"] : " );
//                 spiral[i][j]=sc.nextInt();
//                 System.out.println();
//             }
//         }
        
//         //  for(int i=0;i<row;i++){
            
//         //     for(int j=0;j<col;j++){
//         //         System.out.print(spiral[i][j]+" ");
                
//         //     }
//         //     System.out.println();
//         // }
        
//         printSpiral(spiral,row,col);
        
        
        
//     }
// }
import java.util.Scanner;

class SpiralTravelOfMatrix {
    
    public static void printSpiral(int[][] spiral, int row, int col) {
        int top = 0;        // Starting row index
        int bottom = row - 1; // Ending row index
        int left = 0;       // Starting column index
        int right = col - 1;  // Ending column index
        
        while (top <= bottom && left <= right) {
            
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(spiral[top][i] + " ");
            }
            top++; // Move to the next row
            
            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(spiral[i][right] + " ");
            }
            right--; // Move to the previous column
            
            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(spiral[bottom][i] + " ");
                }
                bottom--; // Move to the previous row
            }
            
            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(spiral[i][left] + " ");
                }
                left++; // Move to the next column
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and Columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] spiral = new int[row][col];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                spiral[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Spiral traversal of the matrix:");
        printSpiral(spiral, row, col);
    }
}

