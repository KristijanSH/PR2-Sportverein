package a01563679;

public enum Level {

	BEGINNER("Anfänger"), NORMAL("Normal"), ADVANCED("Fortgeschritten"), PROFESSIONAL("Profi");

	String mappedName;

	private Level(String name) {
		if (name.equals("Anfänger") || name.equals("Normal") || name.equals("Fortgeschritten")
				|| name.equals("Profi")) {
			this.mappedName = name;
		}
	}

	public String getMappedName() {
		return mappedName;
	}

	public void setMappedName(String mappedName) {
		this.mappedName = mappedName;
	}
	// constructor ( check for valid values !) + getter

	public Level next() {

		for (Level nextLevel : Level.values()) {

			if (nextLevel.equals(BEGINNER)) {
				return nextLevel.next();
			}
			if (nextLevel.equals(NORMAL)) {
				return nextLevel.next();
			}
			if (nextLevel.equals(ADVANCED)) {
				return nextLevel.next();
			}
			if (nextLevel.equals(PROFESSIONAL)) {
				return nextLevel;
			}
		}
		return null;

		// returns next level , last level if no further levels left ( hint : this .
		// ordinal () , Level . values ())
	}

	@Override
	public String toString() {
		return mappedName;
	}

}