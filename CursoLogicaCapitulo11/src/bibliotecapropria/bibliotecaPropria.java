package bibliotecapropria;

import console.Interacao;

public class bibliotecaPropria {
	
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um numero decimal:");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa e uma mensagem de erro!");
		
		interacao.fechar();
	}

}
