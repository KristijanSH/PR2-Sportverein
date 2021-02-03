package a01563679;

public enum Level {
/*
    BEGINNER("Anfaenger"),
    NORMAL("Normal"),
    ADVANCED("Fortgeschritten"),
    PROFESSIONAL("Profi"){
            public String toString() {
                    return "*"+super.toString()+"*";
            }
    };
*/
	BEGINNER("Anfänger"), NORMAL("Normal"), ADVANCED("Fortgeschritten"), PROFESSIONAL("Profi");

    String m;
   // private static int c = 0;

    private Level(String s) {
            m = s;
    }

    public Level next() {
            return Level.values().length-1 != this.ordinal()?Level.values()[this.ordinal()+1]:this;
    }
    /*
    public String toString() {
            return m +"("+ ++c +")";
    }
    */
    @Override
	public String toString() {
		return m;
	}
}