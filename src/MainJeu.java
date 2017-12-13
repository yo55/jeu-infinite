import java.util.Scanner;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

// Projet : Afficher un plateau de jeu Imitant le jeu android "infinite"

// TO DO : Afficher des boutons dans les cases avec une image par-dessus et faire pivoter l'image au clic

// Amélioration : Refondre la bibliothèque graphique utilisant swing pour les besoins du jeu

public class MainJeu  {

	public static void main(String[] args) {



		Fenetre.createFenetre(500, 500, "Mon jeu");

		Jeu monJeu = new Jeu(12,8);

		
		ImageIcon img = new ImageIcon("quit-512.png");
		
		JButton bouton = new JButton("QUITTER");
		//bouton.setBounds(20, 300, 50, 50);
		//bouton.setIcon(img);

		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		Fenetre.getInstance().getContentPane().add(bouton);
		Fenetre.getInstance().setVisible(true);

		// PSYCHEDELIC !
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			monJeu.update();
		}

		





	} //end main()
}//end class





