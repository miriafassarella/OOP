package exercicesPOO.datastructure;

public class Patient {
	
	float poids;
	float taille;
	
	
	
	IMC masseCorporelle() {
		
		IMC imc = new IMC();
		
		float indice = poids / (taille * taille);
		
		imc.indice = indice;
		
		if(indice < 18.5) {
			imc.enDessousPoids = true;
			
		}else if(indice < 25) {
			imc.poidsIdeal = true;
		}else {imc.obese = true;
		
			if(indice < 30) {
				imc.degre = "Au dessus du poids";
			}else if(indice < 35) {
				imc.degre = "I";
			}else if(indice < 40) {
				imc.degre = "II";
			}else {imc.degre = "III";}
		
		}
			
		
		return imc;
	}

}
