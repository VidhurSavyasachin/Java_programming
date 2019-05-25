import java.util.Scanner;

public class logcal {
	public static double logb( double a, double b )
	{
	return Math.log(a) / Math.log(b);
	}
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        double N1 = (double) N;
	        int Y = in.nextInt();
	        double Y1 = (double) Y;
	        System.out.println((int)logb(Y1,N1));
	      
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        
	    }
}
//e^x = Y
//e = logx(Y)