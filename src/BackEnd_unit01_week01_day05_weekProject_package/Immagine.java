package BackEnd_unit01_week01_day05_weekProject_package;

//- - - - - - - - - - - - - - - - - - - - class definition
public class Immagine extends ElementoMultimediale {

	private int luminosita;

	public Immagine(String _titolo, int _luminosita) {
		super(_titolo);
		this.luminosita = _luminosita;
	}

	public boolean riproducibile() {
		return false;
	}

	public void abbassaLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}
	}

	public void alzaLuminosita() {
		luminosita++;
	}

	public void show() {
		System.out.println(titolo + " " + "*".repeat(luminosita));
	}

}
