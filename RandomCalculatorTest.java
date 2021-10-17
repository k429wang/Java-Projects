import java.io.*;
import java.util.*;
public class RANDOM_CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Start");
		double v = in.nextDouble();
		double V = in.nextDouble();
		double m = (4.086*(Math.pow(10,-17)*Math.pow(v, 2)));
		System.out.println("Mass: "+m);
		double q = (m*9.8*0.05)/(V);
		System.out.println("Charge: "+q);
		System.out.println("Ratio: "+(q/m));
	}

}
