import java.io.*;	
import java.util.*;

class InputDemo
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age");
		int str=Integer.parseInt(br.readLine());
		System.out.println("Your age is ="+str);

	}

}

