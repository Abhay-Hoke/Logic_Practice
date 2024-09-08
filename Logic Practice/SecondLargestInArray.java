//8. **Find the Second Largest Number in an Array**
import java.util.*;

class SecondLargestInArray{
    
    public static int findKthLargest(int []arr, int k){
        
        for(int i=0;i < (arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
            // i++;
        }
       System.out.println( Arrays.toString(arr));
        return arr[k-1];
        
    }
    
    public static void main(String []Args){
        
        int []arr={23,65,48,56,9,7,13,8,3,432,55};
        
        int k = 11; //kth largest
        if(k<=arr.length){
        System.out.println(findKthLargest(arr,k));
        }else{
                    System.out.println("Not available");
        }
    }
}