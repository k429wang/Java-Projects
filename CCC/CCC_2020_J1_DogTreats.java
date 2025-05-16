import java.util.*;
public class CCC_Question_1_Dog_Treats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int x = 1*s+2*m+3*l;
		if (x>=10) {
			System.out.println("happy");
		} else if (x<10) {
			System.out.println("sad");
		}
			
	}

}
