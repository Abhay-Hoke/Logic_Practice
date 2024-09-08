
//1.Find pair with given sum in the array
import java.util.*;


class PairSum{

//O(n log(n))

 	static void findTargetSumPair(int[] arr,int target){
        
        Arrays.sort(arr);
        
        int left =0, right=arr.length-1;
        
        while(left<right){
            int sum = arr[left] + arr[right];
            
            if(sum == target){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
            }
            else if(sum<target)left++;
            else right--;
        }
        
        
    }

//O(n)
	/*	
	static void findTargetSumPair(int[] arr,int s){
        
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            
            int complement = s - arr[i];
            if(set.contains(complement)) System.out.println(arr[i]+" "+complement);
            set.add(arr[i]);
        }
        
        
    }
*/

//O(n2)    
   /* static void  findTargetSumPair(int[] arr,int s){
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==s) System.out.println(arr[i]+" "+arr[j]);
            }
            
        }
        
    }*/
    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int l = sc.nextInt();
        System.out.println();
        
        System.out.print("Enter Target Sum: ");
        
        int s = sc.nextInt();
        
        
        int[] arr = new int[l];
        for(int i = 0;i<l;i++){
            System.out.print("Enter element arr["+i+"] : ");
            arr[i] = sc.nextInt();
             System.out.println();
        }
        
        findTargetSumPair(arr,s);
        
    }
    
    
    
    
} 
