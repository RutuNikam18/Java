
class Mythread extends Thread{

	Mythread(){

		super();
	}
	
	Mythread(String str){
		
		super(str);
	}

	Mythread(ThreadGroup tg,String str){
	
		super(tg,str);
	}
	public void run(){
		
		System.out.println(getName());
	}
}

class SameThreadName{

	public static void main(String args[]){
	
		ThreadGroup gp = new ThreadGroup("C2W");	
		Mythread obj = new Mythread(gp,"Xyz");
		Mythread obj1 = new Mythread("Xyz");
		obj.start();
		System.out.println(obj);
		obj1.start();
		Mythread obj2 = new Mythread();
		obj2.start();
	} 
}
