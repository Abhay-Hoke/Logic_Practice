// Check if a Number is a Strong Number
// addition of factorial of digits of a number is equal to number
//e.g. 145 ==1!+4!+5!


class CheckStrongNumber{
    
    public static boolean checkNum(int num){
        
        if(factorialSum(num) == num) return true;
        return false;
    }
    
    public static int factorialSum(int num){
        
          if (num == 0) {
            return 0;
        }
       
        int n = num%10;
        
        
        int factor =1;
        for(int i=1;i<=n;i++){
            
            factor = factor*i;
        }
        
        
        return factor+factorialSum(num/10);
        
       
       
    }
    
    public static void main(String Args[]){
        int num = 145;
        if(checkNum(num))System.out.println(num+" is Strong Number");
        else System.out.println(num+" is not Strong Number");
    }
}