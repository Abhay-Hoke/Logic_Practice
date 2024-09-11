//Remove Duplicates from an Array
//without taking any extra array
// int []arr = {1,2,2,3,4,4,5,5,5,6,6,6,1,15,5,2,5,2,0,8,2,9,9,8};
//output =[1,2,3,4,5,6,15,0,8,9]
//and no collection

import java.util.*;

class RemoveArrayDuplicates{
    
    public static int  eleminateDuplicate(int []arr ,int l){
        int length = l;
        
        for(int i =0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    arr[j]= arr[length-1];
                    length--;
                    j--;
                }
            }
        }
        return length;
        
        
    }
    //if collection Allowed
    //return sorted order and unique values
    // public static void eleminateDuplicateHashSet(int []arr){
        
    //     HashSet<Integer> set = new HashSet<>();
        
    //     for(int i: arr){
    //         set.add(arr[i]);
    //     }
        
    //     System.out.println(set);
        
    // }
    
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter Length Of array : ");
       
        // int l = sc.nextInt();
        // System.out.println();
        // int []arr = new int[l];
        int []arr = {1,2,2,3,4,4,5,5,5,6,6,6,1,15,5,2,5,2,0,8,2,9,9,8};
          int l = arr.length;
        // for(int i = 0;i<arr.length;i++)
        // {
        //     System.out.print("Enter Array element ["+i+"] : ");
        //     arr[i] = sc.nextInt();
        // }
       int newLength = eleminateDuplicate(arr,l);
       
       
       for(int i = 0;i<newLength;i++)
        {
            System.out.print( arr[i] +" ");
           
        }
        
        //eleminateDuplicateHashSet(arr);
        
        
        
       
        
        
    }
}