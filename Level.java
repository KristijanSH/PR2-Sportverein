public enum Level {
BEGINNER ("Anfä nger ") ,
NORMAL (" Normal ") ,
ADVANCED (" Fortgeschritten ") ,
PROFESSIONAL (" Profi ") ;
String mappedName ;
// constructor ( check for valid values !) + getter
public Level next () {
// returns next level , last level if no further levels left ( hint :
this . ordinal () , Level . values ())
}
@Override
public String toString () {/* returns mappedName */}
}
