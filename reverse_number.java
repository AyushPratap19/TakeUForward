//leetcode
class Solution {
    public int reverse(int x) {
        long  rem;
        long  sum=0;
        long  num=x;
        if(x<0)
            x=x*-1;
        while(x>0)
        {
            rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
                double a=Math.pow(2,31)-1;
        if(num>0&&sum<a)
        return (int)sum;
        else if(num<0&&-sum>-a)
        return (int)sum*-1;
        else
        return 0;
    }
}