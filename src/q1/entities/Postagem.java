package q1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
	private static int qt = 0;
	private Integer id;
	private String texto;
	private LocalDateTime instante;
	private List<Foto> fotos = new ArrayList<>();

	public Postagem(String texto, LocalDateTime instante) {
		this.id = ++qt;
		this.texto = texto;
		this.instante = instante;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	public Integer getId() {
		return id;
	}
	
	public void addFoto(Foto f) {
		fotos.add(f);
	}
	
	public void removeFoto(Foto f) {
		fotos.remove(f);
	}

	@Override
	public String toString() {
		return "Postagem [id=" + id + ", texto=" + texto + ", instante=" + instante + ", fotos=" + fotos + "]";
	}

}
