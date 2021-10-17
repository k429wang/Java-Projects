import java.util.*;
import java.io.*;

public class CCC_Question_5_Escape_Room {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		
		if (m==2) {
			String s = in.readLine();
			String d = in.readLine();
			String a[] = s.split(" ");
			String b[] = d.split(" ");
			
		} else if (m==1) {
			String s = in.readLine();
			String a[] = s.split(" ");
			int y = Integer.parseInt(a[0]);
			for(int i=0;i<n;i++) {
				y = Integer.parseInt(a[y]);
				if (y==n) {
					System.out.println("yes");
					break;
				}
				if(i==n-1) {
					System.out.println("no");
					break;
				}
			}
		}
	}
}
