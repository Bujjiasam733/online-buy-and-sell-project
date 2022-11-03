package com.example.payment;

public class Payment {

	private int PaymentId;
	private double Amount;
	public Payment() {
		
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, double amount) {
		super();
		PaymentId = paymentId;
		Amount = amount;
	}
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
}
