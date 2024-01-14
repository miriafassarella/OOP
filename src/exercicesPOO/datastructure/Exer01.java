package exercicesPOO.datastructure;


public class Exer01{

  public static void main(String[] args){

  Lampada lampada = new Lampada();

    lampada.ligar();

    lampada.desligar();
    
    if (args.length <= 1) {
    	 System.out.println("Use: java Exer01 [pt|en] [seu nome]");
    }else if(args[0].equals("en")) {
    	 System.out.printf("Hello, %s!%n", args[1]);
    }else if(args[0].equals("pt")) {
    	 System.out.printf("Olá, %s!%n", args[1]);
    }
    
    


    }


}
