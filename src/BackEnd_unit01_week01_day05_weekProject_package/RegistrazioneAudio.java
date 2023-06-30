package BackEnd_unit01_week01_day05_weekProject_package;

//- - - - - - - - - - - - - - - - - - - - class definition
public class RegistrazioneAudio extends AudioVideo {

	public RegistrazioneAudio(String _titolo, int _durata, int _volume) {
		super(_titolo, _durata, _volume);
	}

	public boolean riproducibile() {
		return true;
	}

	public void play() {

	}

}
