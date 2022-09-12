package Com.bhavna.task2;

public class PayBack extends CardDetails {
	protected int piontearn;
	protected int totalamount;
	public PayBack( String holderName,String cardNumber, String expiryDate,int piontearn, int totalamount) {
		super();
		this.piontearn = piontearn;
		this.totalamount = totalamount;
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	protected int getPiontearn() {
		return piontearn;
	}
	protected void setPiontearn(int piontearn) {
		this.piontearn = piontearn;
	}
	protected int getTotalamount() {
		return totalamount;
	}
	protected void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	
	public void display() {
		System.out.println("Holder Name\t|Card Number\t\t|Expiry Date\t|Total Amount\t|Point earn ");
		System.out.println(holderName +"\t\t|"+cardNumber+"\t|"+expiryDate+"\t \t|"+totalamount+"\t|"+piontearn);
		
	}
	

}
