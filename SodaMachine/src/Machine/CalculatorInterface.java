package Machine;

public interface CalculatorInterface {
	int calculateTotal(CoinTotal enterCoins);
	CoinTotal calculateChange(int enterByUserCoins);
}
