import java.io.*;

class Program8{

        public static void main(String args[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of 1st array : ");
                int x = Integer.parseInt(br.readLine());

                System.out.println("Enter size of 2nd array : ");
                int y = Integer.parseInt(br.readLine());


                int arr1[] = new int[x];
                int arr2[] = new int[y];

                System.out.println("Enter 1st Array Elements : ");
                for(int i=0; i<arr1.length; i++){

                        arr1[i] = Integer.parseInt(br.readLine());
                }

                 System.out.println("Enter 2nd Array Elements : ");
                for(int i=0; i<arr2.length; i++){

                        arr2[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Uncommon elements between array are : ");

              
                for(int i=0; i<arr1.length; i++){
			int count=0;
                        for(int j=0; j<arr2.length; j++){

                                if(arr1[i] == arr2[j])
                                      count = 1;

                        }

			if(count == 0){
				System.out.println(arr1[i]);
		          }

		
		}		

                

		for(int i=0; i<arr2.length; i++){
                        int count=0;
                        for(int j=0; j<arr1.length; j++){

                                if(arr2[i] == arr1[j])
                                      count = 1;

                        }

                        if(count == 0){
                                System.out.println(arr2[i]);
                          }

                            
                }
	}








        }


