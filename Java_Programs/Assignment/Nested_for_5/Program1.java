import java.io.*;

class Demo{

public static void main(String[]args)throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	       	System.out.println("Enter the no of rows you want : ");
		int row = Integer.parseInt(br.readLine());
		int ch= 64+row;
	
		for(int i=1;i<=row;i++){

			int x=row;
			char ch1=(char) ch;
 	               char y= (char)65;

			for(int j=1;j<=row;j++){

			if(i%2==1)
				System.out.print(ch1-- +""+ x--+" ");
			else
				System.out.print(y+++"" + j+" ");
		        }
			System.out.println();
		}
	}
}


