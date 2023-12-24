package exercicesPOO.estaticEtFinal;

public class TestMathematique {

	public static void main(String[] args) {
		
		int numeroFibonacci = MathematiqueUtil.calcularFibonacci(8);
		System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
		
		double areaCirculo = MathematiqueUtil.calcularAreaCirculo(104.8);
		System.out.println("Área do círculo: " + areaCirculo);

	}

}
