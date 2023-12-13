#include<iostream>
using namespace std;

int main()
{
        int a,b=1,c=1,sum=0;
        cin>>a;
        if(a==1||a==2)
       {
               cout<<"1"<<endl;
       }
        else{
               for (int i = 2; i < a; i++) 
               {
                 sum = b + c;
                 b = c;
                 c = sum;
               }
               cout << sum << endl;
       }
}