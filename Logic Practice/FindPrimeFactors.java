//Print Prime Factors of given Number


import java.util.Scanner;

class FindPrimeFactors{
    
    public static void primeFactors(int num){
        
        //num/2 condition will help remove extra iterations as e.g.12/2==6 as 7 won't be a factor
        
        
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                if(isPrime(i)) System.out.print(i+" ");
            }
        
            
        }
        
    }
    public static boolean isPrime(int num){
        if(num<=3 &&num>1) return true;
        if(num%2 ==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;
            
        }
        return true;
        
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        primeFactors(num);
        
    } 
}