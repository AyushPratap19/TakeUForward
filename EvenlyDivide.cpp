int countDigits(int n){
	int rem,i=0;
	int a=n;
	while(n>0)
	{
		rem=n%10;
		if(rem!=0)
		{
		if(a%rem==0)
		i++;
		}
		n=n/10;

	}	
	return i;
}
//here we need to find the number of digits of a number which divides that number
//eg:336 has 3 digits 3,3,6 which divides 336