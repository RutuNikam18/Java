class Example10
{
	public static void main(String[]args)
	{
		int row=4;
		int num=1;
		for(int i=1;i<=row;i++)
		{    num=i;
			for(int j=1; j<=i; j++)
			{
				if(num%2==1)
					System.out.print(num*num+" ");
				else
					System.out.print(num*num*num+" ");
				num++;											
			}
		System.out.println();
		}	
	}
}
