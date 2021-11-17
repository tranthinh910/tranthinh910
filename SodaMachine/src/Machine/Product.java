package Machine;

public enum Product {
	COKE(1,10000), PEPSI(2,10000), SODA(3,20000), EMPTY(0,0);
	
	private int number;
	private int price;
	
	Product(int number, int price){
		this.number = number;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public static Product valueOf(int selectionNumber) {
		for(Product product: Product.values()) {
			if(selectionNumber == product.getNumber()) {
				return product;
			}
		}
		return EMPTY;
	}
}
