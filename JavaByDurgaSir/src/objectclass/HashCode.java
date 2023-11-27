package objectclass;

public class HashCode
{

	int i;
	public HashCode(int i)
	{
		//super();
		this.i = i;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashCode hc1=new HashCode(12);
		HashCode hc2=new HashCode(100);
		System.out.println(hc1);
		System.out.println(hc2);
		
	}
	public int hashCode()
	{
		return i;
	}

}
