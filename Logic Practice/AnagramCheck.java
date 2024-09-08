//6. **Check for Anagram Strings**


class AnagramCheck{
    
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        
        int[] ch = new int[256];
        
        for(int i =0;i<str1.length();i++){
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }
        for(int i = 0;i<ch.length ;i++){
            if(ch[i]!=0) return false;
        }
        return true;
    }
    
    
    public static void main(String[] Args){
        String str1 ="catt";
        String str2 ="tact";
        
       System.out.println(checkAnagram(str1,str2));
    }
}