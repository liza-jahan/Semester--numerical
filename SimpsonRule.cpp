#include<iostream>
#define f(x)1/(1+x)
using namespace std;
int main()
{
  float a,b,n,h,area,xi;
  cout<<"lower and upper limit: ";
  cin>>a>>b;
  cout<<" Intervals :"<<"\t";
  cin>>n;
  h=(b-a) /n;
  area=f(a)+f(b);

  for(int i=1;i<n;i++)
    {
     xi=a+i*h;
     if(i%3==0)
      {
          area=area+(2*(f(xi)));
      }
        else
        {
          area=area+(3*(f(xi)));

        }

    }
    area=(3*h/8)*area;

  cout<<"AREA : "<<area;
  return 0;

}

