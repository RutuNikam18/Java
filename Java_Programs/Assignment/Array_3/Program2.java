import java.util.*;

class Program2{

        public static void main(String args[]){

                Scanner sc = new Scanner(System.in);

		int num = 0;

                System.out.println("Enter size of 1st Array : ");
                int x = sc.nextInt();

                int arr1[] = new int[x];

                System.out.println("Enter Array Elements : ");
                for(int i=0;i<arr1.length; i++){

                        arr1[i] = sc.nextInt();
                }

		System.out.println("Output : ");

                for(int i=0; i<arr1.length; i++){

			int rev = 0;
			int temp = arr1[i];
		
			while(temp != 0){

				num = temp % 10;
				rev=(rev*10)+num;
				temp = temp / 10;
				
			}
		     System.out.println(rev);
	
		}
	}
}
