package a01563679;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SportsClub {
	private String name;
	private BigDecimal feePerSports;
	private Set<Member> members = new LinkedHashSet<>();
	private Map<Sports, Set<Trainer>> offeredSports = new LinkedHashMap<>();

	public SportsClub(String name, BigDecimal feePerSports) {

		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name is empty or null");
		}
		if (feePerSports == null) {
			throw new IllegalArgumentException("feePerSports is empty or null");
		}

		this.name = name;
		this.feePerSports = feePerSports;

// throws IllegalArgumentException if name is null or empty
// throws IllegalArgumentException if feePerSports is null
// set member variables
	}

	public String getName() {
		return name;
	}

	public BigDecimal getFeePerSports() {
		return feePerSports;
	}

	public Set<Member> getMembers() {
		Set<Member> membersSet = new HashSet<Member>(members);
		return membersSet;
		// return _copy_ ( shallow ) of members
	}

	public Set<Sports> getSports() {
		Set<Sports> sportsSet = offeredSports.keySet();
		return sportsSet;
	}

	public BigDecimal calculateMembershipFee(Member member) {
		if (!this.members.contains(member))
			throw new IllegalArgumentException("member nema membera");

		Set<Sports> billableSports = new HashSet<>();
		billableSports = member.getBillableSports();
		Set<Sports> sportsSet = new HashSet<>();
		BigDecimal fee = new BigDecimal("0");

		for (Sports sports : billableSports) {
			if (offeredSports.keySet().equals(billableSports)) {
				sportsSet.add(sports);
			}
		}

		for (Sports sports2 : sportsSet) {
			fee = fee.add(sports2.getFee(feePerSports));
		}

		return fee;
		// throw IllegalArgumentException if member is no member of thissports club
		// get member ’s billable sports and filter the member ’s billablesports
		// according to this . offeredSports
		// i.e. the sports club is only allowed to bill sports that are offered
		// based on the filtered sports list , return accumulated fee susing Sports .
		// getFee ( BigDecimal ) method using this . feePerSports
	}

	public boolean registerSports(Member member, Sports sports, Level level) {

		if(!members.contains(member))
            throw new IllegalArgumentException("Kein Member");
		Set<Trainer> trainers = new LinkedHashSet<>();
		trainers = offeredSports.get(sports);
		if (trainers == null || trainers.isEmpty()) {
			return false;
		}
		Level oldLevel = null; //  member.getSports().values();
		for(Entry<Sports,Level> entry : member.getSports().entrySet()) {
			oldLevel = entry.getValue();
		}
		boolean result = false;
		for (Trainer helper : trainers) {
			Level trainerLevel = helper.getAccreditations().get(sports);
			if (trainerLevel.ordinal() >= level.ordinal()) {
				member.learn(sports, level);
			}	
				for (Sports tmpSports : member.getSports().keySet()) {
					if (tmpSports.equals(sports)) {
						for (Level tmpLevel : member.getSports().values()) {
							//tu je najveca greska: usporedujemo trenutni level sa memberovim levelom,
							//a prije toga pozvali learn() i nikad nece moc vratit true
							//jer nam je logika da vrati true ako je promjenio level na gore
							//zato usporedujem tmp lvl i stari level, da vidim jel se level promjenio
							//iako bi najbolja provjera bila sa ordinal da vidimo jel isao na gore
							//jer ako je level otisao na dolje, kod nas ce opet vratit true, 
							//a to nas moze zajebat na testu OPET
							if (tmpLevel.ordinal() == oldLevel.ordinal()) {
								result = false;
								break;
							} else
								result = true;
							break;
						}
					}
				}
		}
		
		return result;

		


		/*
	if(!this.members.contains(member)) throw new IllegalArgumentException("sisaj ga majmuine");
	boolean ret = false;
	Set<Trainer> trainers = this.offeredSports.get(sports);
	if(trainers == null || trainers.isEmpty()) return false;
	
	for(Trainer tr : trainers) {
		Level lev = tr.getAccreditations().get(sports);
		
		if(lev.ordinal() >= level.ordinal()) {
			Level x = member.learn(sports, level);
			
			if(x.equals(level)) ret = true;
		}
	}
	return ret;
	
	*/
// throw IllegalArgumentException if member is no member of this sports club
// register a member for a sports course for a specific level :
// 1. check whether there is a trainer available for the given sports that has an accreditation greater or equal to level
// 2. return false if there is no trainer available
// 3. let the member learn the sports using Member . learn (...) and return true if he/she was successful to learn at the specified level , false otherwise
	}

	public boolean addMember(Member member) {
		boolean added = false;

		Set<Trainer> trainersSet = new LinkedHashSet<>();
		Map<Sports, Level> trainersAccMap = new LinkedHashMap<>();
		Set<Trainer> tmpTrainersSet = new LinkedHashSet<>();
		List<Sports> sportsList = new ArrayList<>();

		if (members.contains(member)) {
			return false;
		}
		if (member instanceof Trainer) {
			trainersSet.add((Trainer) member);
			trainersAccMap = ((Trainer) member).getAccreditations();
			members.add(member);

			for (Sports tmpSports : trainersAccMap.keySet()) {
				sportsList.add(tmpSports);
			}

			for (Sports sportsObject : sportsList) {		
				if (!offeredSports.keySet().contains(sportsObject)) {
				tmpTrainersSet.add((Trainer) member);
				offeredSports.put(sportsObject, tmpTrainersSet);
				}
			}
			added = true;
		} else {
			this.members.add(member);
			added = true;
		}

		return added;

// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// add the trainer ’s accreditations to the sport club’s offeredSports map , adding the trainer to the Set ( value ) of the map.
// return whether the member was added to the this . members set or not
	}
