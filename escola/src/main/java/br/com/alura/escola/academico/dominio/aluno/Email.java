package br.com.alura.escola.academico.dominio.aluno;

/**
 * � um value object, ou seja, n�o possui uma identidade �nica.
 * 
 * Se a igualdade entre dois objetos de uma classe � verificada atrav�s da
 * compara��o de todos os seus valores, se trata de um Value Object.
 *
 */
public class Email {

	private static final String EMAIL_VALIDO = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches(EMAIL_VALIDO)) {
			throw new IllegalArgumentException("E-mail inv�lido");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
