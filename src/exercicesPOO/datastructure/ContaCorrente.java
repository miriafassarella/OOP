package exercicesPOO.datastructure;


public class ContaCorrente{

  String numero;
  String agencia;
  boolean especial;
  double limiteEspecial;
  double saldo;
  double valorEspecialUsado;

  boolean realizarSaque( double quantiaASacar){ //primeiro método para realizar um saque

    if (saldo >= quantiaASacar){
      saldo -= quantiaASacar;
      return true;
    }else{
      if(especial){
        double limite = limiteEspecial + saldo;
        if (limite >= quantiaASacar){
          saldo -= quantiaASacar;
          return true;
        }
      }else {
        return false;
      }
    return false;
    }
 }
    void depositar(double valorDepositado){ //método para fazer um depósito
      saldo += valorDepositado;
    }
    void consultarSaldo(){ //método para consultar o saldo.
      System.out.println("Saldo atual da conta: " + saldo);
    }

    boolean consultaUsoChequeEspecial(){ //método para verificar se foi utilizado o cheque especial.
      return saldo < 0;
    }
     }
