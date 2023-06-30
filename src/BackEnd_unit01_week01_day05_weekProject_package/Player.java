package BackEnd_unit01_week01_day05_weekProject_package;

import java.util.Scanner;

//- - - - - - - - - - - - - - - - - - - - import

//- - - - - - - - - - - - - - - - - - - - class definition
public class Player {
	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - - - - - - scanner definition
		Scanner playerScanner = new Scanner(System.in);

		// - - - - - - - - - - - - - - - - - - - - array definition
		ElementoMultimediale[] playerArray = new ElementoMultimediale[5];

		// - - - - - - - - - - - - - - - - - - - - input management
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Crea 5 elementi multimediali");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		for (int i = 0; i < 5; i++) {

			System.out.println("");
			System.out.println("Inserisci titolo:");
			String titolo = playerScanner.nextLine();

			System.out.println("");
			System.out.println("Inserisci tipo");
			System.out.println("Inserisci 1 per video, 2 per audio, 3 per immagine:");
			String tipo = playerScanner.nextLine();
			int tipoInt = Integer.parseInt(tipo);

			if (tipoInt == 1) {
				System.out.println("");
				System.out.println("Hai inserito un video");
				System.out.println("Inserisci la durata del video:");
				String durata = playerScanner.nextLine();
				int durataInt = Integer.parseInt(durata);
				System.out.println("Inserisci il volume del video:");
				String volume = playerScanner.nextLine();
				int volumeInt = Integer.parseInt(volume);
				System.out.println("Inserisci la luminosità del video:");
				String luminosita = playerScanner.nextLine();
				int luminositaInt = Integer.parseInt(luminosita);
				playerArray[i] = new Video(titolo, durataInt, volumeInt, luminositaInt);

			} else if (tipoInt == 2) {
				System.out.println("");
				System.out.println("Hai inserito un Audio");
				System.out.println("Inserisci la durata del audio:");
				String durata = playerScanner.nextLine();
				int durataInt = Integer.parseInt(durata);
				System.out.println("Inserisci il volume del audio:");
				String volume = playerScanner.nextLine();
				int volumeInt = Integer.parseInt(volume);
				playerArray[i] = new RegistrazioneAudio(titolo, durataInt, volumeInt);

			} else if (tipoInt == 3) {
				System.out.println("");
				System.out.println("Hai inserito una immagine");
				System.out.println("Inserisci la luminosità dell'immagine:");
				String luminosita = playerScanner.nextLine();
				int luminositaInt = Integer.parseInt(luminosita);
				playerArray[i] = new Immagine(titolo, luminositaInt);
			} else {
				System.out.println("");
				System.out.println("Hai inserito un valore non valido!");
				i--;
				System.out.println("Inserisci 1 per video, 2 per audio, 3 per immagine:");
			}
		}

		// - - - - - - - - - - - - - - - - - - - - play/show management

		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Player");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Hai creato 5 elementi multimediali.");
		System.out.println("Scegli da 1 a 5 per usare il Player.");
		System.out.println("Inserisci un valore da 1 a 5:");
		String selezione = playerScanner.nextLine();
		int selezioneInt = Integer.parseInt(selezione);
		int selezioneIntNew = selezioneInt - 1;

		if (selezioneIntNew == 0 || selezioneIntNew == 1 || selezioneIntNew == 2 || selezioneIntNew == 3
				|| selezioneIntNew == 4) {

		} else {
			System.out.println("");
			System.out.println("Hai effettuato una scelta non valida!");
		}
	}
}
