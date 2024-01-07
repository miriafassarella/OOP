package exercicesPOO.arrays;

public class Calendar {
	
	 static String obterNomeMes(int numeroMes) {
		 
		 String[] mois = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro",
				 "Novembro","Dezembro"};
		 
		return mois[numeroMes - 1];
	        
	    }

	    public static void main(String[] args) {
	        String mes = Calendar.obterNomeMes(1);

	        System.out.println(mes);

}
}
