package Machine;

public class MachineRequest {
	public Product product;
	public CoinTotal enterCoins;
	
	public MachineRequest(int seletedProduct,int...enterCoins) {
		this.product = Product.valueOf(seletedProduct);
		this.enterCoins = new CoinTotal(enterCoins);
	}
}
