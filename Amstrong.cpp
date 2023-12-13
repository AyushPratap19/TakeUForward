bool checkArmstrong(int n){
	int sum=0,rem;
    int num=n;
    string s=to_string(n);
    int k=s.size();
    while(n>0)
    {
        rem=n%10;
        sum=sum+pow(rem,k);
        n=n/10;

    }
    if(sum==num)
    return true;
    else
    return false;
}