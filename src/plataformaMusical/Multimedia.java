package plataformaMusical;

public class Multimedia {
    //Multimedia es una clase abstracta que sirve para representar los elementos en común que tienen "Album" y "Cancion"
    private String titulo;
    private Artista artista;
    private int anio;

    public Multimedia(String titulo, Artista artista, int anio) {
        this.titulo 	= titulo;
        this.artista 	= artista;
        this.anio 		= anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
