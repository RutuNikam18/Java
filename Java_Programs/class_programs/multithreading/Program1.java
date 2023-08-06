class MyThread extends Thread {

	 public void run(){

		 System.out.println("child Thread "+Thread.currentThread().getName());
		   
		 for(int i=0;i<10;i++){
			 System.out.println("In run");

			 try{
				 Thread.sleep(2000);
			 }
				catch(InterruptedException obj){

				}
		 }
	 }
}

class Program1{
	public static void main(String[] args) throws InterruptedException{
	
		System.out.println(Thread.currentThread().getName());
		
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0;i<10;i++){
			System.out.println("In Main");
			Thread.sleep(2000);
		}
	}
}

