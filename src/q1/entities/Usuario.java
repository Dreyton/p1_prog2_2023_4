package q1.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private static int qt = 0;
	private Integer id;
	private String nome;
	private String email;
	private LocalDate nascimento;
	private String genero;
	private String webSite;
	private String uriFoto;
	private String telefone;
	private List<Postagem> postagens = new ArrayList<>();
	private List<Foto> fotos = new ArrayList<>();
	private List<Album> albuns = new ArrayList<>();
	private List<Usuario> seguidores = new ArrayList<>();
	private List<Usuario> seguindo = new ArrayList<>();
	
	public Usuario(String nome, String email, LocalDate nascimento, String genero, String webSite, String uriFoto,
			String telefone) {
		this.id = ++qt;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.genero = genero;
		this.webSite = webSite;
		this.uriFoto = uriFoto;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getUriFoto() {
		return uriFoto;
	}

	public void setUriFoto(String uriFoto) {
		this.uriFoto = uriFoto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public List<Usuario> getSeguidores() {
		return seguidores;
	}

	public List<Usuario> getSeguindo() {
		return seguindo;
	}
	
	public void addFoto(Foto f) {
		fotos.add(f);
	}
	
	public void removeFoto(Foto f) {
		fotos.remove(f);
	}
	public void addPostagem(Postagem f) {
		postagens.add(f);
	}
	
	public void removePostagem(Postagem f) {
		postagens.remove(f);
	}
	public void addAlbum(Album f) {
		albuns.add(f);
	}
	
	public void removeAlbum(Album f) {
		albuns.remove(f);
	}

	public void addSeguidor(Usuario s) {
		seguidores.add(s);
	}
	public void removeSeguidor(Usuario s) {
		seguidores.remove(s);
	}

	public void addSeguindo(Usuario s) {
		seguindo.add(s);
	}
	public void removeSeguindo(Usuario s) {
		seguindo.remove(s);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Seguidores: \n");
		for (var seguidor : seguidores) {
			sb.append(seguidor.getNome() + "\n");
		}
		
		sb.append("Seguindo: \n");
		for (var segue : seguindo) {
			sb.append(segue.getNome() + "\n");
		}
		
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + ", genero="
				+ genero + ", webSite=" + webSite + ", uriFoto=" + uriFoto + ", telefone=" + telefone + ", postagens="
				+ postagens + ", fotos=" + fotos + ", albuns=" + albuns + sb.toString() + "]";
	}
	
	
}
