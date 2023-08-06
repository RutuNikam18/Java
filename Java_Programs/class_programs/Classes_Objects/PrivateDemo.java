class Demo{

	int num_courses = 8;
	private String fav_course = "CPP";

	void disp(){

		System.out.println(num_courses);
		System.out.println(fav_course);
	}
}

class PrivateDemo{

	public static void main(String args[]){

		Demo d1 = new Demo();
		d1.disp();
		System.out.println(d1.fav_course);
	}
}
