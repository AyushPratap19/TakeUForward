public class Solution {
    public static int calcGCD(int n, int m){
        int i,res=1;
        for(i=1;i<=Math.min(n,m);i++)
        {
            if(n%i==0&&m%i==0)
            res=i;
        }
        return res;
    }
}