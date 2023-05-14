package plataformaMusical;

public class Cancion {

    private Album album;
    private int duracion;

    public Cancion(String titulo, Artista artista, Album album, int año) {
        super(titulo, artista, año);

        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
    }

}
