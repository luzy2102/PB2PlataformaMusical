package plataformaMusical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Plataforma {

    private Set<Artista> artistas;
    private Set<Album> albumes;
    private Set<Cancion> canciones;
    private List<Usuario> usuarios;
    private List<Playlist> playlists;

    public Plataforma() {
        this.artistas 	= new HashSet<>();
        this.albumes		= new HashSet<>();
        this.canciones 	= new HashSet<>();
        this.usuarios 	= new ArrayList<>();
        this.playlists 	= new ArrayList<>();
    }

    public Artista crearArtista(String nombre, String genero) {
        Artista artista = new Artista(nombre, genero);
        artistas.add(artista);
        return artista;
    }

    public Album crearAlbum(String titulo, Artista artista, int año) {
        Album album = new Album(titulo, artista, año);
        albumes.add(album);
        return album;
    }

    public Cancion crearCancion(String titulo, Artista artista, Album album, int año) {
        Cancion cancion = new Cancion(titulo, artista, album, año);
        canciones.add(cancion);
        return cancion;
    }

    public Playlist crearPlaylist(String nombre, Usuario usuario) {
        Playlist playlist = new Playlist(nombre, usuario);
        playlists.add(playlist);
        return playlist;
    }

    public Usuario registrarUsuario(String nombreUsuario, String contraseña) {
        Usuario usuario = new Usuario(nombreUsuario, contraseña);
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario getusuarioPorNombre(String nombreUsuario) {
        return usuarios.stream().filter(u -> u.getUsuario().equals(nombreUsuario)).findFirst().orElse(null);
    }

    public Playlist getPlaylistPorNombre(String nombre) {
        return playlists.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public boolean AgregarCancionesAPlaylist(Cancion cancion, Playlist playlist) {
        if (playlist.getCanciones().contains(cancion)) {
            return false;
        }
        playlist.agregarCancion(cancion);
        return true;
    }

    public Set<Artista> getTodosLosArtistas() {
        return artistas;
    }

    public Set<Album> getTodosLosAlbumes() {
        return albumes;
    }

    public Set<Cancion> getTodasLasCanciones() {
        return canciones;
    }

    public List<Playlist> getTodasLasPlaylist() {
        return playlists;
    }

}
