
import java.io.*;

class Demo{

	
	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of rows : ");
		int rows = Integer.parseInt(br.readLine());

		int a=0;
		int b=1;
		int sum=0;

		for( int i=1; i<=rows; i++){

			for(int j=1; j<=i; j++){

				System.out.print(sum+ " ");
				a=b;
				b=sum;
				sum=a+b;
			}
			System.out.println();
		}
	}
}


