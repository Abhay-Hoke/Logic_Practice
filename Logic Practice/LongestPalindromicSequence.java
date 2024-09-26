//find the longest palindromic sequence in given string
//
//

class LongestPalindromicSequence{
    
    public static void findPlindrome(String str){
        
        String longest = "";
        
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String subStr = str.substring(i,j);
                if(checkPalindrome(subStr) && subStr.length()>longest.length()){
                    longest = subStr;
                }
                
            }
        }
        System.out.println("Longest palindromic Sequence is "+longest);
        
    }
    
    public static boolean checkPalindrome(String str){
        int n=0;
        int m = str.length()-1;
        
        
        while(m>n){
            if(str.charAt(n)!=str.charAt(m)) return false;
            n++;
            m--;
        }
        return true;
    }
    
    public static void main(String []Args){
        String str ="abacabababsbdbsjdkdjfksskcnfk";
        findPlindrome(str);
    }
}