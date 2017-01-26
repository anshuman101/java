class Light{
	//fields
	int noofwatts;
	boolean indicator;
	String location;
	
	//static variable
	static int counter;
	Light()
	{
		noofwatts=0;
		indicator=true;
		location="ansh";
		++counter;
	}
	
	//static method
	public static void writecount()
	{
		System.out.println("Number of lights"+counter);
		//compile error 
		
		//System.out.println("Number of noofwatts"+noofwatts);
	}
};
public class hfj3{
	public static void main( String[] args)
	{
		Light.writecount();
		Light alight=new Light();
		System.out.println(
			"value of counter;" +Light.counter
			);
		Light blight=new Light();
		blight.writecount();
		Light clight=new Light();
		System.out.println(
			"value of counter:" +clight.counter
			);
	}
}