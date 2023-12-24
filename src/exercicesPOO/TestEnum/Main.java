package exercicesPOO.TestEnum;

public class Main {

	public static void main(String[] args) {
		
		
				Fournisseur immobilier = new Fournisseur();
				immobilier.setNom("Maison & Cia Biens Immobiliers");
				Fournisseur superMarcher = new Fournisseur();
				superMarcher.setNom("SuperMarcher du João");
				
				
				Client grossiste = new Client();
				grossiste.setNom("Sable de la mer grossiste");
				Client telecom = new Client();
				telecom.setNom("PhoneoneNet Télécommunications");
				
				
				CompteAPayer contaPayer1 = new CompteAPayer();
				contaPayer1.setDescription("Location du siège social");
				contaPayer1.setPrix(1230d);
				contaPayer1.setDateExpiration("10/05/2012");
				contaPayer1.setFournisseur(immobilier);
				
				CompteAPayer contaPayer2 = new CompteAPayer(superMarcher, "Courses pour le mois", 390d, "19/05/2012");
				
				
				CompteRecevoir contaRecevoir1 = new CompteRecevoir();
				contaRecevoir1.setDescription("Developpemnt d'un projet en Java");
				contaRecevoir1.setPrix(89500d);
				contaRecevoir1.setDateExpiration("23/05/2012");
				contaRecevoir1.setClient(grossiste);
				
				CompteRecevoir contaRecevoir2 = new CompteRecevoir(telecom, "Manutenção em sistema de conta online", 
					53200d, "13/05/2012");
				
				// pagamento e cancelamento de contas a pagar
				contaPayer1.payer();
				contaPayer2.annuler();
				
				// recebimento e cancelamento de contas a receber
				contaRecevoir1.recevoir();
				contaPayer1.annuler();
				
	}

}
