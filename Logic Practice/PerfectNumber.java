// **Check if a Number is a Perfect Number**
//6 = 1*2*3   6=1+2+3 //28,496

class PerfectNumber{
    
    static boolean checkNum(int num){
        if(num==1)return true;
        int result =0;
    for(int i=1;i<num;i++){
        if(num%i==0){
        result = result+i;
            
        }
        
    }    
     if(result==num)return  true;
     return false;
        
    }
    
    public static void main(String []Args){
        
        int num = 28;
        
        System.out.println(checkNum(num));
        
    }
}