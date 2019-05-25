package median_array_linkedList;

import java.util.Scanner;

public class Consumer {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int MMM = in.nextInt();
        int AAA = in.nextInt();
        int NNN = in.nextInt();
        int[] result = new int[NNN];
        int sum = 0;
        int resultFinal = 0;
        for(int i=0;i<NNN;i++){
           result[i] = (i+1)*MMM;
           sum+=result[i];
    }
        resultFinal = sum - AAA;
        if(resultFinal > 0) {
        System.out.println(resultFinal);
        }else {
        System.out.println(0);	
        }
        }
}
