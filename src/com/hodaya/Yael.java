package com.hodaya;

import org.apache.Moshe;

public class Yael 
{
	public static Yael s; 	
	
	public static void main(String[] args) 
	{
		Yael yael = new Yael();
		yael.callToMoshe();
	}	
	
	public void callToMoshe() 
	{
		try 
		{
			Moshe moshe = new Moshe();
			moshe.mosheCallYael();
		} 
		catch (Exception e) 
		{
			System.out.println("3 caught e and print to screen");
			e.printStackTrace();
		}	
	}
	
	public void yaelThrowException() throws Exception
	{
		System.out.println("1 throw Null Pointer Exception ");
		throw new NullPointerException();
	}	
}

