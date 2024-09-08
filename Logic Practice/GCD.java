
import java.util.Scanner;

class GCD{
	
	int gcd;
	
	static int  findGCD(int num1, int num2){
		
			if(num1==0) return num2;
			if(num2==0) return num1;
			
			if(num1>num2){
				return findGCD(num1-num2,num2);
			}
			else{
				return findGCD(num1,num2-num1);
			}
	}
	
	/*checkEuclideanAlgorithm(int num1,int num2,int gcd){
		
		
	}*/
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number1");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number2");
		
		int num2 = sc.nextInt();
		
		int res = findGCD(num1,num2);
		
		System.out.println(res);
		
		//checkEuclideanAlgorithm(num1,num2,gcd);	
	}
}