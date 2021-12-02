package ej1;

public class AppMain {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		Item teclado = new Item(1, "0001", 19);
		Item mouse = new Item(2, "0002", 10);
		Item mousePad = new Item(3, "0003", 5);

		cart.addItem(teclado);
		cart.addItem(mouse);
		cart.addItem(mousePad);

		// PAGO MEDIANTE PAYPAL

		cart.pay(new PaypalPayment("luka.bonavita@davinci.edu.ar", "1234"));

		// PAGO MEDIANTE TARJETA DE CREDITO

		cart.pay(new CreditCardPayment("Luka Bonavita", "4872 1723 9781 8732", "786", "06/25"));
	}

}
