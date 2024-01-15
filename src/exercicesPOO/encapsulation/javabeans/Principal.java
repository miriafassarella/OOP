package exercicesPOO.encapsulation.javabeans;

public class Principal {

	 public static void main(String[] args) {
	        Supplier imobiliaria = new Supplier("Zé Negócios Imobiliários");

	        AccountToPay contaAluguel = new AccountToPay();
	        contaAluguel.setDescription("Aluguel do apartamento");
	        contaAluguel.setBalance(4500);
	        contaAluguel.setDueDate("10/07/2022");
	        contaAluguel.setSupplier(imobiliaria);

	        imprimirConta(contaAluguel);

	        contaAluguel.pay();
	        imprimirConta(contaAluguel);

	        // Pagar a mesma conta novamente deve ser impedido
	         //contaAluguel.pay();

	        contaAluguel.cancelPayment();
	        imprimirConta(contaAluguel);

	        // Cancelar o pagamento de uma conta pendente deve ser impedido
	         //contaAluguel.cancelPayment();
	    }

	    public static void imprimirConta(AccountToPay conta) {
	        System.out.printf("Fornecedor: %s%n", conta.getSupplier().getName());
	        System.out.printf("Descrição: %s%n", conta.getDescription());
	        System.out.printf("Data de vencimento: %s%n", conta.getDueDate());
	        System.out.printf("Valor: R$%.2f%n", conta.getBalance());
	        System.out.printf("Pago: %s%n", conta.isPaid() ? "Sim" : "Não");
	        System.out.println();
	    }
}
