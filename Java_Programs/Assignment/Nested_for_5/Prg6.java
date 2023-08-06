import java.io.*;

class Prg6{
	public static void main(String[]args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two characters : ");
		char ch1=(char) br.read();
		br.skip(1);
		char ch2=(char) br.read();
		br.skip(1);

		if( ch1==ch2)
			System.out.println("Equal");
		else if(ch1>ch2)
			System.out.println(ch1-ch2);
		else
			System.out.println(ch2-ch1);
	}
}



