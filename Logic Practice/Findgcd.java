//find gcd with and without recursion

class Findgcd{
    
    // public static int GCD(int a,int z){
    //     if(a==0) return z;
    //     if(z==0) return a;
    //     if(a>z)
    //     return GCD(a-z,z);
    //     else
    //     return GCD(a,z-a);
        
    // }
    public static int GCD(int a,int z){
      int min =0;
      int hcf =0;
      if(a>z) min=z;
      if(z>a) min=a;
      
      for(int i= 1;i<min;i++){
          if(a%i==0 && z%i==0) hcf= i;
      }
        return hcf;
    
    }
    public static void main(String []Args){
        int a = 75;
        int z = 325;
        
        int gcd = GCD(a,z);
        System.out.println(gcd);
    }
}