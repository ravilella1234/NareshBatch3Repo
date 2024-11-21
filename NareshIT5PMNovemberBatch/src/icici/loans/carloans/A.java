package icici.loans.carloans;

import java.util.Date;

public class A
{
	int x =100;  // variable declaration
	public int  y = 100; // Variable defined
	public static final String cname = "oracle";
	
	public void m1()
	{
		x = 200;
		System.out.println("iam m1 from A" + x);
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static from A");
	}
	
	static
	{
		System.out.println("iam static block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		m4();
		System.out.println(a.y);
	}

}
