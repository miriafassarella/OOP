package exercicesPOO.arrays;

public class Calendar {
	
	 static String obterNomeMes(int numeroMes) {
		 
		 String[] mois = {"Mês 0 não existe !","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro",
				 "Novembro","Dezembro"};
		 
		return mois[numeroMes];
	        
	    }

	    public static void main(String[] args) {
	        String mes = Calendar.obterNomeMes(12);

	        System.out.println(mes);

}
}
