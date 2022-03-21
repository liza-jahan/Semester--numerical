package Interpolation;

import java.util.Scanner;

public class Interpolation {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int x,x2,y1,y2,x1,y;
	
		 System.out.println("Input : ");
		 x1=scan.nextInt();
		 y1=scan.nextInt();
		 x2=scan.nextInt();
		 y2=scan.nextInt();
		 System.out.println("X : ");
		 x=scan.nextInt();
		 y = y1+(((x-x1)*(y2-y1))/(x2-x1));
		
		 System.out.print("Linear interpolation : "+y);

	}

}
