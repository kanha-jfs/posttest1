package practise;

public class FlightApp  {

	public static void main(String args[])
	{
		GooglePay googlepay = new GooglePayImpl();
		googlepay.googlepayupi();
		
		paytm pay1 = new PaytmImpl();
		pay1.paytmupi();
	}
}
