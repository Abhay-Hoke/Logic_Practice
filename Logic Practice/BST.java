//5. **Binary Search Implementation**


class BST{
    
    public static int bstFind(int[] arr,int x){
        
        int low = 0;
        int high = arr.length-1;
        
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==x)  return mid;
            
            if(arr[mid]>x) high = mid-1;
            if(arr[mid]<x) low = mid+1;
            
            
        }
        return -1;
        
    }
    
    public static void main(String Args[]){
        int arr[] ={10,11,13,20,22,23,30,40,50,60,67,77,87,97,100};
        int x = 23;
        
       int result = bstFind(arr,x);
       if(result == -1)System.out.println("Not in Array");
       else System.out.println("Present at "+result);
        
    }
}