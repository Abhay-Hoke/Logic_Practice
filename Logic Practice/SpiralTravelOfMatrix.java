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

import java.util.Scanner;



class SpiralTravelOfMatrix{
    
    public static void printSpiral(int [][]spiral,int row,int col){
        
        int colCount = 0;
        int rowCount = 0;
        
           for(int i=0;i<row;i++){
            if(colCount<col)
           { for(int j=0;j<col;j++){
               
                System.out.print(spiral[i][j]+" ");
                colCount++;
                
            }}else{
               for(int j=col-1;j>=0;j--){
               
                System.out.print(spiral[i][j]+" ");
                colCount--;
                
            }
            }
            
        }
        
    }
    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and Col ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int [][]spiral = new int[row][col];
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                System.out.print("Enter element ["+i+"]["+j+"] : " );
                spiral[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        
        //  for(int i=0;i<row;i++){
            
        //     for(int j=0;j<col;j++){
        //         System.out.print(spiral[i][j]+" ");
                
        //     }
        //     System.out.println();
        // }
        
        printSpiral(spiral,row,col);
        
        
        
    }
}









