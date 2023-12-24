package exercicesPOO;


public class Array{

  public static void main (String[] args){

  double[] temperaturas = new double[5];

    temperaturas[0] = 4;
    temperaturas[1] = 9;
    temperaturas[2] = 7;
    temperaturas[3] = 5;
    temperaturas[4] = 8;


    for(int i=0; i<temperaturas.length; i++){
      System.out.println("A posição das temperaturas são: " + (i+1) + " valor: " + temperaturas[i]);
    }
}
}
