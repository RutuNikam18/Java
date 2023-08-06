class Automorphism_1
{
	public static void main(String args[])
	{
		int N=4;
		int count=0;
		int temp=N;
		while(N!=0)
		{
			count++;
			N=N/10;
		}

		int mult=1;
		for(int i=1; i<=count; i++)
		{
			mult=mult*10;
		}
		int square= temp*temp;
		if(square%mult == temp)
			System.out.println("It is automorphic");
		else
			System.out.println("Not automorphic");

	}
}
