package Controller;

import Stock.Coin;

public class CoinTotal {
	public int tenthousandCoins;
	public int twentythousandCoins;
	public int fiftythousandCoins;
	public int onehundredthousandCoins;
	public int twohundredthousandCoins;
	
	public CoinTotal(int... enterCoins) {
        this.tenthousandCoins = enterCoins[0];
        this.twentythousandCoins = enterCoins[1];
        this.fiftythousandCoins = enterCoins[2];
        this.onehundredthousandCoins = enterCoins[3];
        this.twohundredthousandCoins = enterCoins[4];
    }
	
	public int getCoinTotal(){
		int total = 0;
		total = total+this.tenthousandCoins*Coin.TEN.getValue();
		total = total+this.twentythousandCoins*Coin.TWENTY.getValue();
		total = total+this.fiftythousandCoins*Coin.FIFTY.getValue();
		total = total+this.onehundredthousandCoins*Coin.ONE_HUNDRED.getValue();
		total = total+this.twohundredthousandCoins*Coin.TWO_HUNDRED.getValue();
		return total;
	}
	
}
