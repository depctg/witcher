package model;

import java.math.BigDecimal;

public class StopWatch {
	private long start;
	private long end;
	
	int defaultCount=1;
	public void start() {
		start = System.nanoTime();
	}
	
	public void stop(String str) {
		end = System.nanoTime();//����
		BigDecimal diff = BigDecimal.valueOf(end - start,10);//�뼶��ֵ
		diff = diff.multiply(new BigDecimal(10000));
	    System.out.println(str + ": " + diff + "ms");
	    System.out.flush();
	}
	
	public void stop() {
		stop("["+defaultCount+++"]��ʱ��");
	}
	
	public void stopAndStart(){
		stop("["+defaultCount+++"]��ʱ��");
		start();
	}
	public void stopAndStart(String tip){
		stop(tip);
		start();
	}
	
}
