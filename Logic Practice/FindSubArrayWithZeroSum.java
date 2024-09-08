//2.Check if subarray with 0 sum is exists or not



//2.Check if subarray with 0 sum is exists or not
import java.util.*;


class FindSubArrayWithZeroSum{
    
    static void findSubArrays(int[] arr){
         
         Arrays.sort(arr);
         if(arr[0]<0){
             for(int i=0;i<arr.length;i++){
                 for(int j=i+1;j<arr.length ;j++){
                     if(arr[i]+arr[j]==0){
                         System.out.println("["+arr[i]+","+arr[j]+"]");
                     }
                 }
             }
         }
         else{
         System.out.println("No Sub-Array with Zero Sum.");
         }
         
         
    }
    
    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int l = sc.nextInt();
        System.out.println();
        
       // int sum = 0;
        
        int[] arr = new int[l];
        for(int i = 0;i<l;i++){
            System.out.print("Enter element arr["+i+"] : ");
            arr[i] = sc.nextInt();
             System.out.println();
        }
        
        findSubArrays(arr);
        
    }
    
    
    
    
} 
