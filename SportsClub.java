package a01563679;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SportsClub {
	private String name;
	private BigDecimal feePerSports;
	private Set<Member> members = new LinkedHashSet<>();
	private Map<Sports, Set<Trainer>> offeredSports = new LinkedHashMap<>();


	public SportsClub(String name, BigDecimal feePerSports) {
		
		if(name == null || name.isEmpty()) {
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
/*
public BigDecimal calculateMembershipFee ( Member member ) {
	if(!this.members.contains(member))
		throw new IllegalArgumentException("member nema membera");
	
	Set<Sports> billableSports = member.getBillableSports();
	Set<Sports> nesto = null;
	
	for (Sports sports : billableSports) {
		if(billableSports.contains(this.offeredSports)) {
			nesto.add(sports);
		}
	}
	
	for (Sports sports2 : nesto) {
		sports2.getFee();
	}
	
	return feePerSports;
// throw IllegalArgumentException if member is no member of thissports club
	
// get member ’s billable sports and filter the member ’s billablesports according to this . offeredSports
// i.e. the sports club is only allowed to bill sports that are offered
	
// based on the filtered sports list , return accumulated fee susing Sports . getFee ( BigDecimal ) method using this . feePerSports
}
*/
	@SuppressWarnings("null")
	public BigDecimal calculateMembershipFee ( Member member ) {
		

		if(!this.members.contains(member))
			throw new IllegalArgumentException("member nema membera");
		
		Set<Sports> billableSports = member.getBillableSports();
		Set<Sports> nesto = null;
		BigDecimal fee = null;
		
		for (Sports sports : billableSports) {
			if(billableSports.contains(this.offeredSports)) {
				nesto.add(sports); //pogledaj da li ce ovo biti NULL kod testiranja 
			}
		}
		
		for (Sports sports2 : nesto) {
		//	fee = sports2.getFee(feePerSports);
			fee = fee.add(sports2.getFee(feePerSports));
			
		//return Sports.getFee(fee);
		}
		
		return fee;
	// throw IllegalArgumentException if member is no member of thissports club
		
	// get member ’s billable sports and filter the member ’s billablesports according to this . offeredSports
	// i.e. the sports club is only allowed to bill sports that are offered
		
	// based on the filtered sports list , return accumulated fee susing Sports . getFee ( BigDecimal ) method using this . feePerSports
	}
	
public boolean registerSports ( Member member , Sports sports , Level level ) {
	
	if(!this.members.contains(member))
		throw new IllegalArgumentException("member nema membera");
	
	Set<Trainer> trainers = new LinkedHashSet<>();
	
	trainers = this.offeredSports.get(sports);
	
	if(trainers==null || trainers.isEmpty()) {
		return false;
	}
	
		boolean result= false;
		for(Trainer helper :  trainers) {
			Level trainerLevel = helper.getAccreditations().get(sports);
			if(trainerLevel.ordinal() >= level.ordinal() ) {
				member.learn(sports, level);
				result = true;
				break;
			}
		}
		
		return result;
	
	
	
// throw IllegalArgumentException if member is no member of this sports club
// register a member for a sports course for a specific level :
// 1. check whether there is a trainer available for the given sports that has an accreditation greater or equal to level
// 2. return false if there is no trainer available
// 3. let the member learn the sports using Member . learn (...) and return true if he/she was successful to learn at the specified level , false otherwise
}

public boolean addMember ( Member member ) {
	boolean added = false;
	
	Set<Trainer> kurcina = new LinkedHashSet<>();
	Map<Sports, Level> pickica = new LinkedHashMap<>();
	Set<Trainer> klitoris = new LinkedHashSet<>();
	if(member instanceof Trainer) {
		
		kurcina.add((Trainer) member);
		pickica = ((Trainer) member).getAccreditations();
		
		List<Sports> sisa = new ArrayList<>();
		
		for(Sports key : pickica.keySet()) {
			sisa.add(key);
		}
		
		for(Sports key2 : sisa) {
			
			klitoris = offeredSports.get(key2);
			if(!klitoris.isEmpty()) {
				klitoris.add((Trainer) member);
				offeredSports.put(key2, klitoris);
			}			
		}

		added = true;
	}
	
	return added;
	
	

// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// add the trainer ’s accreditations to the sport club’s offeredSports map , adding the trainer to the Set ( value ) of the map.
// return whether the member was added to the this . members set or not

}

public boolean removeMember ( Member member ) {
	boolean removed = false;
	
//	if(member instanceof Trainer) {
//		
//		
//	}
	
	return removed;
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// - remove the trainer from the sport club ’s offeredSports -Map (Values )
// - if the trainer was the only Trainer for a sports , remove the key from the offeredSports
// return true if the member was successfully removed from this .members
}

@Override
public String toString () {
	return "SportsClub [" +this.name + ", feePerSports: " + feePerSports + ", offeredSports: " + offeredSports + "]";
}
}
