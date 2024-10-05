 //Problem: Rotate an array of n elements to the right by k steps. For example, with 
 //n= 7 and k =3, the array [1,2,3,4,5,6,7] is rotated to
 //                         [5,6,7,1,2,3,4].
 
 
 
 public class RotateArrayByKSteps{
     
     //O(n) without additional sapce
     public static void rotate1(int []arr,int n,int k){
         
         reverse(arr,0,k);
         reverse(arr,k+1,n-1);
         reverse(arr,0,n-1);
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
         
     }
     
     public static void reverse(int arr[],int left,int right){
         
         while(left<right){
             int temp = arr[left];
             arr[left]= arr[right];
             arr[right]= temp;
             right--;
             left++;
         }
     }
     
     //O(n) but additional space required extra array
     public static void rotate(int []arr,int n,int k){
         int []arr1 =new int[n];
         boolean flag =false;
         for(int i= 0;i<n;i++){
             if(i==k) flag= true;
             
             if(!flag)
             arr1[i] = arr[k+i+1];
             if(flag)
             arr1[i]=arr[i-k];
         }
         for(int i=0;i<n;i++){
             System.out.print(arr1[i]+" ");
         }
      }
     
     
     public static void main(String []Args){
         int []arr = {1,2,3,4,5,6,7};
         int n = 7;
         int k = 3;
         
         rotate(arr,n,k);
         System.out.println();
         rotate1(arr,n,k);
         
     } 
 }