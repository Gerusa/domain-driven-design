package br.com.alura.escola.academico.dominio.aluno;

/**
 * Interface para cifrar uma senha. A interface pertence ao domínio, porém a
 * classe que a implementa pertence à infraestrutura.
 *
 */
public interface CifradorDeSenha {

	String cifrarSenha(String senha);

	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
