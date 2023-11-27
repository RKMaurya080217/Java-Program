package objectclass;

public class EqualsMehtod
{
	String name;
	int rollno;

	public EqualsMehtod(String name, int rollno)
	{
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args)
	{
		EqualsMehtod em1=new EqualsMehtod("durga", 101);
		EqualsMehtod em2=new EqualsMehtod("durga", 102);
		EqualsMehtod em3=new EqualsMehtod("ravi", 101);
		EqualsMehtod em4=em1;
		System.out.println(em1.equals(em2));
		System.out.println(em1.equals(em3));
		System.out.println(em1.equals(em4));
		System.out.println(em1.equals("durga"));
		System.out.println(em1.equals(null));
		//System.out.println(em1.hashCode()+" & "+em4.hashCode());
		
	}
	
}
