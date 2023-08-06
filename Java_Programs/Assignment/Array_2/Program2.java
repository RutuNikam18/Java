import java.io.*;

class Program2{

        public static void main(String args[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int x = Integer.parseInt(br.readLine());

                int arr[] = new int[x];
                int even_sum = 0;
		int odd_sum=0;

                System.out.println("Enter Array Elements : ");
                for(int i=0; i<arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0){

				even_sum = even_sum + arr[i];
			}
			else{
				odd_sum = odd_sum + arr[i];
			}
                }

                System.out.println("Sum of even elements : "+even_sum);
		System.out.println("Sum of odd elements : "+odd_sum);
        }
}

