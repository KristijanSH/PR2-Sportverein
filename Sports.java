package a01563679;

import java.math.*;

public enum Sports {
ARCHERY,
BASKETBALL,
CLIMBING {
	//due to additional insurance fees , getFeeFactor () returns 1.2

},
DIVING {
	// due to renting equipment and insurance , getFeeFactor () returns 1.8
	} ,
	FOOTBALL ,
	GOLF {
	// due to additional fees for the golf course , getFeeFactor () returns 2.1
	} ,
	HANDBALL ,
	HOCKEY ,
	MOUNTAINBIKING ,
	PARKOUR ;
	public BigDecimal getFeeFactor () {
		return null;/* default : 1.0 */}
	public BigDecimal getFee ( BigDecimal feePerSports ) {
		return feePerSports;
	// calculate fees depending on sport club ’s feePerSports * feeFactor
	}




}
