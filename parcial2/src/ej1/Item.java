package ej1;

public class Item {

	private int id;
	private String upcCode;
	private int price;

	public Item(int id, String upc, int cost) {
		this.id = id;
		this.upcCode = upc;
		this.price = cost;
	}

	public int getId() {
		return id;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public int getPrice() {
		return price;
	}

}