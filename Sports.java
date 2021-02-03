package a01563679;

import java.math.BigDecimal;

public enum Sports {
	ARCHERY(1.0), BASKETBALL(1.0), CLIMBING(1.2), DIVING(1.8), FOOTBALL(1.0), GOLF(2.1), HANDBALL(1.0), HOCKEY(1.0),
	MOUNTAINBIKING(1.0), PARKOUR(1.0),;

	final private double factor;

	private Sports(double factor) {
		if (factor < 0) {
			throw new IllegalArgumentException("Factor is not available!");
		}
		this.factor = factor;
	}

	public BigDecimal getFeeFactor() {
		return BigDecimal.valueOf(factor);
		/* default : 1.0 */
	}

	public BigDecimal getFee(BigDecimal feePerSports) {
		return feePerSports.multiply(BigDecimal.valueOf(factor));
		// calculate fees depending on sport club ’s feePerSports *feeFactor
	}
}
