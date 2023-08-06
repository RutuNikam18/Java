class Example9
{
        public static void main(String args[])
        {
                int num=0;
                for(int i=1; i<=4; i++)
                {
			num=i;
                        for(int j=1; j<=i; j++)
                        {
                                if(j%2==0)
                                        System.out.print(num*num+" ");
                                else
                                        System.out.print(num*num*num+ " ");
                                num++;
                            
                        }
                        System.out.println();
                }
        }
}



