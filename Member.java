package a01563679;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Member implements Comparable<Member> {
	private String name;
	private Map<Sports, Level> sports = new LinkedHashMap<>();

	public Member(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name is empty or null !");
		}
		this.name = name;
	}

	public Member(String name, Map<Sports, Level> sportsLevelMap) {

		if (sportsLevelMap == null || sportsLevelMap.isEmpty()) {
			throw new IllegalArgumentException("sportsLevelMap is empty");
		}

		for (Map.Entry<Sports, Level> entry : sportsLevelMap.entrySet()) {
			if (entry.getValue() == null || entry.getKey() == null) {
				throw new IllegalArgumentException("sportsLevelMap is empty");
			}
		}

		this.name = name;
		this.sports.putAll(sportsLevelMap);

// delegate to this constructor ( String )
// throws IllegalArgumentException if sportsLevelMap is null , empty or contains null - values .
// set this . sports to a _copy_ ( shallow ) of sportsLevelMap
	}

	public String getName() {
		return name;
	}

	public Map<Sports, Level> getSports() {
		Map<Sports, Level> sportsCopy = new LinkedHashMap<>();

		for (Sports tmpSports : sports.keySet()) {
			sportsCopy.put(tmpSports, sports.get(tmpSports));
		}
		return sportsCopy;

		// return a _copy_ ( shallow ) of sports
	}

	public Set<Sports> getBillableSports() {
		Set<Sports> billableSports = new LinkedHashSet<>();

		for (Sports tmpSports : getSports().keySet()) {
			billableSports.add(tmpSports);
		}
		return billableSports;
		/* return set of all sports */
	}

	public Level learn(Sports newSports, Level newLevel) {
		
		Level currentLvl = this.sports.get(newSports);

		if (newSports == null || newLevel == null) {
			throw new IllegalArgumentException();
		}
		if (!this.sports.containsKey(newSports)) {
			this.sports.put(newSports, Level.BEGINNER);
			return Level.BEGINNER;
		}

		Level nextLvl = currentLvl.next();

		while (true) {
			if (nextLvl == newLevel) {
				this.sports.replace(newSports, currentLvl.next());
				return currentLvl.next();
			}
			if (nextLvl == Level.PROFESSIONAL) {
				this.sports.replace(newSports, currentLvl);
				return currentLvl;
			}

			nextLvl = nextLvl.next();
		}

/*		
		if(newSports == null || newLevel == null) throw new IllegalArgumentException();

		if(!this.sports.containsKey(newSports)){
			this.sports.put(newSports, Level.BEGINNER);
			return Level.BEGINNER;

		}

		Level currentLevel = this.sports.get(newSports);
		Level help = currentLevel.next();

		while(true){
			if(help == newLevel){
				this.sports.put(newSports, currentLevel.next());

				return currentLevel.next();
			}

			if(help == Level.PROFESSIONAL){
				this.sports.put(newSports, currentLevel);

					return currentLevel;
			}

				help = help.next();

		}
*/
// get the member s currentLevel of newSports within this.sports
// 1) if there is no currentLevel (i.e. null ) ( meaning the Member hasn t practised the sports yet )
//, put ( newSports , Level .BEGINNER ) to this . sports Map and return Level . BEGINNER
// 2) if the difference between newLevel and currentLevel isgreater than or equal to 1 ( meaning the Member tries a)
//to learn the sports way above his/her skills or b) the correctnext level ) put ( newSports , currentLevel . next ()) to this . sportsMap and return the inserted level
// 3) otherwise return the currentLevel

	}

	@Override
	public String toString() {
		return "name: " + this.name + ", " + " sports: " + this.sports;
		
	}	

	@Override
	public int compareTo(Member member) {
		int compareTo = this.getName().compareTo(member.getName());
		return compareTo;

		// compare names ( case sensitive )
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


}
