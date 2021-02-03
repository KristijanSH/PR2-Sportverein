package a01563679;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Trainer extends Member {
	private Map<Sports, Level> accreditations;

	public Trainer(String name, Map<Sports, Level> accreditations) {
		super(name, accreditations);
		Map<Sports, Level> accredCpy = new HashMap<Sports, Level>(accreditations);
		this.accreditations = accredCpy;
// delegate to super constructor (String , Map <Sports ,Level >)
// set this . accreditations to a _copy_ ( shallow ) of accreditations argument
	}

	public Map<Sports, Level> getAccreditations() {
		Map<Sports, Level> accred = new HashMap<Sports, Level>(accreditations);
		// accred = this.accreditations;
		return accred;
		// returns a _copy_ ( shallow ) of this . accreditations
	}

	@Override
	public Set<Sports> getBillableSports() {
		Set<Sports> billableSports = new LinkedHashSet<>();
		billableSports = super.getBillableSports();
		Set<Sports> sportsSet = new LinkedHashSet<>();

		for (Sports sportsObject : billableSports) {
			if (!accreditations.containsKey(sportsObject)) {
				sportsSet.add(sportsObject);
			}
		}

		return sportsSet;
// get billable sports of super (i.e. shallow copy !) and remove all sports that are contained within accreditations ,
// i.e. trainers don ’t have to pay for the sports they are offering
// return billable sports for this trainer
	}

	@Override
	public String toString() {
//		if(accreditations.values().contains(Level.PROFESSIONAL)) {
//			return super.toString() + ", " + "accreditations: "  + this.accreditations.keySet()+ "**"+ this.accreditations.values() + "**";
//		} else {
		return super.toString() + ", " + "accreditations: " + this.accreditations;
//		}
	}
}
