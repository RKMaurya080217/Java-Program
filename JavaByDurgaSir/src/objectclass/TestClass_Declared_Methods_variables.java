package objectclass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass_Declared_Methods_variables
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s = new Student();
		Class c = s.getClass();
		System.out.println(c);
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m)
			System.out.println(m1);
		Field[] f = c.getDeclaredFields();
		for (Field f1 : f)
			System.out.println(f1);

		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c2.hashCode() + "  " + c.hashCode());
	}

}

class Student
{
	private String name;
	private int rollno;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getRollno()
	{
		return rollno;
	}

	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}

}