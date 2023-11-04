package q1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Album {
	private static int qt = 0;
	private Integer id;
	private String titulo;
	private LocalDateTime instante;
	private List<Foto> fotos = new ArrayList<>();

	public Album(String titulo, LocalDateTime instante) {
		this.id = ++qt;
		this.titulo = titulo;
		this.instante = instante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
		return "Album [id=" + id + ", titulo=" + titulo + ", instante=" + instante + ", fotos=" + fotos + "]";
	}
	
	
}
