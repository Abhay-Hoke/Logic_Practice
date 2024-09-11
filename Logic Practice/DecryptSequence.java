// The String Decoder:

// You are provided with a string which has a sequence of 1s and Os. This sequence is the encoded version of a english word. You are supposed to write a program to decode the provided string and find the original word. Each Alphabet is representing by a sequence of 1s.
// A:1
// B: 11
// C: 111
// D: 1111
// E: 11111
// And so on upto Z having 26 1s.
// The sequence of 1s in the encoded form are separated by single 0 which helps to distinguish between 2 letters.
// Note:
// Input String will always be in uppercase
// Example 1:
// 101101110
// Ans: ABC
// Example 2: 11101111011111
// Ans: CDE




class DecryptSequence{
    
    public static void main(String []Args){
        String str = "101101110";
        String newStr = "";
      //2nd attempt
      int count =0;
           for(int i=0;i<str.length();i++){
            
           if(str.charAt(i)=='1') {
                count++;
            }
            else if(str.charAt(i)=='0'){
                if(count>0){
                int ch = 64+count;
                
                // agar string me output chahiye toh
              //  newStr = newStr + String.valueOf((char)ch); 
                 newStr = newStr + (char)ch; 
                
                //System.out.print((char)ch);
                count =0;
               
            }
            }
            
            
      
           }
           // last of doesnot contain zero
           if(count>0){
                 int ch = 64+count;
                //newStr = newStr + String.valueOf((char)ch); 
                newStr = newStr + (char)ch; 
               // System.out.print((char)ch);
            }
            
            System.out.print(newStr);
      
      
      
      
      //something went wrong
        //A=65
        //System.out.println();
    //     int count=0;
    //     boolean flag = true;
    //     for(int i=0;i<str.length();i++){
    //         if(flag)
    //       { if(str.charAt(i)!='0') {
    //             count++;
    //             //continue;
    //           // System.out.print(count);
    //         }
    //         else{
    //             flag =false;
    //         }
               
    //       }else if(count>0){
    //             int ch = 64+count;
    //             System.out.print((char)ch);
    //             count =0;
    //             flag =true;
    //         }
    //     }
    //   // System.out.print((char)65);
    }
}












