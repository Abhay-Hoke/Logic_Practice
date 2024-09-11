// Problem Statement 
// You’re given an array of integers, print the number of times each integer has occurred in the array.
// Example
// Input :
// 10
// 1 2 3 3 4 1 4 5 1 2
// Output :
// 1 occurs 3 times
// 2 occurs 2 times
// 3 occurs 2 times
// 4 occurs 2 times
// 5 occurs 1 times
// do not use collections
import java.util.Scanner;

class CountOccurance{
    public static void printOccurance(int []arr,int a){
        
        //with continue key word 
        
        // for(int i=0;i<a;i++){
        //     if(arr[i]== -1){
        //         continue;
        //     }
        //     int count =1;
        //     for(int j=i+1;j<a;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //             arr[j]=-1;
        //         }
        //     }
            
        //     System.out.println(arr[i]+" occured "+count+" times.");
        // }
        
        //without continue
        
        for(int i=0;i<a;i++){
            if(arr[i]!= -1){
               int count =1;
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
             System.out.println(arr[i]+" occured "+count+" times.");    
            }
           
            arr[i]=-1;
            

            
        }
        
        
        
        
    }
    
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        
        printOccurance(arr,a);
        
    }
}