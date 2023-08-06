import java.io.*;

class Program1{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array : ");
		int x = Integer.parseInt(br.readLine());

		int arr[] = new int[x];
		int sum = 0;

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i]; 
		}

		System.out.println("Sum of elements : "+sum);
	}
}
