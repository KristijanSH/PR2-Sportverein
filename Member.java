public class Member implements Comparable < Member > {
private String name ;
private Map < Sports , Level > sports = new LinkedHashMap < >() ;
public Member ( String name ) {
// throws IllegalArgumentException if name is null or empty
// set this . name
}
public Member ( String name , Map < Sports , Level > sportsLevelMap ) {
// delegate to this constructor ( String )
// throws IllegalArgumentException if sportsLevelMap is null , empty
or contains null - values .
// set this . sports to a _copy_ ( shallow ) of sportsLevelMap
}
public String getName () {/* ... */}
public Map < Sports , Level > getSports () {/* return a _copy_ ( shallow ) of
sports */}
public Set < Sports > getBillableSports () {/* return set of all sports */
}
public Level learn ( Sports newSports , Level newLevel ) {
// get the member ’s currentLevel of newSports within this . sports
// 1) if there is no currentLevel (i.e. null ) ( meaning the Member
hasn ’t practised the sports yet ), put ( newSports , Level .
BEGINNER ) to this . sports Map and return Level . BEGINNER
// 2) if the difference between newLevel and currentLevel is
greater than or equal to 1 ( meaning the Member tries a) to
learn the sports way above his/her skills or b) the correct
next level ) put ( newSports , currentLevel . next ()) to this . sports
Map and return the inserted level
// 3) otherwise return the currentLevel
}

@Override
public String toString () {
// format : " name : %s, sports : %s"
}
@Override
public int compareTo ( Member member ) {/* compare names ( case sensitive )
*/}
@Override
public boolean equals ( Object obj ) {/* true if names are equal ( case
sensitive ) */}
@Override
public int hashCode () {/* return hashCode of name ( case sensitive ) */}
}
