package Controller;

import Interface.CalculatorInterface;
import Interface.MachineControllerInterface;

public class MachineController implements MachineControllerInterface {
	
	private CalculatorInterface calculator = new Calculator();
	
	@Override
	public CoinTotal calculateChange(MachineRequest request) {
		int total = calculator.calculateTotal(request.enterCoins);
		int totalChange = total - request.product.getPrice();
		return calculator.calculateChange(totalChange);
	}

}
