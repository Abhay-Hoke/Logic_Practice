// swap without using third variable



class SwapWithoutTempp{
    
    
    public static void main(String []Args) 
    {
        int x = 153;
        int y = 234;
        
        x = x+y;//387
        y = x-y;//153
        x = x-y;//234
        
        System.out.println(x+" "+y);
    }
    
    
}