package Rapson;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class RaphsonMethod {
	 static double FuncTion(double x){
	        double result =  3*x*x*x - 4*x*x-6*x+1;
		
	        return result;
	        
	    }
		static double FuncTion_2(double x){
	        double result =  9*x*x- 8*x - 6 ;
			
	        return result;
	        
	    }
	    static void Solution(){
	       	NumberFormat F = new DecimalFormat("#0.00000");
	        Scanner Input = new Scanner(System.in);
	        double a,b;
	        System.out.print("Enter the real value A = ");
	        a= Input.nextDouble();
	        System.out.print("Enter the real value B = ");
	        b= Input.nextDouble();
	        
	        
	        if (a>=b){
	            System.out.println("Invalid a & b");
	            Solution();
	        }else{
	            double fa = FuncTion(a),fb = FuncTion(b);
	            if (fa*fb >= 0){
	                System.out.println("Incorrect a & b");
	                Solution(); 
	            }else{
					a = (a+b)/2;
					double acc;
	                System.out.print("Give accuracy = ");
	                acc = Input.nextDouble();
	                int i = 1;
					double fxx = FuncTion(a)/FuncTion_2(a);
	                while (Math.abs(fxx)>acc){
						double Xn = a;
						fxx = FuncTion(a)/FuncTion_2(a);
						a = a - fxx;
	                    System.out.print("Step="+i+"\t");
						System.out.print("X0="+F.format(Xn)
											+"\t"+"f(X0)="+F.format(FuncTion(Xn))
											+"\t"+"f'(X0)="+F.format(FuncTion_2(Xn))
											+"\t"+"X1="+F.format(a)
											+"\t"+"f(X1)="+F.format(FuncTion(a))+"\t");
											//+"\tUpdate(X0=X1)");
						  if(fa==0){
		                        System.out.println(" Root = "+a);
		                        break;
		                   
		                    }else 
                            {
		                       System.out.println("Update(x0=x1)");
		                    }
	                    i++;
	                }
	                System.out.println("Acurate value of root = "+F.format(a));
	                
	            }
	        }
	    }
	        
	    public static void main(String[] args) {
	        
	        Solution();
	        
	    }
}
