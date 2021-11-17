package Machine;

public class Calculator implements CalculatorInterface {
	
	@Override
	public int calculateTotal(CoinTotal enterCoins) {
        return enterCoins.getCoinTotal();
    }
	
	@Override
	public CoinTotal calculateChange(int returnBalance) {
		CoinTotal change = new CoinTotal(new int[5]);
		int remainingAmount = returnBalance;
		change.twohundredthousandCoins = remainingAmount / Coin.TWO_HUNDRED.getValue();
        remainingAmount = remainingAmount % Coin.TWO_HUNDRED.getValue();
        
        change.onehundredthousandCoins = remainingAmount / Coin.ONE_HUNDRED.getValue();
        remainingAmount = remainingAmount % Coin.ONE_HUNDRED.getValue();
        
        change.fiftythousandCoins = remainingAmount / Coin.FIFTY.getValue();
        remainingAmount = remainingAmount % Coin.FIFTY.getValue();
        
        change.twentythousandCoins = remainingAmount / Coin.TWENTY.getValue();
        remainingAmount = remainingAmount % Coin.TWENTY.getValue();
        
        change.tenthousandCoins = remainingAmount / Coin.TEN.getValue();
        return change;
	}
}
