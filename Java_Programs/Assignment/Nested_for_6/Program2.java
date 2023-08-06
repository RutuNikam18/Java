import java.io.*;

class Program2{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int count = 0;

                System.out.println("Enter a lower limit : ");
                int start = Integer.parseInt(br.readLine());

                System.out.println("Enter a upper limit : ");
                int end = Integer.parseInt(br.readLine());

		System.out.println("Composite numbers are : ");

                for(int i=start; i<=end; i++){

			count = 0;
                        for(int j=1; j<=i; j++){

				if(i%j == 0)
					count++;
			}

			if(count>2)
				System.out.println(i);
		}
        }
}

