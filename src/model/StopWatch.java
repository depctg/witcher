package model;

import java.math.BigDecimal;

public class StopWatch {
	private long start;
	private long end;
	
	public void start() {
		start = System.nanoTime();
	}
	
	public void stop(String str) {
		end = System.nanoTime();//����
		BigDecimal diff = BigDecimal.valueOf(end - start,10);//�뼶��ֵ
		diff = diff.multiply(new BigDecimal(1000));
	    System.out.println(str + ": " + diff + "ms");
	}
}
