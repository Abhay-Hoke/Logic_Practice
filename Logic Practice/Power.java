// **Find the Power of a Number (x^y) Using Loops**

class Power{
    
    public static void main(String []Args){
        int n =5;
        int pow = 5;
        int result=1;
        for(int i=1;i<pow;i++){
            result =result *n;
        }
        System.out.println(result);
    }
}