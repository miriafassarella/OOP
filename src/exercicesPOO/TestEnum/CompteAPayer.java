package exercicesPOO.TestEnum;

public class CompteAPayer extends Compte{

	
	private Fournisseur fournisseur;
	
	
	
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	CompteAPayer(){
		
	}
	
	CompteAPayer(Fournisseur fournisseur, String description, double prix,
			String dateExpiration){
		this.description = description;
		this.prix = prix;
		this.dateExpiration = dateExpiration;
		this.fournisseur = fournisseur;
		
	}
	
	
	
	public void payer(){
		if(situationCompte == situationCompte.ANNULEE || situationCompte == situationCompte.PAIE) {
			System.err.println("Erreur");
		}else {
		situationCompte = situationCompte.PAIE;
		
		
		System.out.println("Le compte en dessous a été payé!");
		System.out.println("--------------------------------------");
		
		System.out.println("Description: " + description);
		System.out.println("Prix payé: " + prix);
		System.out.println("Expiration: " + dateExpiration);
		System.out.println("Fournisseur: " + fournisseur.getNom());
		}
	}
}

