package plataformaMusical;

public class Cancion extends Multimedia{

    private Album album;
    private int duracion;

    public Cancion(String titulo, Artista artista, Album album, int anio) {
        super(titulo, artista, anio);

        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
    }

}
