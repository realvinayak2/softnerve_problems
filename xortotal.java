
// 1. Hello Softnerve for this code you first have to give n as input ( where n = size of array )

// 2. After this input your array 

// 3. Code will give your answer 





import java.util.*;
public class Main {
   public static int sumofxor(int[] num){
       return totalsum(num,0,0);
   }
   public static int totalsum(int num[],int level,int currentXOR){
       if(level == num.length) 
       return currentXOR;
       
       int inc = totalsum(num,level+1,currentXOR^num[level]);
       int exc = totalsum(num,level+1,currentXOR);
       
       return inc+exc;
   }
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    
    int ans = sumofxor(arr);
    System.out.println(ans);
   }
}