import java.util.*;
public class CCC_Question_3_Art {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		int a[] = new int[n];
		int b[] = new int[n];
				
		for (int i=0;i<n;i++) {
			String s = in.nextLine();
			int x = s.indexOf(",");
			String s1 = s.substring(0,x);
			String s2 = s.substring(x+1,s.length());
			int as = Integer.parseInt(s1);
			int bs = Integer.parseInt(s2);
			a[i] = as;
			b[i] = bs;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int a1 = a[0]-1;
		int b1 = b[0]-1;
		
		int a2 = a[n-1]+1;
		int b2 = b[n-1]+1;
		
		String x = a1 + "," + b1;
		String y = a2 + "," + b2;
		
		System.out.println(x);
		System.out.println(y);

		
	}

}
