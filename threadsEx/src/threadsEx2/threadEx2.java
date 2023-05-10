package threadsEx2;
import java.util.Random;
public class threadEx2 {
	class dadThread extends Thread{
		int[] casualNum=new int[3000] ;
	}
	public static int[] thread1(int[] casualNum) {
		Random rand=new Random();
		int[] random=new int[1000] ;
		for(int i=0;i<1000;i++) {
			int rNumber= rand.nextInt(100);		
			random[i]=casualNum[rNumber];
		}	
		return casualNum;
	}

}
