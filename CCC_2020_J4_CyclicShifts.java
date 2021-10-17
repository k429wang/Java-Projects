import java.util.*;
public class CCC_Question_4_Cyclic_Shifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		String s = in.nextLine();
		
		int l = s.length();
		String arr[] = new String[l];
		for(int i=0;i<l;i++) {
			char d = s.charAt(0);
			String f = s.substring(1,s.length());
			s = f + d;
			arr[i] = s;
		}
		
		for(int i=0;i<l;i++) {
			if (t.contains(arr[i])) {
				System.out.println("yes");
				break;
			}
			if (i==l-1) {
				System.out.println("no");
			}
		}
	}

}
