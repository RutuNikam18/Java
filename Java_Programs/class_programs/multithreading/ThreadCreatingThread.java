
class Demo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread extends Thread{

        public void run(){

                System.out.println(Thread.currentThread().getName());
		Demo obj = new Demo();
		obj.start();
        }
}

class ThreadCreatingThread{

        public static void main(String args[]){

                MyThread obj = new MyThread();
                obj.start();
                System.out.println(Thread.currentThread().getName());
        }
}

