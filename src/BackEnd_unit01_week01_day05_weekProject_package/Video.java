package BackEnd_unit01_week01_day05_weekProject_package;

//- - - - - - - - - - - - - - - - - - - - class definition
public class Video extends AudioVideo {

	private int luminosita;

	public Video(String _titolo, int _durata, int _volume, int _luminosita) {
		super(_titolo, _durata, _volume);
		this.luminosita = _luminosita;
	}

	public boolean riproducibile() {
		return true;
	}

	public void abbassaLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}
	}

	public void alzaLuminosita() {
		luminosita++;
	}

	public void play() {

	}

}
