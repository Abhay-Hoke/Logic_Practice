// Check if a String is a Palindrome


class StringPalindrome{
    
    public static void main(String []Args){
        
        String str1 ="levela";
        int count=0;
       
       
       for(int i=0;i<str1.length()/2;i++){
           if(str1.charAt(i) != str1.charAt(str1.length()-1-i)) count++;
       }
        if(count==0)System.out.println("Palindrome");
        else System.out.println(" not Palindrome");
       
       
       
        // String result ="";
        
        // for(int i=str1.length()-1;i>=0;i--){
        //     result = result + str1.charAt(i);
        // }
        
       
        // if(result.equals(str1))System.out.println("Palindrome");
        // else System.out.println(" not Palindrome");
        
        
    }
}

