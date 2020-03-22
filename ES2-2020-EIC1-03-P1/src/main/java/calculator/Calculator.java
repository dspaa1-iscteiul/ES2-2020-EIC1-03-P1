package calculator;
/**
 * Classe que simula os metodos basicos de uma calculadora
 * @author dariop
 *
 */
public class Calculator {
	
	/**
	 * Metodo main
	 * @param args - ""
	 */
	public static void main(String[] args) {
		System.out.println("Calculadora");
	}
	
	/**
	 * Faz a soma dos dois n�meros dados
	 * @param x - primeiro n�mero
	 * @param y - segundo n�mero
	 * @return - o resultado: x+y
	 */
	public int soma (int x, int y) {
		return x+y;
	}
	
	/**
	 * Faz a subtra�ao dos dois n�meros dados
	 * @param x - primeiro n�mero
	 * @param y - segundo n�mero
	 * @return - o resultado: x-y
	 */
	public int subtracao (int x, int y) {
		return x-y;
	}
	
	/**
	 * Faz a multiplica��o dos dois n�meros dados
	 * @param x - primeiro n�mero
	 * @param y - segundo n�mero
	 * @return - o resultado: x*y
	 */
	public int multiplicacao (int x, int y) {
		return x*y;
	}
	
	/**
	 * Calcula o quadrado do n�mero passado como argumento
	 * @param x - n�mero para descobrir o quadrado
	 * @return - o resultado: x*x
	 */
	public int quadrado (int x) {
		return x*x;
	}
	
	/**
	 * Verifica se o n�mero dado � par
	 * @param x - n�mero para verificar
	 * @return - true se x%2=0 (� par) ou falso caso contr�rio
	 */
	public boolean isPar(int x) {
		if(x%2==0)
			return true;
		else return false;
	}

}
