// **Print All Prime Numbers in a Range**
//

class PrimeNumberRange{
    
    
    public static boolean isPrime(int num){
        
        if(num==1) return false;
        if(num<=3) return true;
        if(num%2==0||num%3==0) return false;
        
        for(int i =5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0)return false;
           
        }
         return true;
        }
        
        
        
    
    
    
    public static void main(String args[]){
        int lowerlimit =10;
        int upperlimit =260;
        
        for(int i =lowerlimit;i<upperlimit;i++){
            if(isPrime(i))System.out.print(i+" ");
        }
    }
}