// sum of digit of given num till it became single digit

import java.util.Scanner;

class DigitSumSingle{
    
    public static int findSingleDigitSum(int num){
       if(num<10)return num;
        int l = num%10;
        num = num/10;
        int z = l+findSingleDigitSum(num);
        if(z>10)
        return findSingleDigitSum(z) ;
        return z;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num : ");
        int num = sc.nextInt();
       System.out.println(findSingleDigitSum(num));
        
    }
}


