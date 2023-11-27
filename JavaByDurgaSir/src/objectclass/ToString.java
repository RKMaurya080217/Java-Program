package objectclass;

public class ToString
{
	String name;
	int rollno;
	ToString(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ToString ts1=new ToString("durga",101);
		ToString ts2=new ToString("ravi",103);
		System.out.println(ts1);
		System.out.println(ts1.toString());
		System.out.println(ts2);
		
		
	}

}
