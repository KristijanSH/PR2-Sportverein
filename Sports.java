package a01404526;

import java.math.BigDecimal;


public enum Sports {
	ARCHERY(1), 
	BASKETBALL(1.2), 
	CLIMBING(1), 
	DIVING(1.8), 
	FOOTBALL(1), 
	GOLF(2.1), 
	HANDBALL(1), 
	HOCKEY(1), 
	MOUNTAINBIKING(1), 
	PARKOUR(1);
	
	final private double factor;

	private Sports(double factor) {
		if(factor < 0) {
				throw new IllegalArgumentException("Factor is not available!");
		}
		this.factor = factor;
	}

	public BigDecimal getFeeFactor()
	{
		return BigDecimal.valueOf(factor);
		/* default : 1.0 */
	}
	
	
	public BigDecimal getFee ( BigDecimal feePerSports ) 
	{
		return feePerSports.multiply(BigDecimal.valueOf(factor));
	// calculate fees depending on sport club ’s feePerSports *feeFactor
	}

	

	
}
