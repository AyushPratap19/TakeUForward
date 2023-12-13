//leetcode
//optimal approach would be converting it to string 
class Solution {
    public boolean isPalindrome(int x) {
        int rem,num,sum=0;
        num=x;
        while(x>0)
        {
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(num==sum&&num>=0)
        return true;
        else
        return false;
    }
}
