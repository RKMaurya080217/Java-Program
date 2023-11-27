package objectclass;

import java.lang.reflect.Method;

public class ObjectClassMethods
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Object o= new Object();
		Class c=o.getClass();
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
			System.out.println(m1);

	}

}
