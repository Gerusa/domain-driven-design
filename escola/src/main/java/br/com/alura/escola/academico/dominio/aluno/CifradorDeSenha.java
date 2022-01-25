package br.com.alura.escola.academico.dominio.aluno;

/**
 * Interface para cifrar uma senha. A interface pertence ao dom�nio, por�m a
 * classe que a implementa pertence � infraestrutura.
 *
 */
public interface CifradorDeSenha {

	String cifrarSenha(String senha);

	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
