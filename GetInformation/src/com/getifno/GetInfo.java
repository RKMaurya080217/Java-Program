package com.getifno;

import java.util.ArrayList;
import java.util.Scanner;

public class GetInfo
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		StudentDetails sd;
		ArrayList<StudentDetails> studentList = new ArrayList<StudentDetails>();
		
		do
		{
			sd=new StudentDetails();
			System.out.println("Enter your name : ");
			sd.setName(sc.next());
			System.out.println("Enter your rollNo. : ");
			sd.setRollno(sc.next());
			System.out.println("Enter your contact : ");
			sd.setContact(sc.next());
			System.out.println("Enter your address : ");
			sd.setAddress(sc.next());
			//System.out.println(sd.toString());			
			studentList.add(sd);
			System.out.println("To add more details press 1 other wise press 0");
			
		}while(sc.nextInt()!=0);
		
		System.out.println(studentList);
		/*
		 * for(StudentDetails studentArrayList : studentList) {
		 * System.out.println(studentArrayList); }
		 */
	}

}

class StudentDetails
{
	String name;
	String rollno;
	String contact;
	String address;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRollno()
	{
		return rollno;
	}
	public void setRollno(String rollno)
	{
		this.rollno = rollno;
	}
	public String getContact()
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "StudentDetails [name=" + name + ", rollno=" + rollno + ", contact=" + contact + ", address=" + address
				+ "]";
	}
	
	
}
