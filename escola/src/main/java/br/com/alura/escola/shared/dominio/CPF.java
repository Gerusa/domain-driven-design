package br.com.alura.escola.shared.dominio;

/**
 * É um value object, ou seja, não possui uma identidade única.
 * 
 * Se a igualdade entre dois objetos de uma classe é verificada através da
 * comparação de todos os seus valores, se trata de um Value Object.
 *
 */
public class CPF {

	private static final String CPF_VALIDO = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

	private String numero;

	public CPF(String numero) {
		if (numero == null || !numero.matches(CPF_VALIDO)) {
			throw new IllegalArgumentException("CPF inválido");
		}

		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
