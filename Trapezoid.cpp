#include<iostream>
#define f(x)1/(1+x*x)
using namespace std;
int main()
{
  float a,b,n,h,area,xi;
  cout<<"lower and upper limit: \n";
  cin>>a>>b;
  cout<<" Intervals :"<<"\t";
  cin>>n;
  h=(b-a) /n;
  area=f(a)+f(b);

  for(int i=1;i<n;i++)
    {
     xi=a+i*h;
          area=area+(2*(f(xi)));


    }
    area=(h/2)*area;

  cout<<"AREA : "<<area;
  return 0;

}

