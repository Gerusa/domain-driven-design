package br.com.alura.escola.academico.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.academico.dominio.aluno.Telefone;
import br.com.alura.escola.shared.dominio.CPF;

/**
 * Persist�ncia com JDBC.
 * Obs: apenas para t�tulo de estudo. N�o est� funcional.
 *
 */
public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

	private final Connection connection;

	public RepositorioDeAlunosComJDBC(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		try {
			//persist�ncia do aggreate Aluno. Veja q insere aluno e telefone no mesmo reposit�rio
			String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();

			sql = "INSERT INTO TELEFONE VALUES(?, ?)";
			ps = connection.prepareStatement(sql);
			for (Telefone telefone : aluno.getTelefones()) {
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());
				ps.execute();
			}

		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
