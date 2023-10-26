package tns;

public abstract class NormalAcc extends ShopAcc {
	private final float deliverycharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges);
		this.deliverycharges = deliverycharges;
		}
	
	@Override
	public void bookproduct(float charges) {
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + "]"+ super.toString();
	}

	public static void main(String[] args) {
		System.out.println("output");
	}

	public float getDeliverycharges() {
		return deliverycharges;
	}

}
