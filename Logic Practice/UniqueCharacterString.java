//write a func take input as string and return true if all charcters are unique,false oterwise
//donot use any additionla data structure(a-z&&1-9)

import java.util.Scanner;

class UniqueCharacterString{
    
    static boolean checkString(String str){
    for(int i=0;i<str.length();i++){
        
        for(int j=i+1;j<str.length();j++)
        if(str.charAt(i)==str.charAt(j)){
            return false; 
            
        }
    }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.println();
        
        System.out.println(checkString(str));
    }
}

