package a01563679;

public enum Level {
BEGINNER, //("Anfänger"),
NORMAL, //("Normal"),
ADVANCED, //("Fortgeschritten"),
PROFESSIONAL /*("Profi") */;
	
String mappedName ;
// constructor ( check for valid values !) + getter
public Level next () {
	return null;
	
// returns next level , last level if no further levels left ( hint : this.ordinal(), Level.values())
}
@Override
public String toString () {
	return mappedName;/* returns mappedName */}
}
