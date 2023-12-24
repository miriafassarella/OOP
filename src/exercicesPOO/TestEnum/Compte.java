package exercicesPOO.TestEnum;

public class Compte {

	
	protected String description;
	protected double prix;
	protected String dateExpiration;
	protected SituationCompte situationCompte;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	Compte(){
		
	}
	Compte(SituationCompte situationCompte, String description, double prix,
			String dateExpiration){
		this.situationCompte = situationCompte.ATTENTE;
		this.description = description;
		this.prix = prix;
		this.dateExpiration = dateExpiration;
	}
	
	
	
	public void annuler() {
		if(situationCompte == situationCompte.ANNULEE || situationCompte == situationCompte.PAIE) {
			System.out.println("Erreur, ce compte ne peut pas être annulé!");
		}else {
		situationCompte = situationCompte.ANNULEE;
		System.out.println("Le compte a été bien annulé :)");
		}
	}
	
}
