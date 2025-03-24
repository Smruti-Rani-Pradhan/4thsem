package Assignment4;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Q6 {
private int[] data;
public Q6(int size) {
	this.data=new int[size];
}
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		List<Q6> ob=new ArrayList<>();
		SimpleDateFormat s=new SimpleDateFormat("HH:MM:SS");
		printMemoryUsage(r,s,"Start");
        for(int i=0;i<100000;i++) {
        	ob.add(new Q6(1000));
        	if(i%10000==0) {
        		printMemoryUsage(r,s,"After creating "+i+" objects");
        	}
        }
        ob.clear();
        System.gc();
        printMemoryUsage(r,s,"After garbage collection");
        System.out.println("End of program");
	}
	private static void printMemoryUsage(Runtime r, SimpleDateFormat s, String label) {
		String t=s.format(new Date());
		long totalMemory=r.totalMemory()/1024/1024;
		long freeMemory=r.freeMemory()/1024/1024;
		long usedMemory=totalMemory-freeMemory;
		System.out.printf("[%s]%s-Total Heap:%d MB| used Heap:%d MB %n"
				,t,label,totalMemory,freeMemory,usedMemory);
		
		
	}

}
