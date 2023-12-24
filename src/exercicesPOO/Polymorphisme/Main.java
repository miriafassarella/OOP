package exercicesPOO.Polymorphisme;

public class Main {
	public static void main(String[] args) {
		
		Compte compte1 = new Compte();
		compte1.setSolde(20);
		
		TFSA tfsa = new TFSA();
		tfsa.setSolde(30);
		
		
		Main.imprimer(compte1);
		
		System.out.println("------------------------------------------------");
		Main.imprimer(tfsa);
		System.out.println("------------------------------------------------");
		Compte tfsa2 = new TFSA();
		tfsa2.setSolde(5);
		
		Main.imprimer(tfsa2);
		
	}



public static void imprimer(Compte compte) {
	System.out.println("Le solde est: " + compte.getSolde());
	if(compte instanceof TFSA) {
		TFSA cc = (TFSA)compte;
		
		System.out.println("Le limite du compte est: " + cc.getLimite());
	}
	
}
}