package flight;

import java.util.ArrayList;

public class App {
	public static void main(String args[]) {
		calling();
		listone();
		
		arraylistmethod();
		
		
	}// main

	private static void arraylistmethod() {
		Flight f1 = new Flight(25,"hyd",4567.0f, "bbi", "25/03/2020");
		Flight f2 = new Flight(25,"bbi",4567.0f, "hyd", "25/03/2020");
		ArrayList flightlist = new ArrayList();
		flightlist.add(f1);
		flightlist.add(f2);
		System.out.println(flightlist);
	}

	private static void listone() {
		Flight[]  fli= new Flight[2];
		fli[0] = new Flight(25,"del",4567.0f, "hyd", "25/03/2020");
		fli[1] = new Flight(25,"hyd",9080.0f, "ny", "25/03/2020");
	for(Flight fi :fli)
		{
			System.out.println(fi);
	}
	}

	private static void calling() {
		Flight f = new Flight();
		//f.accepttDetails();
		f.DisplayDetails();
		
		System.out.println("+++++++++++++++++++++++");
		Flight f1 = new Flight(25,"del",4567.0f, "hyd", "25/03/2020");
		System.out.println(f1);
	}

	
}// class
