import java.util.*;
class Compare2demo{
	
	static int myCompTo(String str1,String str2){

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		int x;

		if(arr1.length < arr2.length)
			x=arr1.length;
		
		else 
			x=arr2.length;

		for(int i=0; i<x; i++){

			if(arr1[i] != arr2[i])
				return arr1[i]-arr2[i];
		}

		return arr1.length - arr2.length;

	}

	public static void main(String [] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Strings :");
		String str1= sc.next();
		String str2= sc.next();

		int Comp = myCompTo(str1,str2);
		System.out.println(Comp);

	}
}

