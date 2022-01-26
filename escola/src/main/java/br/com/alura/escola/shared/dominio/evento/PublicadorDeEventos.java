package br.com.alura.escola.shared.dominio.evento;

import java.util.ArrayList;
import java.util.List;

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
