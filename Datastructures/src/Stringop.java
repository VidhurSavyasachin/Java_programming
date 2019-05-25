import java.util.Scanner;
public class Stringop {
 	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        String replaced = ip.replace(".", "");
        int value = 0;
        int getNumericValue = Character.getNumericValue(replaced.charAt(0));;
        for (int i = 0; i < replaced.length(); i++) {
			 value += Character.getNumericValue(replaced.charAt(i));
        }
       

        System.out.println(value * getNumericValue);
    }
}
