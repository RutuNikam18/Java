class ConstrctDemo{

	ConstrctDemo(){
		System.out.println("In Constructor");
	}

	void fun(){
		ConstrctDemo obj=new ConstrctDemo();
		System.out.println(obj);
	}

	public static void main(String[] args){
		ConstrctDemo obj1 = new ConstrctDemo();
		System.out.println(obj1);
		ConstrctDemo obj2 = new ConstrctDemo();
		System.out.println(obj2);

		obj1.fun();
	}
}

