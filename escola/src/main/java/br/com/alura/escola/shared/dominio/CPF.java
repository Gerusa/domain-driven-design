package br.com.alura.escola.shared.dominio;

/**
 * � um value object, ou seja, n�o possui uma identidade �nica.
 * 
 * Se a igualdade entre dois objetos de uma classe � verificada atrav�s da
 * compara��o de todos os seus valores, se trata de um Value Object.
 *
 */
public class CPF {

	private static final String CPF_VALIDO = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

	private String numero;

	public CPF(String numero) {
		if (numero == null || !numero.matches(CPF_VALIDO)) {
			throw new IllegalArgumentException("CPF inv�lido");
		}

		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
