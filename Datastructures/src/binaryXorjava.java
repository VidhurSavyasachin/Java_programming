import java.util.Scanner;

public class binaryXorjava {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n1 = in.next();
        String n2 = in.next();
        long num1 = Long.parseLong(n1,2);
        long num2 =Long.parseLong(n2,2);
        long num3 = num1 ^ num2;
        String value = Long.toBinaryString(num3);
        long bin = Long.parseLong(value);
        String form =  String.format("%0"+n1.length()+"d",bin);

        System.out.println(form);
    }
}
