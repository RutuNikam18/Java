class Automorphic_2
{
	public static void main(String args[])
	{
		int N=66;
		int temp=N;
		int count=0;

		while(N!=0)
		{
			count++;
			N=N/10;
		}
		int square= temp*temp;
		int count1=0;

		for(int i=1;i<=count;i++)
		{
			if(square % 10== temp%10)
				count1++;
			square=square/10;
			temp=temp/10;
		}

		if(count==count1)
			System.out.println("It is Automorphic");

		else
			System.out.println("It is not Automorphic");		

	}

}
