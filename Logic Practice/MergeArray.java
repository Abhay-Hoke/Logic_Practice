// Online Java Compiler
// Use this editor to write, compile and run your Java code online

Quetion 1 concate array alternate

import java.util.Scanner;

class MergeArray{
    
    static int[] arrayConcatenate(int[] arr,int[] arr1){
        int l = arr.length;
        int l1 = arr1.length;
        int l2 = l + l1;
        
        int arr2[] = new int [l2];
        
       int i =0,j=0,k=0;
       
       while(i<l && j<l1){
           arr2[k++] = arr[i++];
           arr2[k++] = arr1[j++];
       }
       
       while(i<l){
           arr2[k++] = arr[i++];
       }
        while(j<l1){
           arr2[k++] = arr1[j++];
       }
       return arr2;
       
    }

    
    
    public static void main(String Args[]){
        
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter Length Of Array: ");

        int l = sc.nextInt();
        System.out.println();
        
        System.out.print("Enter Length Of Array-1: ");
        int l1 = sc.nextInt();
        System.out.println();
        int arr[] = new int[l];
        
         
        int arr1[] = new int[l1];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Array element ["+i+"]");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        
        for(int i=0;i<arr1.length;i++){
              System.out.print("Enter Array-1 element ["+i+"]");
            arr1[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("First Array");
        for(int i=0;i<arr.length;i++){
             
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        System.out.println("Second Array ");
        for(int i=0;i<arr1.length;i++){
             
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        
       int arr3[] =  arrayConcatenate(arr,arr1);
        
        System.out.println("Alternate concated Array ");
        for(int i=0;i<arr3.length;i++){
             
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        
        
        
        
    }
}