import java.util.concurrent.*;
class Mythread implements Runnable{
	
	int num;
	Mythread(int num){
		
		this.num=num;
	}

	public void run(){
		
		System.out.println(Thread.currentThread()+" start thread "+num);
		dailytask();
		System.out.println(Thread.currentThread()+" End Thread "+num);
	}

	void dailytask(){
		
		try{
		
			Thread.sleep(100000);
		}catch(InterruptedException ae){
		
		}

	}

}


class TwoThreadPoolDemo{
	
	public static void main(String[] args){
	
		ExecutorService ser= Executors.newFixedThreadPool(3);
		for(int i=0;i<6;i++){
		
			Mythread obj = new Mythread(i);
			ser.execute(obj);
		}
		
		ExecutorService ser1= Executors.newFixedThreadPool(3);
		for(int i=0;i<6;i++){
		
			Mythread obj = new Mythread(i);
			ser1.execute(obj);
		}
		ser1.shutdown();
		ser.shutdown();
	}
}

