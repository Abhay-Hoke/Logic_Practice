public class AddSpacesInString {
    public static void main(String[] args) {
        String input = "RajaSoftwareLabs";
        int[] arr = {4,12};  

        String result = addSpaces(input,arr);
        System.out.println(result);  
    }

    public static String addSpaces(String input, int[] arr) {
       
        String result = "";
        
        int posIndex = 0;  
        
        
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(i);  

        
            
            if (posIndex < arr.length && i + 1 == arr[posIndex]) {
                result += " ";  	   			
                
                posIndex++;     
            }
        }
        
        return result;  
    }
}