/*
	public boolean removeMember(Member member) {
		boolean removed = false;
		Set<Trainer> trainerSet = new LinkedHashSet<>();
		Set<Trainer> trainerSetCpy = new LinkedHashSet<>();
		Set<Sports> trainerSports = ((Trainer) member).getAccreditations().keySet();
		if (!members.contains(member)) {
			return false;
		}

		if (member instanceof Trainer) {
//			for(Entry<Sports, Set<Trainer>> ewhat : offeredSports.entrySet()) {
//				
//			}
			for(Sports s : trainerSports) {
				if(offeredSports.get(s).contains((Trainer) member)) {
					offeredSports.get(s).remove((Trainer) member);
				}
				if (offeredSports.get(s).isEmpty()) {
					offeredSports.remove(s);
				}
			}
		}
		return members.remove(member);
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// - remove the trainer from the sport club ’s offeredSports -Map (Values )
// - if the trainer was the only Trainer for a sports , remove the key from the offeredSports
// return true if the member was successfully removed from this .members
	}
*/
	public boolean removeMember (Member member) {
        if (member instanceof Trainer) {
            
               Map<Sports, Level> accreditations = ((Trainer) member).getAccreditations();
               for (Map.Entry<Sports,Level> entry : accreditations.entrySet()) {  
                   this.offeredSports.get(entry.getKey()).remove(member);
   
                   if (this.offeredSports.get(entry.getKey()).isEmpty())
                   {
                       this.offeredSports.remove(entry.getKey());
                   }
               } 
        }
        return members.remove(member);
    }
	
	
//	public boolean removeMember(Member member) {
//	    if(member instanceof Trainer) {
//	    Set<Sports> setSports = ((Trainer) member).getAccreditations().keySet();
//	            
//	    for(Sports s: setSports) {
//	      if(offeredSports.get(s).contains((Trainer) member)) {
//	        offeredSports.get(s).remove((Trainer) member);
//	      }  
//	        if(offeredSports.get(s).isEmpty()) {
//	          offeredSports.remove(s);
//	        }
//	      }        
//	    }
//	    return members.remove(member);
//	  }	
	
	@Override
	public String toString() {
		return "SportsClub [name: " + this.name + ", feePerSports: " + feePerSports + ", offeredSports: "
				+ offeredSports + "]";
	}
}
