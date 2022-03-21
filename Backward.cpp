//Backward
#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
    float ax[20], ay[20], dif[20][19],x,yp,p,h,nr=1.0,dr=1.0;
     int n, i,j,k;
    cout<<"Enter the value of n: "<<"\n";
    cin>>n;
    cout<<"Give values of xi and yi: "<<"\n";
    for(i=0; i<n; i++)
    {
        cin>>ax[i]>>ay[i];
    }
    cout<<"Provide value for x: "<<"\n";
    cin>>x;
    h=ax[1]-ax[0];
// Calculating 1st order difference
cout<<"Order" <<" "<<" Values of Differences. ";
    cout<<"\n";
    cout<<"1\t";
    for(i=0; i<n-1; i++)
    {
      dif[i][1]=ay[i+1]-ay[i];
       printf("DY%d=%f\t", i,dif[i][1]);
    }
    printf("\n");
//  calculating 2nd order and other orders

    for(j=2; j<=n-1; j++)
    {
        cout<<j<<"\t";
        for(i=0; i<n-j; i++)
        {
            dif[i][j]= dif[i+1][j-1] - dif[i][j-1];
        cout<<"D^"<<j<<"Y"<<i<<"= "<<dif[i][j];
        cout<<"\t";
        }
     cout<<"\n";
    }
    cout<<"\n";
      int m=0;
    if(ax[n]<x){
        p=(x- ax[n-1])/h;
        cout<<"x="<<x<<" a="<<ax[n-1]<<" and h="<<h <<"\n So, p="<<p<<"\n";
        yp=ay[n-1];
        for(k=1;k<n;k++)
        {
            for(j=n;j>=1;j--)
            {
                 ay[j]=ay[j]-ay[j-1];
                }
                nr=nr*(p+k-1)/k;
            yp=yp+(nr)*ay[n-1];
        }
cout<<"For  X="<<x<<" corresponding Y="<<yp;
}
}
