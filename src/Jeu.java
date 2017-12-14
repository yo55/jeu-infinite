
public class Jeu {

	// Ensemble des pièces
	private Piece[][] jeu;

	private Point[][] Points ;

	private int nbLignes;
	private int nbColonnes;


	public Jeu(int nblignes, int nbcolones)
	{
		nbLignes = nblignes;
		nbColonnes = nbcolones;
		jeu = new Piece[nbcolones][nblignes];
		Points = new Point[nbcolones][nblignes];

		creerJeu();
		afficherJeuConsole();
		//afficherJeu();
		//afficherGrille();
	}
	
	public void update() {
		for(int y = 0; y<nbLignes; y++) {
			for(int x = 0; x<nbColonnes; x++) {
				jeu[x][y].setNature( (int)Math.floor(4*Math.random()) + 1 );
			}
		}
		afficherJeu();
	}

	private void creerJeu() {
		for(int y = 0; y<nbLignes; y++) {
			for(int x = 0; x<nbColonnes; x++) {
				jeu[x][y] = new Piece( (int)Math.floor(4*Math.random()) + 1 );
			}
		}
	}


	private void afficherJeuConsole() {


		// Affichage des valeurs des pièces sur la console
		String text = new String();
		for (int y = 0; y<nbLignes; y++) {
			for(int x = 0; x<nbColonnes; x++) {
				text += jeu[x][y].toString();
			}
			System.out.println(text);
			text = "";
		}
	}

	private void afficherJeu() {

		// Création des points
		int rayonPoint = 5;
		int espacement = 30;
		for (int y = 0; y<nbLignes; y++) {
			for(int x = 0; x<nbColonnes; x++) {
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
	}


	private void afficherGrille() {

		// Création des traits
		for (int y = 0; y<nbLignes-1; y++) {
			for(int x = 0; x<nbColonnes-1; x++) {
				new Trait (Points[x][y], Points[x][y+1]); // voisin du dessous
				new Trait (Points[x][y], Points[x+1][y]); // voisin de droite
			}
			// Traits manquants aux extrémités
			new Trait (Points[nbColonnes-1][y], Points[nbColonnes-1][y+1]);

		}
		for(int x = 0; x<nbColonnes-1; x++) {
			new Trait (Points[x][nbLignes-1], Points[x+1][nbLignes-1]);
		}
	}
}
