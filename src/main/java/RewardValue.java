
public class RewardValue {

	private double cashValue;
	private int mileValue;
	public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

	public RewardValue(int mileValue) {
		this.cashValue = mileValue * MILES_TO_CASH_CONVERSION_RATE;
		
	}
	
	public RewardValue(double cashValue) {
		this.mileValue = (int) ((int)cashValue / MILES_TO_CASH_CONVERSION_RATE);
	}

	public int getMilesValue() {
		// TODO Auto-generated method stub
		return mileValue;
	}
	
	public Double getCashValue() {
		// TODO Auto-generated method stub
		return cashValue;
	}

}
