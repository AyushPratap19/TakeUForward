public class Solution {
	public static String isPrime(int num) {
		int i,j=0;
		for(i=1;i<=(int)Math.sqrt(num);i++)
		{
            if(num%i==0&&i!=num/i)
			{
			j+=2;
			}
		}
		if(j==2)
		return "YES";
		else
		return "NO";
	}
}