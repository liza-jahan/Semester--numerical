
#include<iostream>
#define f(x)1/(1+x*x)
using namespace std;
int main()
{
  float a,b,n,h,area,xi;
  cout<<"lower and upper limit: ";
  cin>>a>>b;
  cout<<" Intervals :"<<"\n";
  cin>>n;
  h=(b-a) /n;
  area=f(a)+f(b);

  for(int i=1;i<n;i++)
    {
     xi=a+i*h;
     if(i%2==0)
      {
          area=area+(2*(f(xi)));
      }
        else
        {
          area=area+(4*(f(xi)));

        }

    }
    area=(h/3)*area;

  cout<<"AREA : "<<area;
  return 0;

}
