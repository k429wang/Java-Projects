import java.util.*;
public class CCC_Question_2_Epidemiology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long p = in.nextLong();
		long n = in.nextLong();
		long r = in.nextLong();
		
		long a = n;
		long b = n;
		for(long i=1;i<1000000000;i++) {
			b=b*r;
			a=a+b;
			if (a>p) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
