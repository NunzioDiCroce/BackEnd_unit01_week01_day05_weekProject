package BackEnd_unit01_week01_day05_weekProject_package;

// - - - - - - - - - - - - - - - - - - - - abstract class definition
abstract class ElementoMultimediale {

	protected String titolo;

	public ElementoMultimediale(String _titolo) {
		this.titolo = _titolo;
	}

	public abstract boolean riproducibile();

}
