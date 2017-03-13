import java.util.Scanner;
class IntersectArrays{
	public static void main(String[] Args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Intersection of two arrays");
		int A[]=new int[10];
		int B[]=new int[10];
		System.out.println("enter the first array(Sorted)");
		for(i=0;i<10;i++)
		{
			A[i]=sc.nextInt();
		}
		i=0;
		System.out.println("enter the second array(Sorted)");
		for(i=0;i<10;i++)
		{
			B[i]=sc.nextInt();
		}
		i=0;
		j=0;
		while(i!=10&&j!=10)
		{
			if(A[i]==B[j])
			{
				System.out.print(A[i]+" ,");
				i++;
				j++;
			}
			else if(A[i]>B[j])
			j++;
			else if(A[i]<B[j])
			i++;
		}
		sc.close();
	}
}
			