import java.io.*;

class Demo
{

	public static void main(String[]args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());

		for(int i=e;i>=s;i--){

		if(i%2==0){
			System.out.print(i+" ");
		}
		
	}
             System.out.println();	

		for(int i=s;i<=e;i++){
			if(i%2==1)
				System.out.print(i+" ");

		}
     }
}     
	           		

		
