package objectclass;

import java.util.ArrayList;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = new String("durga");
		System.out.println(s);
		Integer i = new Integer(10);
		System.out.println(i);
		;
		ArrayList al = new ArrayList<>();
		al.add("A");
		al.add("B");
		System.out.println(al);

		Test t = new Test();
		System.out.println(t);
		;
	}

	public String toString()
	{
		return "Text";
	}

}
