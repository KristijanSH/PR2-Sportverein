package a01404526;

public enum Level {
	
	BEGINNER ("Anfä nger "),
	NORMAL (" Normal "),
	ADVANCED (" Fortgeschritten "),
	PROFESSIONAL (" Profi ");
	String mappedName ;


	
	Level(String string) {
	}

	public String getMappedName() {
		return mappedName;
	}

	public void setMappedName(String mappedName) {
		this.mappedName = mappedName;
	}
	// constructor ( check for valid values !) + getter
	public Level next () {
		return null;
	// returns next level , last level if no further levels left ( hint : this . ordinal () , Level . values ())
	}
	
	
	
	@Override
	public String toString () {
		return mappedName;
		}


}
