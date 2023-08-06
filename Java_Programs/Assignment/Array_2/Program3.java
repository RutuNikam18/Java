import java.io.*;

class Program3{

        public static void main(String args[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array : ");
                int x = Integer.parseInt(br.readLine());

                int arr[] = new int[x];
                int even_count = 0;
                int odd_count = 0;

                System.out.println("Enter Array Elements : ");
                for(int i=0; i<arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
                        if(arr[i]%2 == 0){

                                even_count++ ;
                        }
                        else{
                                odd_count++ ;
                        }
                }

                System.out.println("Number of even elements : "+even_count);
                System.out.println("Number of odd elements : "+odd_count);
        }
}

