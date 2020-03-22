package calculator;
/**
 * Classe que simula os metodos basicos de uma calculadora
 * @author dariop
 *
 */
public class Calculator {
	
	/**
	 * Metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Calculadora");
	}
	
	/**
	 * Faz a soma dos dois números dados
	 * @param x - primeiro número
	 * @param y - segundo número
	 * @return - o resultado: x+y
	 */
	public int soma (int x, int y) {
		return x+y;
	}
	
	/**
	 * Faz a subtraçao dos dois números dados
	 * @param x - primeiro número
	 * @param y - segundo número
	 * @return - o resultado: x-y
	 */
	public int subtracao (int x, int y) {
		return x-y;
	}
	
	/**
	 * Faz a multiplicação dos dois números dados
	 * @param x - primeiro número
	 * @param y - segundo número
	 * @return - o resultado: x*y
	 */
	public int multiplicacao (int x, int y) {
		return x*y;
	}
	
	/**
	 * Calcula o quadrado do número passado como argumento
	 * @param x - número para descobrir o quadrado
	 * @return - o resultado: x*x
	 */
	public int quadrado (int x) {
		return x*x;
	}
	
	/**
	 * Verifica se o número dado é par
	 * @param x - número para verificar
	 * @return - true se x%2=0 (é par) ou falso caso contrário
	 */
	public boolean isPar(int x) {
		if(x%2==0)
			return true;
		else return false;
	}

}
