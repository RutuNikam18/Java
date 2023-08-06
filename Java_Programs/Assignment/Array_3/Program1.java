import java.util.*;

class Program1{

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

		System.out.println("Number of digits in an array : ");

                for(int i=0; i<arr1.length; i++){

			int count = 0;
			int temp = arr1[i];

			while(temp != 0){

				num = temp % 10;
				count ++;
				temp = temp / 10;
			}
			
			System.out.println(count);
		}
	}
}
