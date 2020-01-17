package com.aerospace;

public class AerospaceApplication {
	public static void main(String[] args) {
		try {
		//findmissile();
		throw  new AerospaceException("Missile Not Found");
		}
		catch(AerospaceException exception)
		{
			
			System.out.println(exception.getMessage());
		}
	}

	private static void findmissile() {
	//AerospaceException aerospace = new AerospaceException("Missile Not Found");
		throw  new AerospaceException("Missile Not Found");
	}

}
