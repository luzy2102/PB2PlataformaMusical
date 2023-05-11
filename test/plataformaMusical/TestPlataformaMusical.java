package plataformaMusical;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestPlataformaMusical {

private Plataforma plataforma;
	
	@Before
	  public void setUp() {
	    plataforma = new Plataforma();
	  }

	@Test
	public void AutenticarUsuario() {
		Usuario usuario = plataforma.registrarUsuario("patricio", "password");
	    assertNotNull(usuario);
	    assertEquals("patricio", usuario.getUsuario());
	    assertTrue(usuario.checkearContraseña("password"));
	}
	
	@Test
	  public void CrearUnaCancionEnLaPlataforma() {
	    Artista artista = plataforma.crearArtista("Queen", "Rock");
	    Album album = plataforma.crearAlbum("Sheer Heart Attack", artista, 1980);
	    Cancion cancion = plataforma.crearCancion("Misfire", artista, album, 200);
	    assertNotNull(cancion);
	    assertEquals("Misfire", cancion.getTitulo());
	    assertEquals(artista, cancion.getArtista());
	    assertEquals(album, cancion.getAlbum());
	  }
	  
	  @Test
	  public void AgregarCancionesAUnaPlaylist() {
	    Usuario usuario = plataforma.registrarUsuario("patricio", "password");
	    Artista artista = plataforma.crearArtista("Queen", "Rock");
	    Album album = plataforma.crearAlbum("Sheer Heart Attack", artista, 1980);
	    Cancion cancion = plataforma.crearCancion("Misfire", artista, album, 200);
	    Playlist playlist = plataforma.crearPlaylist("Mi playlist", usuario);
	    assertTrue(playlist.agregarCancion(cancion));
	    assertTrue(playlist.getCanciones().contains(cancion));
	  }
	  
	  @Test
	  public void EliminarCancionesDeUnaPlaylist() {
		Usuario usuario = plataforma.registrarUsuario("patricio", "password");
		Artista artista = plataforma.crearArtista("Queen", "Rock");
		Album album = plataforma.crearAlbum("Sheer Heart Attack", artista, 1980);
		Cancion cancion = plataforma.crearCancion("Misfire", artista, album, 200);
		Playlist playlist = plataforma.crearPlaylist("Mi playlist", usuario);
	    playlist.agregarCancion(cancion);
	    assertTrue(playlist.eliminarCancion(cancion));
	    assertFalse(playlist.getCanciones().contains(cancion));
	  }
	  
	  @Test
	  public void ObtenerListaDeTodosLosArtistasDeLaPlataforma() {
	    Artista artista1 = plataforma.crearArtista("Queen", "Rock");
	    Artista artista2 = plataforma.crearArtista("David Bowie", "Rock");
	    Set<Artista> artistas = plataforma.getTodosLosArtistas();
	    assertEquals(2, artistas.size());
	    assertTrue(artistas.contains(artista1));
	    assertTrue(artistas.contains(artista2));
	  }	
}
