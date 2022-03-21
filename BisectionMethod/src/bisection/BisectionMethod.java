
package bisection;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BisectionMethod {

	
	    double display(double x){
	        double result =  5*(x*x*x)-7*(x*x)+9*x-1;
	        return result;
	    }

	    static void point(){
	    	BisectionMethod scan = new BisectionMethod();
	        NumberFormat s_5= new DecimalFormat("#0.00000");
	        Scanner Input = new Scanner(System.in);
	        double x0,x1;
	        System.out.print("Enter the real value A = ");
	        x0= Input.nextDouble();
	        System.out.print("Enter the real value B = ");
	        x1= Input.nextDouble();

	        if (x0>=x1){
	            System.out.println("Invalid x0 & x1");
	            point();
	        }else{
	            double fx0 = scan.display(x0),fx1 = scan.display(x1),k,fm,m =x0-((fx0)*(x1-x0)/(fx1-fx0)),c = 0;

	            if (fx0*fx1 >= 0){
	                System.out.println("Incorrect X0 & X1");
	                point();
	            }else{
	                System.out.print(" accuracy = ");
	               k = Input.nextDouble();
	                fm = scan.display(m);
	                int i = 1;
	                while (Math.abs(fm)>k){
	                    System.out.print("Step="+i+"\t");
	                   c=x0-((fx0)*(x1-x0)/(fx1-fx0));
	                    double fc=scan.display(c),fx2=scan.display(x0),fx3 = scan.display(x1);

	                    System.out.print("X0="+s_5.format(x0)+"\t"+"f(X0)="+s_5.format(fx2)+"\t"+
	                            "X1="+s_5.format(x1)+"\t"+"f(X1)="+s_5.format(fx3)+"\t"+
	                            "c="+s_5.format(c)+"\t"+"f(c)="+s_5.format(fc)+"\t");
	                    if(fc==0){
	                        System.out.println(" Root = "+c);
	                        break;
	                    }else if(fx2*fc <0){
	                        x1=c;
	                        System.out.println("x0=c");
	                    }else if(fx3*fc <0){
	                        x0=c;
	                        System.out.println("x1=c");
	                    }
	                    fm=fc;
	                    i++;
	                }
	                System.out.println("Accurate value of root = "+s_5.format(c));
	            }
	        }
	    }
	    public static void main(String[] args) {
	        point();
	    }
}