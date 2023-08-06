import java.io.*;

class Program1{

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		System.out.println("Enter a lower limit : ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter a upper limit : ");
		int end = Integer.parseInt(br.readLine());

		for(int i=start; i<=end; i++){

			if((i%5 == 0) &&(i%2 == 0)){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count = "+count);
	}
}
