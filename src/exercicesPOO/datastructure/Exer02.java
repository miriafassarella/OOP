package exercicesPOO.datastructure;

public class Exer02{

public static void main(String[] args){

  ContaCorrente conta = new ContaCorrente();
  conta.numero = "123456";
  conta.agencia = "1234";
  conta.especial = true;
  conta.limiteEspecial = 500;
  conta.saldo = -10;
  conta.valorEspecialUsado = 0;

  /*boolean saqueEfetuado = conta.realizarSaque(500);

    if (saqueEfetuado){
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Conta:  " + conta.numero);
      conta.consultarSaldo();
    }else{
      System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
    }*/

    boolean saqueEfetuado = conta.realizarSaque(40);

      if (saqueEfetuado){
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Conta:  " + conta.numero);
        conta.consultarSaldo();
      }else{
        System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
      }

      conta.depositar(500);

      conta.consultarSaldo();

      if (conta.consultaUsoChequeEspecial()){
        System.out.println("Está usando cheque especial");
      }else{
        System.out.println("Não está usando cheque especial");
      }
}
}
