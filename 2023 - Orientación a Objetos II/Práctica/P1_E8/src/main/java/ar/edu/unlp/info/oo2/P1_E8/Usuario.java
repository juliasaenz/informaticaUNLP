package ar.edu.unlp.info.oo2.P1_E8;

public class Usuario {
	private String nombre;
	private String mail;
	
	public Usuario(String n, String mail) {
		this.nombre = n;
		this.mail = mail;
	}
	
	public void inscribir(Excursion e) {
		e.inscribir(this);
	}
	
	public String getMail() {
		return this.mail;
	}
	

}
