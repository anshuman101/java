public class time{
	public int hrs;
	public int mins;
	public int secs;
	public static int t;
	public void getdata(time t){
		System.out.println("the hrs mins secs for "+this.t"time is ");
		t.hrs=(int)(Math.random()*10);
		t.mins=(int)(Math.random()*60);
		t.secs=(int)(Math.random()*60);
		System.out.println(+hrs" hours "+mins" mins"+secs" secs");
		
		};
	public static void add(time t1,time t2){
		int hr,sec,min;
		hr=t1.hrs+t2.hrs;
		min=t1.mins+t2.mins;
		sec=t1.secs+t2.secs;
		if(sec>60)
		{
			min++;
		}
		if(min>60)
		{
			hr++;
		}
		System.out.println(+hr" hours "+min" mins "+sec "secs");
	}
	time()
	{
		hrs=0;
		mins=0;secs=0;
		t=1;
	}
};
public class hfj2{
	public static void main(String[] Args)
	{
		time t1=new time();
		time t2=new time();
		getdata(t1);
		getdata(t2);
		add(t1,t2);
	}
};
		