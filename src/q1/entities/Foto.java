package q1.entities;

import java.time.LocalDateTime;

public class Foto {
	private String uri;
	private LocalDateTime instante;

	public Foto(String uri, LocalDateTime instante) {
		this.uri = uri;
		this.instante = instante;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	@Override
	public String toString() {
		return "Foto [uri=" + uri + ", instante=" + instante + "]";
	}

}
