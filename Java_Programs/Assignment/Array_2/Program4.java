import java.io.*;

class Program4{

        public static void main(String args[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int x = Integer.parseInt(br.readLine());

                int arr[] = new int[x];
               
                System.out.println("Enter Array Elements : ");
                for(int i=0; i<arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
                }

		System.out.println("Enter element to search : ");
		int num = Integer.parseInt(br.readLine());

		for(int i=0; i<arr.length; i++){

			if(arr[i] == num){

				System.out.println("Element found at index : "+i);
			}
		}
        }
}

