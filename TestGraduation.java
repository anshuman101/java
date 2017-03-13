package niit;

public class TestGraduation {
	public Graduation getcourse(String Course)
	{
		if(Course.equalsIgnoreCase("Btech"))
			return new Course1();
		else if(Course.equalsIgnoreCase("Commerce"))
			return new Course2();
		else if(Course.equalsIgnoreCase("MBA"))
			return new Course3();
		return null;
	}

	
}
