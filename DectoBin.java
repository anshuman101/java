import java.util.Scanner;
class DectoBin{
	public static void main(String[] Args)
	{
		int b,i=0;
		System.out.println("Enter the decimal number");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		int A[]=new int[10];
		while(b!=0)
		{
			A[i]=b%2;
			b=b/2;
			i++;
		}
		for(i=9;i>=0;i--)
		{
			System.out.print(A[i]);
		}
		sc.close();
	}
}
