package plataformaMusical;

public class Multimedia {
    //Multimedia es una clase abstracta que sirve para representar los elementos en común que tienen "Album" y "Cancion"
    private String titulo;
    private Artista artista;
    private int año;

    public Multimedia(String titulo, Artista artista, int año) {
        this.titulo 	= titulo;
        this.artista 	= artista;
        this.año 		= año;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
