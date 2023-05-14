package plataformaMusical;

public class Usuario {

    private String usuario;
    private String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario 		= usuario;
        this.contraseña 	= contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean checkearContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

}
