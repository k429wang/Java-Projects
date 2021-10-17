import java.util.*;
import java.io.*;
public class CCC_21_S1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		int h[] = new int[n+1];
		for(int i=0; i<(n+1); i++) {
			h[i] = readInt();
		}
		
		int w[] = new int[n];
		for (int i=0; i<n; i++){
			w[i]=readInt();
		}
		
		double t = 0;
		for(int i=0; i<(w.length);i++) {
			double rec = ((w[i])*(Math.min(h[i], h[i+1])));
			double tri1 = (w[i]*(Math.max(h[i], h[i+1])-(Math.min(h[i], h[i+1]))));
			double tri = tri1/2;
			double area = rec + tri;
			t += area;
		}
		
		System.out.println(t);
		
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
