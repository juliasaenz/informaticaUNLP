package ar.edu.unlp.indo.oo2.P1_E1;

public class Tweet {
	
	private String texto;
	private Usuario creador;
	
	public Tweet(Usuario usuario, String t) {
		this.creador = usuario;
		this.texto = t;
	}
	
	public Usuario getUsuario() {
		return this.creador;
	}
	
	public String getTexto() {
		return this.texto;
	}

}
