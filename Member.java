package a01404526;

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

	public Member(String name, Map<Sports, Level> sportsLevelMap) {
		this.name = name;  //tu preuzima ovaj name iz ovog konstruktura a trebao bi iz konstruktora na liniji 11 ??!?!?
		this.sports = sportsLevelMap;
		
		if(sportsLevelMap.isEmpty()) {
			throw new IllegalArgumentException("sportsLevelMap is empty");
		}	
// delegate to this constructor ( String )
// throws IllegalArgumentException if sportsLevelMap is null , emptyor contains null - values .
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
		return null;/* return set of all sports */
	}

	public Level learn(Sports newSports, Level newLevel) {
		return newLevel;
// get the member ’s currentLevel of newSports within this . sports
// 1) if there is no currentLevel (i.e. null ) ( meaning the Member hasn ’t practised the sports yet )
//, put ( newSports , Level .BEGINNER ) to this . sports Map and return Level . BEGINNER
// 2) if the difference between newLevel and currentLevel isgreater than or equal to 1 ( meaning the Member tries a)
//to learn the sports way above his/her skills or b) the correctnext level ) put ( newSports , currentLevel . next ()) to this . sportsMap and return the inserted level
// 3) otherwise return the currentLevel
	}

	@Override
	public String toString() {

		//return name;
		return this.name + ": %s, " + this.sports + ": %s";
// format : " name : %s, sports : %s"
	}

	@Override
	public int compareTo(Member member) {

		int compareTo = this.getName().compareTo(member.getName());
		return compareTo;
		
		//System.out.println(compareTo);
		
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
