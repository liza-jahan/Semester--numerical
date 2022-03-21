package FalsePosition;

import java.util.Scanner;

public class FalsePosition {
    static double f(double x){
        return x*x*x + 3*x*x - 1;
        //return 5*x*x*x-7*x*x+9*x-30;
    }
    static void falsePosition(double a, double b, double acuracy){
        if (a<b && f(a) * f(b) >= 0)
        {
            System.out.println("Your assumption is not right for a and b");
            return;
        }
        double c=a;
        int step=1;
        while(Math.abs(f(c))>=acuracy){
            c= a-((f(a)*((b-a)/( f(b)-f(a)))));
            System.out.printf("Iteration:%d   a=%.5f  f(a)=%.5f  b=%.5f  f(b)=%.5f  c=%.5f  f(c)=%.5f  ",step,a,f(a),b,f(b),c,f(c));
            if(f(c)==0){
                System.out.println("\nThe root is: "+c);
                break;
            }
            else if (f(c)*f(a) < 0){
                b = c;
                System.out.printf("update: b=c\n");
            }
            else{
                a = c;
                System.out.printf("update: a=c\n");
            }
            step++;
        }
        System.out.printf("\nThe value of root is : %.5f\n",c);
    }
    public static void main(String[] args) {
        double a,b,acuracy;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Guess for a: ");
            a=sc.nextDouble();
            System.out.print("Guess for b: ");
            b=sc.nextDouble();
            System.out.print("Acuracy value: ");
            acuracy=sc.nextDouble();
            falsePosition(a,b,acuracy);
        }
    }

}
