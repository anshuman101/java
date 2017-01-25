public class hfj1{
public static void main(String[] Args)
{
	String[] wordlistone={"24/7","java","fido","love"};
	String[] wordlistwo={"emp","power","maind","hello"};
	String[] wordlistthree={"abc","def","fgi"};
	int oneleng=wordlistone.length;
	int twoleng=wordlistwo.length;
	int threele=wordlistthree.length;
	int rand1=(int)(Math.random()*oneleng);
	int rand2=(int)(Math.random()*twoleng);
	int rand3=(int)(Math.random()*threele);
	//building a phrase
	String phrase=wordlistone[rand1]+""+wordlistwo[rand2]+""+wordlistthree[rand3];
	System.out.println("what we need is a"+phrase);
}
}