class Mythread extends Thread{
	static Thread nmMain=null;
	public void run(){
		try{
			nmMain.join();
		}catch(InterruptedException obj){

		}
		for (int i=0;i<10;i++){
			System.out.println("In Thread-0");
		}
	}
}
class ThreadDemo{
	public static void main(String[]args)throws InterruptedException{
		Mythread.nmMain=Thread.currentThread();
		Mythread obj=new Mythread();
		obj.start();
		obj.join();
		for(int i=0;i<10;i++){
			System.out.println("In Main");
		}
	}
}


