package Machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MachineInterface machineInterface = new MachineView();
		
		machineInterface.displayProduct();
		
		String selectedProduct = scanner.nextLine();
		machineInterface.selectionProduct(Integer.parseInt(selectedProduct));
		
		machineInterface.displayEnterCoins();
		
		String userEnteredCoins = scanner.nextLine();
		int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
		machineInterface.enterCoin(enteredCoins);
		
		machineInterface.displayMessage();
		
	}

}
