import java.io.*;

class Program4{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());
                char arr[] = new char[size];
                System.out.println("Enter elements : ");
                int sum = 0;

                for(int i=0; i<arr.length; i++)
                {
                        arr[i] = (char)br.read();
			br.skip(1);
                }
		System.out.println("Vowels are : ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
                                System.out.println(arr[i]);
		}
          
        }
}

