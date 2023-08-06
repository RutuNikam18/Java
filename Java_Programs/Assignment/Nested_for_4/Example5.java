class Example5
{
        public static void main(String args[])
        {
                char ch='A';
                char ch1=ch;
                for(int i=1; i<=4; i++)
                {
                        for(int j=1; j<=4-i+1; j++)
                        {
                                System.out.print(ch+" ");
                                ch++;
                        }
                        System.out.println();
                        ch1++;
                        ch=ch1;
                }
        }
}


