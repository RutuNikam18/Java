class Composite_number
{
	public static void main(String args[])
	{
		int N=1;
		int count=0;
		for(int i=1; i<=N; i++)
		{
			if(N%i == 0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Not prime nor Composite number");
		}
		else if(count>2)
			System.out.println("Composite number");
		else
			System.out.println("Prime number");
	}

}
