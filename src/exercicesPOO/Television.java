package exercicesPOO;

public class Television {
	
	Integer chaine = 130;
	Integer volume = 20;
	
	void changerChaine(Integer nouvelleChaine) {
		if(chaine.equals(nouvelleChaine)) {
			System.out.println("Nouvelle chaine est aussi la chaine actuel.");
		}else {
			chaine = nouvelleChaine;
			System.out.println("Chaine a été changé par " + chaine);
		}
	}
	
	void changerVolume(Integer nouveauVolume) {
		if(volume.equals(nouveauVolume)) {
			System.out.println("Nouveau volume est aussi le volume actuel.");
		}else {
			volume = nouveauVolume;
			System.out.println("Le volume a été changé par "+ volume);
		}
	}
	
	public static void main(String[] args) {
		Television tele = new Television();
		
		tele.changerVolume(20);
		tele.changerChaine(130);
		
		tele.changerVolume(300);
		tele.changerChaine(10);
		
	}

}
