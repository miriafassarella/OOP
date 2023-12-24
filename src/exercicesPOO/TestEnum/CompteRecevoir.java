package exercicesPOO.TestEnum;

public class CompteRecevoir extends Compte {
	
	protected Client client;
	
	public void setClient(Client client) {
		this.client = client;
	}

	CompteRecevoir(){
		
	}
	
	CompteRecevoir(Client client, String description, double prix, String dateExpiration){
		this.client = client;
		this.description = description;
		this.prix = prix;
		this.dateExpiration = dateExpiration;
	}
    public void recevoir() {
    	
    }
	
	public void annuler() {
		if(prix >= 50.000) {
			
			System.out.println("Erreur, ce compte est plus cher que 50.000!");
		}else {
		super.annuler();
		}
	}
}
