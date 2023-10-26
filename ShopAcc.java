package tns;

public abstract class ShopAcc {
	private int accNo ;
	private String accNm ;
	private float charges ;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public abstract void bookproduct(float charges);
	
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
		
	}
	
	public static void main(String[] args) {
		System.out.println("output");
	}

}
