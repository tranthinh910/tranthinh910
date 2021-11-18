package Machine;

import Controller.CoinTotal;
import Controller.MachineController;
import Controller.MachineRequest;
import Interface.MachineControllerInterface;
import Interface.MachineInterface;
import Stock.Product;

public class MachineView implements MachineInterface{
	private MachineControllerInterface controller = new MachineController();
	private int selectedProduct;
	private CoinTotal change;

	@Override
	public void displayProduct() {
		System.out.println("            Products available:               ");
        System.out.println("                                   ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
            	System.out.print(product.getNumber()+ " " + product.name() +":"+ product.getPrice());
            	System.out.println("               ");
            	
            }
        }
        System.out.println("               ");
        System.out.println(" Please select your product: ");
	}
	
	@Override
	public void selectionProduct(int product) {
		this.selectedProduct = product;
	}
	
	@Override
	public void displayEnterCoins() {
		System.out.println("Please enter coins as follows: 0,0,0,0,0 ");
		System.out.println("The amount of money transferred will be in order 10000 -> 200000");
		System.out.println("Example: If you would like to enter 40000 cents coins: 0,2,0,0,0");
		System.out.println("Plese enter coins:");
	}
	
	@Override
	public void enterCoin(int...coins) {
		try {
			MachineRequest request = new MachineRequest(selectedProduct, coins);
			change = controller.calculateChange(request);
		} catch (Exception e) {
  	      System.out.println("The amount you entered is not valid");
      }
	}
	
	@Override
	public void displayMessage() {
		try {
			System.out.println("                                              ");
			System.out.println(" Excess cash "+ " : "+ change.getCoinTotal() + " VND");
			System.out.println("    200000 VND : "+ change.twohundredthousandCoins);
			System.out.println("    100000 VND : "+ change.onehundredthousandCoins);
			System.out.println("    50000 VND : "+ change.fiftythousandCoins);
			System.out.println("    20000 VND : "+ change.twentythousandCoins);
			System.out.println("    10000 VND : "+ change.tenthousandCoins);
			
		} catch(Exception e) {
	  	      System.out.println("Your money is being refunded !!!");
		}
	}
	
}
