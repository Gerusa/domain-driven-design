package br.com.alura.escola.academico.dominio.aluno;

/**
 * É um value object, ou seja, não possui uma identidade única.
 * 
 * Se a igualdade entre dois objetos de uma classe é verificada através da
 * comparação de todos os seus valores, se trata de um Value Object.
 *
 */
public class Email {

	private static final String EMAIL_VALIDO = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches(EMAIL_VALIDO)) {
			throw new IllegalArgumentException("E-mail inválido");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
