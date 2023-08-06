import java.util.*;

class Program4{
        public static void main(String[]args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of Array: ");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter the elements");

                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Index of Prime elements are  :");
                 for(int i=0;i<arr.length;i++){
                                int count=0;
                         for(int j=1;j<=arr[i];j++){

                                 if(arr[i]%j==0){
                                         count++;
                                 }
                         }
                        if(count == 2)
                                System.out.println(i);
                 }
        }
}


