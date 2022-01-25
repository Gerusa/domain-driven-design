package br.com.alura.escola.academico.dominio.aluno;

/**
 * É um value object, ou seja, não possui uma identidade única.
 * 
 * Se a igualdade entre dois objetos de uma classe é verificada através da
 * comparação de todos os seus valores, se trata de um Value Object.
 *
 */
public class Telefone {

	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e Numero sao obrigatorios!");
		}

		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD invalido!");
		}

		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Numero invalido!");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

}
