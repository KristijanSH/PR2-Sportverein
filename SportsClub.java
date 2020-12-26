public class SportsClub {
private String name ;
private BigDecimal feePerSports ;
private Set < Member > members = new LinkedHashSet < >() ;
private Map < Sports , Set < Trainer > > offeredSports = new LinkedHashMap
< >() ;
public SportsClub ( String name , BigDecimal feePerSports ) {
// throws IllegalArgumentException if name is null or empty
// throws IllegalArgumentException if feePerSports is null
// set member variables
}
public String getName () {/* return name */}
public BigDecimal getFeePerSports () {/* return feePerSports */}
public Set < Member > getMembers () {/* return _copy_ ( shallow ) of members
*/}
public Set < Sports > getSports () {/* return set of offered sports */}
public BigDecimal calculateMembershipFee ( Member member ) {
// throw IllegalArgumentException if member is no member of this
sports club
// get member ’s billable sports and filter the member ’s billable
sports according to this . offeredSports
// i.e. the sports club is only allowed to bill sports that are
offered
// based on the filtered sports list , return accumulated fees
using Sports . getFee ( BigDecimal ) method using this . feePerSports
}
public boolean registerSports ( Member member , Sports sports , Level
level ) {
// throw IllegalArgumentException if member is no member of this
sports club
// register a member for a sports course for a specific level :
// 1. check whether there is a trainer available for the given
sports that has an accreditation greater or equal to level
// 2. return false if there is no trainer available
// 3. let the member learn the sports using Member . learn (...) and
return true if he/she was successful to learn at the specified
level , false otherwise
}
public boolean addMember ( Member member ) {
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// add the trainer ’s accreditations to the sport club ’s
offeredSports map , adding the trainer to the Set ( value ) of the
map.
// return whether the member was added to the this . members set or
not
}

public boolean removeMember ( Member member ) {
// if the member is a Trainer ( check using ’ instanceof ’ keyword )
// - remove the trainer from the sport club ’s offeredSports -Map (
Values )
// - if the trainer was the only Trainer for a sports , remove the
key from the offeredSports
// return true if the member was successfully removed from this .
members
}
@Override
public String toString () {
// format : SportsClub [ name : %s, feePerSports : %s, offeredSports : %
s]
}
}
