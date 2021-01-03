package a01563679;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Member implements Comparable<Member> {
	private String name;
	private Map<Sports, Level> sports = new LinkedHashMap<>();

	public Member(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name is empty or null !");
		}

		this.name = name;
	}

//	@SuppressWarnings("unlikely-arg-type")
	public Member(String name, Map<Sports, Level> sportsLevelMap) {
		
		if (sportsLevelMap == null  || sportsLevelMap.isEmpty()) {
			throw new IllegalArgumentException("sportsLevelMap is empty");
		}
		
		for(Map.Entry<Sports, Level> entry : sportsLevelMap.entrySet()) {
			if (entry.getValue() == null || entry.getKey() == null) {
			throw new IllegalArgumentException("sportsLevelMap is empty");
		}
		}
//		if (!sportsLevelMap.containsKey(sports) /*containsValue(null)*/) {
//			throw new IllegalArgumentException("sportsLevelMap is empty");
//		}

		this.name = name;
		this.sports = sportsLevelMap;
// delegate to this constructor ( String )
// throws IllegalArgumentException if sportsLevelMap is null , empty or contains null - values .
// set this . sports to a _copy_ ( shallow ) of sportsLevelMap
	}

	public String getName() {
		return name;
		/* ... */}

	public Map<Sports, Level> getSports() {
		return sports;
		/*
		 * return a _copy_ ( shallow ) of sports
		 */}

	public Set<Sports> getBillableSports() {

		Set<Sports> billableSports = new HashSet<>();

		for (Sports allSports : getSports().keySet()) {
			billableSports.add(allSports);
		}
		return billableSports;
		/* return set of all sports */
	}

	public Level learn(Sports newSports, Level newLevel) {

		/*if (newLevel.getMappedName().equals(null)) {
			//newLevel.setMappedName("Anfnger");
			this.sports.put(newSports, newLevel);
		}
		
		 */
		
//		Level result = this.sports.get(newSports);
//		if (result != null){
//			this.sports.replace(newSports, Level.BEGINNER);
//			return Level.BEGINNER;
//		}
//		else if(!(result.compareTo(newLevel) >= 1)){
//			this.sports.replace(newSports,newLevel);
//			return newLevel;
//		}
//		return newLevel;
		
		if(newSports == null || newLevel == null) {
			throw new IllegalArgumentException();
		}
		
		if(!this.sports.containsKey(newSports)) {
			this.sports.put(newSports, Level.BEGINNER);
			return Level.BEGINNER;
		}
//		
//		if (newLevel.getMappedName().equals(null)) {
//			newLevel.setMappedName("Anfnger");
//			this.sports.put(newSports, newLevel);
//		}
		
		Level currentLvl = this.sports.get(newSports);
		Level nextLvl = currentLvl.next();
		
		while (true) {
			if (nextLvl == newLevel) {
				this.sports.put(newSports, currentLvl.next());
				return currentLvl.next();
			}
			if (nextLvl == Level.PROFESSIONAL) {
				this.sports.put(newSports, currentLvl);
				return currentLvl;
			}
			
				nextLvl = nextLvl.next();
		}
		
// get the member s currentLevel of newSports within this.sports
// 1) if there is no currentLevel (i.e. null ) ( meaning the Member hasn t practised the sports yet )
//, put ( newSports , Level .BEGINNER ) to this . sports Map and return Level . BEGINNER
// 2) if the difference between newLevel and currentLevel isgreater than or equal to 1 ( meaning the Member tries a)
//to learn the sports way above his/her skills or b) the correctnext level ) put ( newSports , currentLevel . next ()) to this . sportsMap and return the inserted level
// 3) otherwise return the currentLevel

	}

	@Override
	public String toString() {

		return " name: " + this.name + ", " + " sports: " + this.sports;
// format : " name : %s, sports : %s"
	}

	@Override
	public int compareTo(Member member) {

		int compareTo = this.getName().compareTo(member.getName());
		return compareTo;

		// System.out.println(compareTo);

		// return compareTo(this.getName(), member.getName());
		/*
		 * compare names ( case sensitive )
		 */}

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
