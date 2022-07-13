package donna;

/**
 * In de geldigheid van een planelement staat voor welke dagen van de week hij gepland is.
 *
 * Het gaat om de <strong>gehele</strong> week, <strong>niet alleen om de werkweek</strong>.
 */
public class BDGeldigheid {

	/**
	 * De constructor van BDGeldigheid accepteert een string van 7 lang met J of
	 * N.
	 * <ul>
	 * <li>De eerste J/N bepaalt of de maandag geldig is.
	 * <li>De tweede J/N bepaalt of de dinsdag geldig is
	 * <li>...
	 * </ul>
	 */
	public BDGeldigheid(String jnString) {
		// to implement
	}

	/**
	 * Is deze geldigheid geldig op de gegeven <tt>Weekdag</tt>?
	 */
	public boolean isGeldig(Weekdag weekdag) {
		// to implement
		return false;
	}

	/**
	 * Retourneert een <strong>nieuwe</strong> geldigheid die alleen geldig is op de weekdagen
	 * waar zowel this als geledigheid2 geldig is.
	 */
	public BDGeldigheid doorsnede(BDGeldigheid geldigheid2) {
		// to implement
		return null;
	}

	public String toJNstring() {
		// to implement
		return null;
	}

	/**
	 * Verschuift deze geldigheid een aantalDagen. Bij verschuiven(+1) geldt:
	 * <ul>
	 * <li>maandag wordt dinsdag
	 * <li>dinsdag wordt woensdag
	 * <li>...
	 * <li>zondag wordt maandag
	 * </ul>
	 * Bij negatieve getallen verschuift de geldigheid achteruit.
	 */
	public BDGeldigheid verschuiven(int aantalDagen) {
		// to implement
		return null;
	}

}
