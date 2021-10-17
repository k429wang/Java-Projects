import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC_21_S2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int m = readInt();
        int n = readInt();
        int k = readInt();
        
        int arr[][] = new int [n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = 0;
            }
        }
        
        String sx[] = new String [k];
		int ax[] = new int [k];
        for (int i = 0; i < k; i++) {
        	String sy = next();
        	int ay = readInt();
        	for (int j=0; j<k;j++) {
        		if ((sy==sx[j])&&(ay==ax[j])) {
        			break;
        		}
        	}
        	
        	sx[i] = sy;
			ax[i] = ay;
			
        }
        
        int gold = 0;
        for (int i = 0; i < k; i++) {
        	String s = sx[i];
			int a = ax[i];
            
            if (s.equals("C")) {
                for (int j = 0; j < m; j++) {
                    if (arr[a-1][j] == 0) {
                        arr[a-1][j] = 1;
                        gold++;
                    } else {
                        arr[a-1][j] = 0;
                        gold--;
                    }
                }
            } else if (s.equals("R")){
                for (int j = 0; j < n; j++) {
                    if (arr[j][a-1] == 0) {
                        arr[j][a-1] = 1;
                        gold++;
                    } else {
                        arr[j][a-1] = 0;
                        gold--;
                    }
                }
            } 
        }
        
        System.out.println(gold);
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}

