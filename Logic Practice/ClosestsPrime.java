//find the closest prime of given number if equi-distance from given no. print both
//failing with 99 don't know why
import java.util.Scanner;


class ClosestsPrime{
    static void findClosestPrime(int num){
        int count=0;
        int flag1 = 0;
        int flag2 = 0;
        for(int i =2;i<num;i++){
            if(num%i==0)count++;
        }
        if(count==0)System.out.println("Number "+num+" is itself prime ");
        else{
            int temp = num;
            while(temp>0){
                int prev = --temp;
            int next = ++num;
          
            for(int i =2;i<prev;i++){
            if(prev%i==0)flag1++;
            }
            for(int i =2;i<next;i++){
            if(next%i==0)flag2++;
            }
            if(flag1==0 && flag2==0){
                System.out.println(prev+" "+next);
                break;
            }
                
            else if(flag1==0 && flag2!=0){
                System.out.println(prev);
                break;
            }
            else if(flag1!=0 && flag2==0){
                System.out.println(next);
                break;
                
            }
            temp--;
                
            }
            
            
            
        }
    }
    
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.println();
        
        findClosestPrime(num);
        
        
    }

    
    
    
    
}