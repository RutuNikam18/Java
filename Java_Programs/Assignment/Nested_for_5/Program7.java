import java.io.*;
class Program7{

	public static void main (String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numberof rows : ");
		int rows = Integer.parseInt(br.readLine());

		int num = (rows *(rows+1))/2;

		for(int i=1; i<=rows; i++){

			for(int j=1; j<=i; j++){

				if((i%2 == 0 && rows%2 == 0)||(i%2 == 1 && rows%2 == 1)){

					System.out.print((char)(64+num) + " ");
				}
				else{
					System.out.print(num + " ");
				}

				num--;
			}
			System.out.println();
		}
	}
}
