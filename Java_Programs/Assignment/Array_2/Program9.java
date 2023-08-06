import java.util.*;

class Program9{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st Array : ");
		int x = sc.nextInt();

		int arr1[] = new int[x];

		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr1.length; i++){

			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of 2nd Array : ");
                int y = sc.nextInt();

                int arr2[] = new int[y];

                System.out.println("Enter Array Elements : ");
                for(int i=0;i<arr2.length; i++){

                        arr2[i] = sc.nextInt();
                }

		System.out.println("Merged Array elements are : ");

		int arr3[] = new int[x+y];

		for(int i=0; i<arr1.length; i++){

			arr3[i] = arr1[i];
		}

		for(int i=0; i<arr2.length; i++){

                        arr3[x+i] = arr2[i];
                }

		for(int i=0; i<arr3.length; i++){

                        System.out.println(arr3[i]);
		}
                
	}
}
