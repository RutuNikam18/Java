class Strong_number
{
	public static void main(String args[])
	{
		int N=143;
		int temp=N;
		int sum=0;
		while(N!=0)
		{
			int x = N%10;
			int mult = 1;
			for(int i = 1; i<=x; i++)
			{
				mult=mult*i;
			}
			sum = sum+mult;
			N=N/10;
		}
		if (sum == temp)
			System.out.println("It is Strong number");
		else
			System.out.println("It is not strong number");
	}
}
