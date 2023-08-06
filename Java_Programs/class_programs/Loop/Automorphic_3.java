class Automorphic_3
{
	public static void main(String args[])
	{
		int count=0,temp2,n=25,rev=0,num=0;
		int temp1=n;
		int temp3=n;

		while(n!=0)
		{
			count++;
			n=n/10;
		}

		temp2=temp1*temp1;

		for(int i=1;i<=count;i++)
		{
			int x=temp2%10;
			rev=rev*10+x;
			temp2=temp2/10;
		}

		while(rev!=0)
		{
			int rem=rev%10;
			num=num*10+rem;
			rev=rev/10;
		}

		if(num==temp3)
			System.out.println("Automorphic number");
		else
			System.out.println("Not Automorphic number");
	}
}
