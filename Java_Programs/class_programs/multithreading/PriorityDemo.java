class MyThread implements Runnable{

        public void run(){

		Thread t = Thread.currentThread();
		t.setPriority(2);
                System.out.println("In run");
                System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++){

                        System.out.println("Rushi");
			try{
                        	Thread.sleep(2000);
			}catch(InterruptedException e){

			}
                }

        }
}

class PriorityDemo{

        public static void main(String[] args)throws InterruptedException{

                MyThread obj = new MyThread();
                Thread t = new Thread(obj);
                t.start();
		Thread t1 = Thread.currentThread();
                t1.setPriority(8);
                System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++){

			System.out.println("Rutu");
			Thread.sleep(1000);
		}
        }
}

