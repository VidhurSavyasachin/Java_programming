
public class List {
	static class Cell{
		String data;
		Cell next;
		Cell(String data){
			this.data = data;
			this.next = null;
		}
	}
	static Cell head;
	public static void print() {
		
	}
	public static void insert(String data) {
		
	}
	public static void find(String data) {
		Cell scan = head;
		Cell prior;
		
		while(scan != null && scan.data.charAt(0) > data.charAt(0)){
			{
				prior = scan;
				scan = scan.next;
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
