package threadsEx;
public class threadsEx {
	
	public static void main(String[] args) {
		Thread asterisco=new Thread(new dadThread("*"));
		Thread hastag=new Thread(new dadThread("#"));
		asterisco.start();
		hastag.start();
	}
}
