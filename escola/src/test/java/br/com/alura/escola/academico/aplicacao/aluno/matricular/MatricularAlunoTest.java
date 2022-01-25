package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.CPF;
import br.com.alura.escola.academico.dominio.aluno.PublicadorDeEventos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);

		String cpf = "123.456.789-00";
		MatricularAlunoDTO dto = new MatricularAlunoDTO("Fulano", cpf, "fulano@email.com");

		useCase.matricular(dto);

		Aluno aluno = repositorio.buscarPorCPF(new CPF(cpf));
		assertTrue(aluno != null);
	}

}
