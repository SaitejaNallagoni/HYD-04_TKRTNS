package tns;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	private static final float deliverycharges = 0;
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	@Override
	public void bookproduct(float charges) {
		
	}
	


	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]" + super.toString();
	}


	public static void main(String[] args) {
	System.out.println("output");
	}

	public static float getDeliverycharges() {
		return deliverycharges;
	}




}
