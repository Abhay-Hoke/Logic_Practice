//find common element between two sorted arrays with one loop
//donot use any inbuilt functions 
//donot use any break or continue or goto
//donot use external structure like array,etc

//a1=[1,2,3,4,5,6]
//a2=[2,3,5,8]
//output: 3 5
//


class FindCommonWithOneLoop{
    
    public static void commonElement(int []a1,int []a2,int a1len,int a2len){
        int i = 0;
        int j = 0;
        while(i<a1len && j<a2len){
            
            if(a1[i]==a2[j]){System.out.println(a1[i]);
                i++;
                j++;
            }
            else if(a1[i]>a2[j]) j++;
            else i++;
        }
    }

    
    
    public static void main(String Args[]){
     int []a1={1,2,3,4,5,6};
     int []a2={2,3,5,8};
     
     int a1len = 6;
     int a2len = 4;
     
     commonElement(a1,a2,a1len,a2len);
        
    }
    
}