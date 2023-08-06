import java.io.*;

class Program5{

        public static void main(String args[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int x = Integer.parseInt(br.readLine());

                int arr[] = new int[x];

                System.out.println("Enter Array Elements : ");
                for(int i=0; i<arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
                }

		int min = arr[0];

                for(int i=0; i<arr.length; i++){
                        
                        if(arr[i] < min){
                                
                                min = arr[i];
                        }
                }
		System.out.println("Minimum number is : "+min);
        }
}

