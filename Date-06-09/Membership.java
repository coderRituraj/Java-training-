package Com.bhavna.task2;

public class Membership extends CardDetails {
	private int rating ;

	public Membership(String holderName,String cardNumber, String expiryDate,int rating) {
		super();
		this.rating = rating;
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	protected int getRating() {
		return rating;
	}

	protected void setRating(int rating) {
		this.rating = rating;
	}
	public void display() {
		System.out.println("Holder Name\t| Card Number \t\t| Expiry Date\t| Rating  ");
		System.out.println(this.holderName +"\t\t|"+this.cardNumber+"\t|"+this.expiryDate+"\t\t|"+this.rating);
	}
	
	}
	
	
