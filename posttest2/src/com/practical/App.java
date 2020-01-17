package com.practical;

import java.util.HashSet;
import java.util.Set;

public class App {
	
	static Set customer = new HashSet();
	
	public static void main(String[] args) {
		
		int orderid1=1234;
		String name="kanha";
		String loc="hyd";
		
		Order orderobj = new SpecialOrder(name,orderid1,loc);
		
		try {
			
			Order orderobj1 = new SpecialOrder("hero",789,"bbio");
			System.out.println("inside try block");
			addCustomer(orderobj1);
			searchCustomer(orderobj1);
			updateCustomer(orderobj1);
			deleteCustomer(orderobj1);
		}
		
		catch(Exception e){
			System.out.println("exception caught");
			
		}
		
	}
	
	 public static void addCustomer(Order orderobj1) {
		customer.add(orderobj1);
		System.out.println("added succesfully");
	}
	 
	 public static void searchCustomer(Order orderobj1) {
			if(customer.contains(orderobj1))
			System.out.println("details found");
			else
				System.out.println("not found");
			
		}
	 public static void updateCustomer(Order orderobj1) {
			customer.add(orderobj1);
			System.out.println("updated succesfully");
		}
		 
	public static void deleteCustomer(Order orderobj1) {
		
		if(customer.contains(orderobj1)){
			customer.remove(orderobj1);
			System.out.println("deleted");
		}
		else
			System.out.println("not found");
	}

}
