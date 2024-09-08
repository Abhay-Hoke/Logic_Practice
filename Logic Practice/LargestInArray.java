import java.util.*;

class LargestInArray{
	
	
	static int[] arraySort(int[] arr){
		for(int j =0;j<arr.length;j++){
			for(int k = j+1;k<arr.length;k++){
		// here sorting is descending order
			if(arr[j]<arr[k]){
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}
			else{
				continue;
			}
			}
		}
		return arr;
	}
	
	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
		int l;
		System.out.println("Enter length of Array");
		
		l = sc.nextInt();
		
		int arr[] = new int[l];
		
	
		
		//System.out.println("Enter Elements of Array");
		
		for(int i =0;i<arr.length;i++){
			System.out.print("Enter Elements of Array["+i+"]");
			arr[i] = +sc.nextInt();
			System.out.println();
		}
		System.out.println();
		
		int []arr1 = arraySort(arr);

		
		System.out.println();
	//	System.out.println(Arrays.toString(arr1));
		
		System.out.print("Enter k ");
		int k = sc.nextInt();
// 		for(int i=0;i<arr.length;i++){
// 		    	System.out.println(arr1[i]);
// 		}
	
		System.out.println(k+"th largest Number: "+arr1[k-1]);
		
	}
}