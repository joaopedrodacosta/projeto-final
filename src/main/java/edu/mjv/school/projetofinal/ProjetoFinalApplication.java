package edu.mjv.school.projetofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetoFinalApplication {

	public static void main(String[] args) {

		 SpringApplication.run(ProjetoFinalApplication.class, args);


	}

}





/*
		UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);


		Usuario usuario = new Usuario();
		usuario.setNome("joao");
		usuario.setEmail("joao@gmail.com");
		usuario.setSenha("123");
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		usuarioRepository.save(usuario);
		/*
		ArtistaRepository artistaRepository = context.getBean(ArtistaRepository.class);
		ArtistaService artistaService = context.getBean(ArtistaService.class);


/*
		Musica musica = new Musica();
		musica.setNome("Praise God");
		musica.setDuracao(3.46);
		String artistaNome = "Kanye West";
		Artista artista = artistaService.findByName(artistaNome);
		musica.setArtista(artista);
		musicaRepository.save(musica);

		Musica musica1 = new Musica();
		musica1.setNome("Hurricane");
		musica1.setDuracao(4.03);
		musica1.setArtista(artista);
		musicaRepository.save(musica1);

		Musica musica2 = new Musica();
		musica2.setNome("God is");
		musica2.setDuracao(3.23);
		musica2.setArtista(artista);
		musicaRepository.save(musica2);

		Musica musica3 = new Musica();
		musica3.setNome("Off The Grid");
		musica3.setDuracao(4.07);
		musica3.setArtista(artista);
		musicaRepository.save(musica3);


		Musica musica4 = new Musica();
		musica4.setNome("Moon");
		musica4.setDuracao(2.36);
		musica4.setArtista(artista);
		musicaRepository.save(musica4);
/*
		Musica musica5 = new Musica();
		musica5.setNome("My Side");
		musica5.setDuracao(4.54);
		musica5.setArtista(artista);
		musicaRepository.save(musica5);

		Musica musica6 = new Musica();
		musica6.setNome("Fake Love");
		musica6.setDuracao(3.30);
		musica6.setArtista(artista);
		musicaRepository.save(musica6);

		Musica musica7 = new Musica();
		musica7.setNome("Portland");
		musica7.setDuracao(3.56);
		musica7.setArtista(artista);
		musicaRepository.save(musica7);
/*
		Musica musica8 = new Musica();
		musica8.setNome("Sigo na Sombra");
		musica8.setDuracao(3.15);
		musica8.setArtista(artista);
		musicaRepository.save(musica8);




/*
		artista.setNome("BK");
		Artista artista1 = new Artista();
		artista1.setNome("MEDUZA");
		Artista artista2 = new Artista();
		artista2.setNome("Meek Mill");
		Artista artista3 = new Artista();
		artista3.setNome("Djonga");
		Artista artista4 = new Artista();
		artista4.setNome("Péricles");
		Artista artista5 = new Artista();
		artista5.setNome("Thiaguinho");
		Artista artista6 = new Artista();
		artista6.setNome("Cazuza");
		Artista artista7 = new Artista();
		artista7.setNome("Djavan");
		Artista artista8 = new Artista();
		artista8.setNome("Drake");
		Artista artista9 = new Artista();
		artista9.setNome("Menos é mais");
		Artista artista10 = new Artista();
		artista10.setNome("Kanye West");
		Artista artista11 = new Artista();
		artista11.setNome("Rael");
		Artista artista12 = new Artista();
		artista12.setNome("Natiruts");

		/*
		artistaRepository.save(artista);
		artistaRepository.save(artista1);
		artistaRepository.save(artista2);
		artistaRepository.save(artista3);
		artistaRepository.save(artista4);
		artistaRepository.save(artista5);
		artistaRepository.save(artista6);
		artistaRepository.save(artista7);
		artistaRepository.save(artista8);
		artistaRepository.save(artista9);
		artistaRepository.save(artista10);
		artistaRepository.save(artista11);
		artistaRepository.save(artista12);
		*/
