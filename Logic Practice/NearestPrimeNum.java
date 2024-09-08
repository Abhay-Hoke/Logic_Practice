//find the closest prime of given number if equi-distance from given no. print both


import java.util.Scanner;


public class NearestPrimeNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Number : ");
    
    int num = sc.nextInt();
    System.out.println();
    getNearestPrimeNum(num);
  }


  public static void getNearestPrimeNum(int n){
    int lower = n;
    int upper = n;
    while(true){
    if(isPrime(upper) && isPrime(lower)) {
        
           System.out.println("Nearest Prime Number to " + n + " are: " + upper+" & "+lower);
           break;
      }else if(isPrime(lower)&& !isPrime(upper)) {
          
           System.out.println("Nearest Prime Number to " + n + " is: " + lower);
          break;
      }else if(isPrime(upper) && !isPrime(lower)) {
        
           System.out.println("Nearest Prime Number to " + n + " is: " + upper);
           break;
      }
     
     lower--;
      upper++;
      
    }
    
  }

//   public static boolean isPrime1(int n){
//     for(int i = 2 ;  i < n/2 ; i++){
//       if(n % i == 0){
//         return false;
//       }
//     }
//     return true;
//   }
  public static boolean isPrime(int n){
    if(n <= 1) return false;
    if(n <=3) return true;

    if(n % 2 == 0 || n % 3 == 0) return false;

    for(int i = 5 ; i * i <= n ; i = i + 6){
      if(n %i == 0 || n % (i+2) == 0){
        return false;
      }
    }
    return true;
  }
}