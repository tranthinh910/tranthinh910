package Interface;

import Controller.CoinTotal;

public interface CalculatorInterface {
	int calculateTotal(CoinTotal enterCoins);
	CoinTotal calculateChange(int enterByUserCoins);
}
