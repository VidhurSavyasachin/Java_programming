import java.util.Scanner;

public class CreateUrl {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String urlbar = in.nextLine();
        StringBuilder sb = new StringBuilder(urlbar);
       String http = "http://";
       String ftp = "ftp://";
       String https =  "https://";
       if(urlbar.contains(http)) {
    	   System.out.println(urlbar);
	   }else if(urlbar.contains(ftp)) {
		   System.out.println(urlbar);
	   }
	   else if(urlbar.contains(https)) {
		   System.out.println(urlbar);
	   }
	   else if(urlbar.contains(".")) {
    	   sb.insert(0, http);
    	   System.out.println(sb);
       }else{
    	   sb.insert(0, ftp);
    	   System.out.println(sb);
       }


       
    } 
    
}
