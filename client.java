package tns;

public class client {

	public static void main(String[] args) {
		ShopFactory factory = new GSShopFactory();
		
		PrimeAcc primeAcc = factory.getNewPrimeAccount(1, "saiteja", 10, true);
	    NormalAcc normalAcc = factory.getNewNormalAccount(2, "rahul", 20, 55);
	    PrimeAcc primeAcc1 = factory.getNewPrimeAccount(3, "sathwik", 50, false);
	    NormalAcc normalAcc1 = factory.getNewNormalAccount(4, "shiva", 100, 500);
	   
	    primeAcc.bookproduct(100);
	    normalAcc.bookproduct(100);
	    primeAcc1.bookproduct(100);
	    normalAcc1.bookproduct(100);
	   
	    System.out.println(primeAcc.toString());
		System.out.println(normalAcc.toString());

		System.out.println(primeAcc1.toString());
		System.out.println(normalAcc1.toString());

	}


}
