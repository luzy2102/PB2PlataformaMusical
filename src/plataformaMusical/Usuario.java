package plataformaMusical;

public class Usuario {

    private String usuario;
    private String contrasenia;

    public Usuario(String usuario, String contrasenia) {
        this.usuario 		= usuario;
        this.contrasenia 	= contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean checkearContrasenia(String contrasenia) {
        return this.contrasenia.equals(contrasenia);
    }

}
