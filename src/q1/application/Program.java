package q1.application;

import java.time.LocalDate;
import java.time.LocalDateTime;

import q1.entities.Album;
import q1.entities.Foto;
import q1.entities.Postagem;
import q1.entities.Usuario;

public class Program {

	public static void main(String[] args) {
		Foto f1 = new Foto("http://dominio.com/praia2.jpg", LocalDateTime.parse("2017-01-10T10:30:14"));
		Foto f2 = new Foto("http://dominio.com/praia3.jpg", LocalDateTime.parse("2017-01-10T10:31:12"));

		Album a1 = new Album("Férias de verão", LocalDateTime.parse("2017-01-13T13:50:13"));
		a1.addFoto(f1);
		a1.addFoto(f2);
		
		Usuario u3 = new Usuario("Carlos alves", "carlos@yahoo.com", LocalDate.parse("1999-10-05"), 
				"M", "carlitoblogspot.com.br", "http://dominio.com/carlito.jpg", "997778383");
		u3.addAlbum(a1);
		
		Usuario u4 = new Usuario("Ana Clara", "aninha@gmail.com", LocalDate.parse("1997-01-23"), 
				"F", "blog.clara.com", "http://dominio.com/clara.jpg", "881812820");
		u4.addSeguindo(u3);
		u3.addSeguidor(u4);
		
		Postagem p1 = new Postagem("#partiu festa!", LocalDateTime.parse("2017-08-09T19:34:20"));
		Postagem p2 = new Postagem("Bom dia povo!", LocalDateTime.parse("2017-08-10T07:50:00"));
		u4.addPostagem(p1);
		u4.addPostagem(p2);
		
		Usuario u1 = new Usuario("João Silva", "joao@gmail.com", LocalDate.parse("1991-10-15"), 
				"M", "blog.jao.com", "http://dominio.com/joao43.jpg", "6666677799");
		u1.addSeguindo(u3);
		u3.addSeguidor(u1);
		u1.addSeguindo(u4);
		u4.addSeguidor(u1);
		
		Usuario u2 = new Usuario("Maria Alice", "alice@gmail.com", LocalDate.parse("1999-04-15"), 
				"F", "youtube.com/alice", "http://dominio.com/festa.jpg", "885872825");
		u2.addSeguindo(u4);
		u4.addSeguidor(u2);
		
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
	}

}
