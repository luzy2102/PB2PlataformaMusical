package plataformaMusical;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Album {

    private Set<Cancion> canciones = new LinkedHashSet<>();

    public Album(String titulo, Artista artista, int año) {
        super(titulo, artista, año);
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    public int obtenerDuracion() {
        int duracion = 0;
        for (Cancion cancion : canciones) {
            duracion += cancion.getDuracion();
        }
        return duracion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((canciones == null) ? 0 : canciones.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Album album = (Album) obj;
        return Objects.equals(getTitulo(), album.getTitulo()) &&
                Objects.equals(getArtista(), album.getArtista()) &&
                getAño() == album.getAño();
    }

}
