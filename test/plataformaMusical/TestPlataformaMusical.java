package plataformaMusical;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
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
	  
	  @Test
	  public void ObtenerCancionesDeUnDisco() {
	    Artista artista = plataforma.crearArtista("Queen", "Rock");
	    Album album = plataforma.crearAlbum("Sheer Heart Attack", artista, 1980);
	    Cancion cancion1 = plataforma.crearCancion("Mistify", artista, album, 120);
	    Cancion cancion2 = plataforma.crearCancion("Sheer Heart Attack", artista, album, 130);
	    Cancion cancion3 = plataforma.crearCancion("Stone Cold Crazy", artista, album, 150);
	    album.agregarCancion(cancion1);
	    album.agregarCancion(cancion2);
	    album.agregarCancion(cancion3);
	      
	    Set<Cancion> cancionesEnElDisco = album.getCanciones();
	    Set<Cancion> cancionesEsperadas = new LinkedHashSet<>();
	    cancionesEsperadas.add(cancion1);
	    cancionesEsperadas.add(cancion2);
	    cancionesEsperadas.add(cancion3);
	    assertEquals(cancionesEnElDisco, cancionesEsperadas);
	  }
	  
	  public void ObtenerDuracionDeUnDisco() {
	    Artista artista = new Artista("Queen", "Rock");
	    Album album = new Album("Sheer Heart Attack", artista, 1980);
	    Cancion cancion1 = new Cancion("Sheer Heart Attack", artista, album, 120);
	    Cancion cancion2 = new Cancion("Mistify", artista, album, 180);
	    Cancion cancion3 = new Cancion("Stone Cold Crazy", artista, album, 240);
	        
	    album.agregarCancion(cancion1);
	    album.agregarCancion(cancion2);
	    album.agregarCancion(cancion3);
	        
	    int duracionEsperada = cancion1.getDuracion() + cancion2.getDuracion() + cancion3.getDuracion();
	    int duracionObtenida = album.obtenerDuracion();
	        
	    assertEquals(duracionEsperada, duracionObtenida);
	  }
	  
	  @Test
	  public void ObtenerCancionesDeUnaPlaylist() {
	    Usuario usuario1 = plataforma.registrarUsuario("Patricio", "password");
	    Artista artista = plataforma.crearArtista("Queen", "Rock");
	    Album album = plataforma.crearAlbum("Sheer Heart Attack", artista, 1980);
	    Cancion cancion1 = plataforma.crearCancion("Mistify", artista, album, 200);
	    Cancion cancion2 = plataforma.crearCancion("Sheer Heart Attack", artista, album, 200);
	    Playlist playlist = plataforma.crearPlaylist("Mi playlist", usuario1);
	    assertTrue(playlist.agregarCancion(cancion1));
	    assertTrue(playlist.agregarCancion(cancion2));
	      
	    Set<Cancion> cancionesEnPlaylist = playlist.getCanciones();
	    Set<Cancion> cancionesEsperadas = new LinkedHashSet<>();
	    cancionesEsperadas.add(cancion1);
	    cancionesEsperadas.add(cancion2);
	    assertEquals(cancionesEnPlaylist, cancionesEsperadas);
	  }
	  
	  @Test
	  public void ObtenerPlaylistPorNombre() {
	    Usuario usuario = plataforma.registrarUsuario("Patricio", "password");
	    Playlist playlist = plataforma.crearPlaylist("Mi playlist", usuario);
	    Playlist playlistObtenida = plataforma.getPlaylistPorNombre("Mi playlist");
	    assertEquals(playlist, playlistObtenida);
	  }
	  
	  @Test
	  public void ObtenerUsuarioPorNombre() {
	    Usuario usuario = plataforma.registrarUsuario("Patricio", "password");
	    Usuario usuarioObtenido = plataforma.getusuarioPorNombre("Patricio");
	    assertEquals(usuario, usuarioObtenido);
	  }
}
