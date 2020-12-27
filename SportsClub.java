package a01404526;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SportsClub {
	private String name;
	private BigDecimal feePerSports;
	private Set<Member> members = new LinkedHashSet<>();
	private Map<Sports, Set<Trainer>> offeredSports = new LinkedHashMap<>();

	public SportsClub(String name, BigDecimal feePerSports) {
		
		if(name.isEmpty() || name == null) {
			throw new IllegalArgumentException ("Name is empty or null");
		}
		if(feePerSports == null) {
			throw new IllegalArgumentException ("feePerSports is empty or null");
		}
		
		this.name = name;
		this.feePerSports = feePerSports;
		
// throws IllegalArgumentException if name is null or empty
// throws IllegalArgumentException if feePerSports is null
// set member variables
	}

	public String getName() {
		return name;
		/* return name */}

	public BigDecimal getFeePerSports() {
		return feePerSports;
		/* return feePerSports */}

	public Set<Member> getMembers() {
		return members;
		/*
		 * return _copy_ ( shallow ) of members
		 */}

	public Set<Sports> getSports() {
		Set<Sports> sportsSet = offeredSports.keySet();
		return sportsSet;
		/* return set of offered sports */}

public BigDecimal calculateMembershipFee ( Member member ) {
	return feePerSports;
// throw IllegalArgumentException if member is no member of thissports club
// get member ’s billable sports and filter the member ’s billablesports according to this . offeredSports
// i.e. the sports club is only allowed to bill sports that areoffered
// based on the filtered sports list , return accumulated feesusing Sports . getFee ( BigDecimal ) method using this . feePerSports
}

public boolean registerSports ( Member member , Sports sports , Level
level ) {
	return false;
// throw IllegalArgumentException if member is no member of this sports club
// register a member for a sports course for a specific level :
// 1. check whether there is a trainer available for the givensports that has an accreditation greater or equal to level
// 2. return false if there is no trainer available
// 3. let the member learn the sports using Member . learn (...) andreturn true if he/she was successful to learn at the specifiedlevel , false otherwise
}

public boolean addMember ( Member member ) {
	return false;
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// add the trainer ’s accreditations to the sport club ’sofferedSports map , adding the trainer to the Set ( value ) of themap.
// return whether the member was added to the this . members set ornot
}

public boolean removeMember ( Member member ) {
	return false;
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// - remove the trainer from the sport club ’s offeredSports -Map (Values )
// - if the trainer was the only Trainer for a sports , remove thekey from the offeredSports
// return true if the member was successfully removed from this .members
}

@Override
public String toString () {
	return name;
// format : SportsClub [ name : %s, feePerSports : %s, offeredSports : %s]
}
}
