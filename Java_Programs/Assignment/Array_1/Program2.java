import java.io.*;

class Program2{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());
                int arr[] = new int[size];
                System.out.println("Enter elements : ");
                int mult = 1;

                for(int i=0; i<arr.length; i++)
                {
                        arr[i] = Integer.parseInt(br.readLine());
                        if(arr[i] % 2 == 0)
                                mult = mult * arr[i];
                }
                System.out.println(" Multiplication of even numbers : "+ mult);
        }
}

