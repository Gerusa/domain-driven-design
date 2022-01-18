package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

/**
 * Classe genérica, para publicar qualquer tipo de evento.
 *
 */
public class PublicadorDeEventos {

	public List<Ouvinte> ouvintes = new ArrayList<>();

	public void adicionar(Ouvinte ouvinte) {
		this.ouvintes.add(ouvinte);
	}

	public void publicar(Evento evento) {
		this.ouvintes.forEach(o -> {
			o.processa(evento);
		});
	}
}
