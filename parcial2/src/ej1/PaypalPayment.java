package ej1;

public class PaypalPayment implements PaymentInterface {

	private String emailId;
	private String password;

	public PaypalPayment(String email, String password) {
		this.emailId = email;
		this.password = password;
	}

	@Override
	public void pay(int montoTotal) {
		System.out.println(montoTotal + "$ pago realizado mediante Paypal.");
	}

}