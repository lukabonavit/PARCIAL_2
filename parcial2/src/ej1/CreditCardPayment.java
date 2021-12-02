package ej1;

public class CreditCardPayment implements PaymentInterface {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int montoTotal) {
		System.out.println(montoTotal + "$ pago realizado mediante tarjeta de credito/debito.");
	}

}