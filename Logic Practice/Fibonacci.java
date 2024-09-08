//fibonacii

import java.util.Scanner;

class Fibonacci{
    
    public static void fibo(int t){
        int a =0,b=1;
        int c =a+b;
        System.out.print(a+" ");
            System.out.print(b+" ");
        for(int i=2;i<t;i++){
            
            a=b;
            b=c;
            c=a+b;
            
            System.out.print(b+" ");
            
        }
    }
    
    public static boolean fiboCheck(int value){
        
        int a=0,b=1,c=a+b;
        
        while(true){
            a=b;
            b=c;
            c=a+b;
            
            if(c==value) return true;
            if(c>value) break;
        }
        return false;
    }
    
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        // System.out.print("Enter term: ");
        // int term = sc.nextInt();
        // System.out.println();
        
        System.out.print("Enter value: ");
        int value = sc.nextInt();
         System.out.println();
        
        // fibo(term);
        System.out.println(fiboCheck(value));
        
        
    }
}