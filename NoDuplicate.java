import java.util.Scanner;
class NoDuplicate{
	public static void main(String [] Args)
	{
		int i;
		int A[]=new int[10];
		Scanner a=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			A[i]=a.nextInt();
		}
		for(i=1;i<10;i++)
		{
			
			if(A[i]==A[i-1])
			i++;
			else
				System.out.println((char)A[i]+",");
		}
		
	}
}