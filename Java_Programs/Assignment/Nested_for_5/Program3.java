import java.io.*;

class Demo{

public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the no of rows you want : ");
                int row = Integer.parseInt(br.readLine());
		int x = row;
		int count=row;
		for(int i=1;i<=row;i++){

			x=count;

			for(int j=1;j<=row-i+1;j++){
	
				System.out.print((x*i)+" ");
				x--;
			}
			count--;
		System.out.println();
		}

   }
}

