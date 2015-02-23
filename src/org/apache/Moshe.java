package org.apache;

import com.hodaya.Yael;

public class Moshe 
{
	public static void main(String[] args) 
	{
	
	}	
	
	public void mosheCallYael() throws Exception 
	{
		try 
		{
			Yael callYael = new Yael();
			callYael.yaelThrowException();
		} 
		catch (Exception e) 
		{
			System.out.println("2 caught Null Pointer Exception and rethrow as e");
			throw new Exception(e);
		}
	}
}
