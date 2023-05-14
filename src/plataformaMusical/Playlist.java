package plataformaMusical;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Playlist {

    private Usuario usuario;
    private String nombre;
    private Set<Cancion> canciones;

    public Playlist(String nombre, Usuario usuario) {
        this.nombre 	 = nombre;
        this.usuario   = usuario;
        this.canciones = new LinkedHashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean agregarCancion(Cancion cancion) {
        return canciones.add(cancion);
    }

    public boolean eliminarCancion(Cancion cancion) {
        return canciones.remove(cancion);
    }

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canciones);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Playlist other = (Playlist) obj;
        return Objects.equals(canciones, other.canciones);
    }


}
