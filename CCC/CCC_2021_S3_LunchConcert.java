import java.util.*;
import java.io.*;
public class CCC_21_S3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int p[] = new int[n];
		int w[] = new int[n];
		int d[] = new int[n];
		int z = 0;
		int y = 0;
		for(int i=0;i<n;i++) {
			p[i]=readInt();
			w[i]=readInt();
			d[i]=readInt();
			y = Math.min(y, p[i]);
			z = Math.max(z, p[i]);
		}
		int t = 0;
		int m = 0;

		double av = 0;
		for (int i=0; i<n;i++) {
			av += p[i];
		}
		av = av/n;
		
		double dev = 0;
		for (int i=0;i<n;i++) {
			double x = p[i]-av;
			dev += (x*x);
		}
		
		double sd = Math.sqrt((dev)/(n-1));

		if (n>8.5) {
			for(int i=(int) (av-(1.7*sd)); i<(av+(1.7*sd));i++){
				for(int j=0;j<n;j++) {
					int a = Math.abs(p[j]-i);
					int b = a - d[j];
					if (b<0) {
						b=0;
					}
					int c = b*w[j];
					t+=c;
				}
				if(i==0) {
					m = t;
				} else {
					m = Math.min(t, m);
					t=0;
				}
			}
		} else {
			for(int i=y; i<z;i++){
				for(int j=0;j<n;j++) {
					int a = Math.abs(p[j]-i);
					int b = a - d[j];
					if (b<0) {
						b=0;
					}
					int c = b*w[j];
					t+=c;
				}
				if(i==0) {
					m = t;
				} else {
					m = Math.min(t, m);
					t=0;
				}
			}
		}
		
		System.out.println(m);
		
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}



