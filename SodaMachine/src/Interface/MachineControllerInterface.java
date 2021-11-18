package Interface;

import Controller.CoinTotal;
import Controller.MachineRequest;

public interface MachineControllerInterface {
	CoinTotal calculateChange(MachineRequest request);
}
