package com.practical;

public class SpecialOrder extends Order {

	public SpecialOrder(String name, int orderid1, String loc) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		System.out.println("Ordere confirmed under special category");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("order closed under special category");
		
	}

	
	
	
	
}
