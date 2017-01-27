//Understanding this

class Time{
	public int hrs;
	public int mins;
	public Time()
		{
			hrs=20;
			mins=10;
		}
		public void add()
		{
			int hrs,mins;
			hrs=500;
			mins=400;
			System.out.println("hrs are"+hrs);
			System.out.println("hrs (field are)"+this.hrs);
			System.out.println("mins ARe"+mins);
			System.out.println("mins (field are)"+this.mins);
		}
	}
public class hfj4{
	public static void main( String [] Args)
	{
		Time t1=new Time();
		t1.add();
		System.out.print("this is the final getsugatenshu");
	}
};