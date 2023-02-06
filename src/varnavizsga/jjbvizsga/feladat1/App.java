package varnavizsga.jjbvizsga.feladat1;

public class App {

	public static void main(String[] args) {
		
		ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
		Billing billingObj = readBillingData.getBillingdataObj();
		GenerateBillingData GenerateBillingDataObj = new GenerateBillingData();
		System.out.println(billingObj.toString());

	}

}
