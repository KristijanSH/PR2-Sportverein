package a01404526;

import java.util.Map;
import java.util.Set;

public class Trainer extends Member {
	private Map<Sports, Level> accreditations;

	
	public Trainer(String name, Map<Sports, Level> accreditations) {
		super(name, accreditations);
		this.accreditations = accreditations;
// delegate to super constructor (String , Map <Sports ,Level >)
// set this . accreditations to a _copy_ ( shallow ) of accreditations argument
	}

	public Map<Sports, Level> getAccreditations() {
		return this.accreditations;
		/*
		 * returns a _copy_ ( shallow ) of this . accreditations
		 */}

	@Override
	public Set<Sports> getBillableSports() {
		return null;
// get billable sports of super (i.e. shallow copy !) and remove all sports that are contained within accreditations ,
// i.e. trainers don ’t have to pay for the sports they are offering
// return billable sports for this trainer
	}

	@Override
	public String toString() {
		return super.toString() + "," + this.accreditations + ": %s";
// format : super ’s toString () + " , accreditations : %s"
	}
}