//sum of all divisors till n
//eg:5 divisors of 1(1),2(1,2),3(1,3),4(1,2,4),5(1,5):sum=21
public class Solution {
    public static int sumOfAllDivisors(int n){
       int i,j,sum=0;
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=n;j++)
       {
          if(i%j==0)
          sum=sum+j; 
       }
       }
       return sum;

    }
}