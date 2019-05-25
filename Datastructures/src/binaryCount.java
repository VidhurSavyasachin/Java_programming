import java.util.Scanner;

public class binaryCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		String x = "";
		int count = 0;
		for (int i = 0; i < n; i++) {
			long x1 = in.nextLong();
			x = Long.toBinaryString(x1);
			for (int j = 0; j < x.length(); j++) {
					if(x.charAt(j)=='1') {
						count+=1;
					}
			}
			System.out.println(count);
			
			count = 0;
		}
	}
}
