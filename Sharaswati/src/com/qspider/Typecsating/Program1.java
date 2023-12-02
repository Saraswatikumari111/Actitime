package com.qspider.Typecsating;

class House
{
	void labours()
	{
		System.out.println(" labours....");
	}
	void contractor()
	{
		System.out.println("contractor....");
	}
}
class material extends House
{
	void cement()
	{
		System.out.println("cement....");
	}
	void bricks()
	{
		System.out.println("bricks.....");
	}
}


public class Program1
{
public static void main(String[] args)
{
	House ref=new material();
	ref.labours();
	ref.contractor();
	
}
}
