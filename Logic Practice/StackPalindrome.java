// stack implementation
//find palindrome using stack

class StackPalindrome{
    
    int top;
    int capacity = 1000;
    int []a = new int[capacity];
    
    Stack(){
        top = -1;
    }
    
    boolean isEmpty(){
        if(top == -1 )return true;
        return false;
    }
    
    // here boolean return type is to break the flow with return statement
    
    boolean push(int data){
        
        if(top>=capacity-1){
            System.out.println(" Overflow");
            return false;
        }else{
            a[++top]=data;
            System.out.println(data+" pushed in");
            return true;
        }
    }
    int pop(){
        if(isEmpty()) return 0;
        else{
            int x =a[top--];
            System.out.println(x+" popped out");
            return x;
        }
    }
    
    int peek(){
        if(isEmpty()) return 0;
        else{
            int x = a[top];
            return x;
        }
        
    }
    
    public static void main(String []args){
        Stack s = new Stack();
        
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);
        
        // s.pop();
        // s.push(50);
        // s.push(60);
        int n = 12321;
        int orgNum = n;
        
        
        while(n>0){
            int r = n%10;
            n = n/10;
            s.push(r);
            
        }
        int sum = 0;
        while(!s.isEmpty()){
            sum=(sum*10)+s.pop();
        }
        if(sum == orgNum) System.out.println("is palindrome");
        else System.out.println("is not palindrome");
        
       // System.out.println(s.peek());
    }
     
    
}