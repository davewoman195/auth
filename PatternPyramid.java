import java.io.*;
class PatternPyramid
{
	public static void pyramid(int n)   //where n=no. of line
	{	
		for(int i=0;i<n;i++)
		{	
			
			for(int j=2*(n-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=(2*(n-i))+1;j<=((2*(n-i)+1)+2*i);j++)	 
				
				{
					System.out.print("* ");
				
				}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int n=5;
		pyramid(n);
	}
}
		