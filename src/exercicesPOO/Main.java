package exercicesPOO;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Proprietaire prop1 = new Proprietaire();
		
		prop1.nom = "Miriã";
		
		Voiture maVoiture = new Voiture(); 
		maVoiture.modele = "Civic sport";
		
		maVoiture.proprietaire = prop1;
		
		Voiture taVoiture = new Voiture();
		//taVoiture.modele = "Infiniti Q50";
		taVoiture.proprietaire = prop1; // juste un pointeur
		
		maVoiture.demarrerVoiture();
		taVoiture.demarrerVoiture();
		
		Patient patient = new Patient();
		patient.poids = 70.5F;
		patient.taille = 1.75F;
		
		String numero = new String();
		Autobus coteAcadie = new Autobus();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entrer le numero de l'autobus: ");
		numero = entrada.next();
		
		int nb = Integer.parseInt(numero);
		
		
		coteAcadie.definirAutobus(nb);
		Personne personne1 = new Personne();
		personne1.nom = "Miriã";
		
		personne1.chien = new Chien();
		
		personne1.chien.nom = "Bart";
		
		Promenade p = new Promenade();
		p.marcher(personne1);
		
		
		
		
	}
}
