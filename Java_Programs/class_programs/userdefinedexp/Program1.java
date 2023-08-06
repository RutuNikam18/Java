
import java.util.*;

class Demo extends RuntimeException{

	Demo(String msg){

		System.out.println(msg);
	}
}

class Program1{

	public static void main(String args[]){
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers");
		for(int i=0; i<5; i++){
			int data = sc.nextInt();

			if(data>100)

				throw new Demo("Data > 100");
			arr[i] = data;
		}

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i] + " ");
		}

	}
}
