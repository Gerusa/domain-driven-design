package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

/**
 * Cifrador de senha.
 *  Obs: apenas para t�tulo de estudo. N�o est� funcional.
 *
 */
public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		return null;
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return false;
	}

}
