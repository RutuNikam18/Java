class Prg2{

	public static void main(String [] args){

		String str1= "Rushi";
		String str7 = "Rushikesh";
		String str2= "Rutu";
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		String str5 = str2.concat(str1);
		String str6 = "";
		String str8 = "RUSHI";

		System.out.println("String 1 : "+ str1);
		
		System.out.println("String 2 : "+ str2);

		System.out.println("Use of + symbol : "+ str3);

		System.out.println("Rushi concat Rutu : "+ str4);
		System.out.println("Rutu concat Rushi : "+str5);

		System.out.println("Length of Rutu : "+ str2.length());
		System.out.println("Length of blank String : "+str6.length());

		System.out.println("Character at 3 of rushi : "+ str1.charAt(3));
//		System.out.println("Character at 6th place of rushi : "+str1.charAt(6));
		
		System.out.println("Compare Rushi and Rutu : "+ str1.compareTo(str2));
		System.out.println("Compare Rutu and Rushi : "+ str2.compareTo(str1));
		System.out.println("Compare Rushi and Rushikesh : "+ str1.compareTo(str7));
		System.out.println("Compare Rushikesh and Rushi : "+ str7.compareTo(str1));
		System.out.println("Compare Rushikesh and Rutu : "+ str7.compareTo(str2));


		System.out.println("CompareToIgnore Case : ");
		System.out.println("Compare Rushi and RUSHI : "+ str1.compareToIgnoreCase(str8));

		System.out.println("Equals Method : ");
		System.out.println("Is Rushi and RUSHI equal : "+ str1.equals(str8));

		System.out.println(str1.equalsIgnoreCase(str8));
	}
}


