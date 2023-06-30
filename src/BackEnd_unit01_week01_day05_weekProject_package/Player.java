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
			}
		}

		// - - - - - - - - - - - - - - - - - - - - play/show management

		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Player");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Hai creato 5 elementi multimediali.");

		int sceltaInt = -1;

		while (sceltaInt != 0) {

			System.out.println("");
			System.out.println("Scegli un valore da 1 a 5 per utilizzare il Player oppure 0 per terminare.");
			String scelta = playerScanner.nextLine();
			sceltaInt = Integer.parseInt(scelta);

			switch (sceltaInt) {
			case 1:
				ElementoMultimediale playerArrayItem1 = playerArray[sceltaInt - 1];
				if (playerArrayItem1.riproducibile()) {
					((AudioVideo) playerArrayItem1).play();
				} else {
					((Immagine) playerArrayItem1).show();
				}
				break;
			case 2:
				ElementoMultimediale playerArrayItem2 = playerArray[sceltaInt - 1];
				if (playerArrayItem2.riproducibile()) {
					((AudioVideo) playerArrayItem2).play();
				} else {
					((Immagine) playerArrayItem2).show();
				}
				break;
			case 3:
				ElementoMultimediale playerArrayItem3 = playerArray[sceltaInt - 1];
				if (playerArrayItem3.riproducibile()) {
					((AudioVideo) playerArrayItem3).play();
				} else {
					((Immagine) playerArrayItem3).show();
				}
				break;
			case 4:
				ElementoMultimediale playerArrayItem4 = playerArray[sceltaInt - 1];
				if (playerArrayItem4.riproducibile()) {
					((AudioVideo) playerArrayItem4).play();
				} else {
					((Immagine) playerArrayItem4).show();
				}
				break;
			case 5:
				ElementoMultimediale playerArrayItem5 = playerArray[sceltaInt - 1];
				if (playerArrayItem5.riproducibile()) {
					((AudioVideo) playerArrayItem5).play();
				} else {
					((Immagine) playerArrayItem5).show();
				}
				break;
			default:
				System.out.println("Scegli un valore da 1 a 5 per utilizzare il Player oppure 0 per terminare.");
				scelta = playerScanner.nextLine();
				sceltaInt = Integer.parseInt(scelta);
			}

		}

		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Termine programma");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

	}
}
