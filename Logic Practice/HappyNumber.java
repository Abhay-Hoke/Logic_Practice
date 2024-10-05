// check whether the given number is happy number or not
// e.g 13= 1*1+3*3=10;1*1+0*0=1 sum ==1 13 happy number

class HappyNumber{
    
    public static boolean check(int num){
      int sum =0;
       
       
        while(num>0)
      { int n = num%10;
        sum += n*n;
        num = num/10;
        }
       
      if(sum ==1) return true;
      
     if(sum==4)return false;
      
      return check(sum);
    }
    
    public static void main(String []Args){
        int num = 28;
        if(check(num))System.out.println("yes");
        else System.out.println("no");
    }
}

// class HappyNumber {
    
//     public static boolean check(int num) {
//         int sum = 0;
        
//         // Calculate the sum of squares of digits
//         while (num > 0) {
//             int n = num % 10;
//             sum += n * n;
//             num = num / 10;
//         }
        
//         // Base case: if sum is 1, it's a happy number
//         if (sum == 1) {
//             return true;
//         }
//         //  The specific condition if (sum == 4) does indeed work for
//         //  detecting unhappy numbers. This is because, for any unhappy
//         //  number, the sum of the squares of its digits will eventually
//         //  fall into a known cycle that contains the number 4. Once the
//         //  sum reaches 4, it enters a repetitive cycle of numbers (like
//         //  4 =>16 =>37 =>58 =>89 =>145 =>42=> 20=>4), which never
//         //  reaches 1. Hence, the number is determined to be unhappy
//         // Known case for unhappy number cycles
//         if (sum == 4) {
//             return false;
//         }
        
//         // Recursively check with the new sum
//         return check(sum);
//     }
    
//     public static void main(String[] args) {
//         int num = 28;
//         if (check(num)) {
//             System.out.println("yes");
//         } else {
//             System.out.println("no");
//         }
//     }
// }

