//Divided
#include<stdio.h>
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x[20], y[20], dif[20][19],yp,h,nr,dr=1.0,p[20];
    int k,f,n,i,v=1,f1=1,f2=0,b,j;
    cout<<"Enter the value of n: "<<"\n";
    cin>>n;
      cout<<"Give values of xi and yi: "<<"\n";
    for(i=1; i<=n; i++)
    {
        cin>>x[i]>>y[i];
    }
   cout<<"Order" <<" "<<" Values of Differences. ";
    cout<<"\n";
    cout<<"1\t";
    for(i=1; i<n; i++)
    {
    dif[i][1]=((y[i+1]-y[i])/(x[i+1]-x[i]));

       printf("DY%d=%d\t", i,dif[i][1]);
    }
     cout<<"\n";
//  calculating 2nd order and other orders

 for(j=2; j<=n-1; j++)
    {
        cout<<j<<"\t";
        for(i=1; i<=n-j; i++)
        {
            dif[i][j]= ((dif[i+1][j-1] - dif[i][j-1])/(x[i+2-2+j]-x[i]));

        cout<<"D^"<<j<<"Y"<<i<<"= "<<dif[i][j];
        cout<<"\t";
        }


        cout<<"\n";
    }
    cout<<"\n";

    f=y[1];
    cout<<"Provide value for x: "<<"\n";
    cin>>h;
    do
    {
        for (i=1;i<=n-1;i++)
        {
            p[i] = ((y[i+1]-y[i])/(x[i+v]-x[i]));
            y[i]=p[i];
        }
        f1=1;
        for(i=1;i<=v;i++)
            {
                f1*=(h-x[i]);
            }
        f2+=(y[1]*f1);
        n--;
        v++;
    }

    while(n!=1);
    f+=f2;

  cout<<"For  X="<<h<<" corresponding Y="<<f;
}
