package com.practical;

public class Customer {
	String name;
	int cid;
	String Location;
	
	public void sendOrder()
	{
		System.out.println("order details send");
	}
	public void recieveOrder()
	{
		System.out.println("order details Received");
	}
	public Customer(String name, int cid, String location) {
		super();
		this.name = name;
		this.cid = cid;
		Location = location;
	}
}
