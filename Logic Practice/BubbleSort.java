//4. **Bubble Sort Implementation**

class BubbleSort{
    
    public static void bSort(int[] arr){
        int count=0;
        for(int i =0;i<arr.length-1;i++){
            
           
            if(arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }
        
        if(count!=0){
            bSort(arr);
           // System.out.println(count);
        }else{
            for(int i =0;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
            }
           
        }
        
    }
    
    
    public static void main(String Args[]){
        int []arr = {10,20,80,90,8,70,5,1,60,70,60};
        
        bSort(arr);
    }
}