
public class Jeu {

	// Ensemble des pièces
	private Piece[][] jeu;

	private int nbLignes;
	private int nbColonnes;


	public Jeu(int nblignes, int nbcolones)
	{
		nbLignes = nblignes;
		nbColonnes = nbcolones;
		jeu = new Piece[nblignes][nbcolones];

		creerJeu();
		afficherJeu();
	}

	private void creerJeu() {
		for(int y = 0; y<nbLignes; y++) {
			for(int x = 0; x<nbColonnes; x++) {
				jeu[x][y] = new Piece( (int)Math.floor(4*Math.random()) + 1 );
			}
		}
	}


	private void afficherJeu() {


		// Affichage des valeurs des pièces sur la console
		String text = new String();
		for(int y = 0; y<10; y++) {
			for(int x = 0; x<10; x++) {
				text += jeu[x][y].toString();
			}
			System.out.println(text);
			text = "";
		}

		// Affichage fenêtre de points multicolores qui représentent les pièces
		Point[][] Points = new Point[10][10];


		// Création des points
		int rayonPoint = 5;
		int espacement = 30;
		for (int y = 0; y<10; y++) {
			for(int x = 0; x<10; x++) {
				Points[x][y] = (new Point(espacement*(x+1), espacement*(y+1), rayonPoint ));

				switch(jeu[x][y].getNature()) {
				case 1:
					// rouge
					Points[x][y].setColor(255, 0, 0);
					break;
				case 2:
					// vert
					Points[x][y].setColor(0, 255, 0);
					break;
				case 3:
					// bleu
					Points[x][y].setColor(0, 0, 255);
					break;
				case 4:
					// cyan
					Points[x][y].setColor(0, 255, 255);
					break;
				default:
					// noir
					Points[x][y].setColor(0, 0, 0);
				}


			}


		}

		// Création des traits
		for (int y = 0; y<9; y++) {
			for(int x = 0; x<9; x++) {
				new Trait (Points[x][y], Points[x][y+1]);
				new Trait (Points[x][y], Points[x+1][y]);
			}
			// Traits manquants aux extrémités
			new Trait (Points[9][y], Points[9][y+1]);
			new Trait (Points[y][9], Points[y+1][9]);
		}
	}
}
