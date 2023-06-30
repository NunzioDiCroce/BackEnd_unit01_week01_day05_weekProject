package BackEnd_unit01_week01_day05_weekProject_package;

//- - - - - - - - - - - - - - - - - - - - abstract class definition
abstract class AudioVideo extends ElementoMultimediale implements PlayInterface {

	protected int durata;
	protected int volume;

	public AudioVideo(String _titolo, int _durata, int _volume) {
		super(_titolo);
		this.durata = _durata;
		this.volume = _volume;
	}

	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		}
	}

	public void alzaVolume() {
		volume++;
	}

}
