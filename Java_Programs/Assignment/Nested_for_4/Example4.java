class Example4
{
        public static void main(String args[])
        {
                int num=1;
		int num1=num;
                for(int i=1; i<=4; i++)
                {
                        for(int j=1; j<=4-i+1; j++)
                        {
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println();
			num1++;
			num=num1;
                }
        }
}

