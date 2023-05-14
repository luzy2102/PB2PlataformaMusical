package plataformaMusical;

public class Artista {

    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Artista) {
            Artista other = (Artista) obj;
            return nombre.equals(other.nombre) && genero.equals(other.genero);
        }
        return false;
    }

}
