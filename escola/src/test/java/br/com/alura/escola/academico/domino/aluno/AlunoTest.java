package br.com.alura.escola.academico.domino.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.shared.dominio.CPF;

class AlunoTest {

	private Aluno aluno;

	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(new CPF("123.456.789-00"), "Fulano", new Email("fulano@email.com"));
	}

	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("11", "999999999");
		Assertions.assertTrue(this.aluno.getTelefones().size() == 1);
	}

	@Test
	void deveriaPermitirAdicionar2Telefones() {
		this.aluno.adicionarTelefone("11", "999999999");
		this.aluno.adicionarTelefone("11", "923541524");
		Assertions.assertTrue(this.aluno.getTelefones().size() == 2);
	}

	@Test
	void naoDeveriaPermitirAdicionarMaisDe2Telefones() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("11", "999999999");
			this.aluno.adicionarTelefone("11", "923541524");
			this.aluno.adicionarTelefone("11", "923541889");
		});
	}

}
