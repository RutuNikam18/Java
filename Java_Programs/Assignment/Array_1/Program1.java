import java.io.*;

class Program1{

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter elements : ");
		int sum = 0;

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] % 2 == 1)
				sum = sum+arr[i];
		}
		System.out.println(" Sum of odd numbers : "+ sum);
	}
}


