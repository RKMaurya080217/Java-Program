package objectclass;

public class ToStringAndHashCode
{
	int i;
	
	public ToStringAndHashCode(int i)
	{
		super();
		this.i = i;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ToStringAndHashCode tshc1=new ToStringAndHashCode(10);
		ToStringAndHashCode tshc2=new ToStringAndHashCode(100);
		System.out.println(tshc1);
		System.out.println(tshc2);
	}
	
	@Override
	public String toString()
	{
		return i+"";
	}
	
	//this hashcode method won't be executed because we are not using in this program(in toString method 
	public int hashCode()
	{
		return i+10;
	}
}
