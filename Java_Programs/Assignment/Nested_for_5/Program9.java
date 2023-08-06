import java.io.*;

class Program9{

	public static void main(String[]args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number :");
		int num=Integer.parseInt(br.readLine());
		int temp=num;
		int sum=0;
		while (num!=0){
			int rem=num%10;
				int mult=1;

/*			while(rem!=0){
			mult=mult*rem;
			rem--;
			}*/

			for(int i=1; i<=rem; i++){

				mult = mult*i;
			}
			sum=sum+mult;
			num=num/10;
		}
		System.out.println("Addition of factorials of "+temp+" is: "+sum);
		
	}



}


