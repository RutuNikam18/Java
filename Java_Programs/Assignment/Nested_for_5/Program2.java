import java.io.*;

class Demo{

public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the no of rows you want : ");
                int row = Integer.parseInt(br.readLine());
		for (int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(j==i)
					System.out.print("#"+" ");
				else
					System.out.print("="+" ");
			}
			System.out.println();

		}
}
}
