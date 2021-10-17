import java.util.*;
import java.io.*;
public class CCC_21_S4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int w = readInt();
		int d = readInt();
		
		int a[] = new int[w];
		int b[] = new int[w];
		for (int i=0; i<w; i++) {
			a[i] = readInt();
			b[i] = readInt();
		}
		
		int s[] = new int[n];
		for (int i=0; i<n; i++) {
			s[i] = readInt();
		}

		int x[] = new int[d];
		int y[] = new int[d];
		for (int i=0; i<d; i++) {
			x[i] = readInt();
			y[i] = readInt();
		}
		
		for(int i=0;i<d;i++) {
			int base = 0;
			for (int j=0; j<n;j++) {
				if (s[i]==x[i]) {
					s[i]=y[i];
				} else if (s[i]==y[i]){
					s[i]=x[i];
				} 
				if (s[i]==n) {
					base = i;
				}
			}
			
		}
		
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}
