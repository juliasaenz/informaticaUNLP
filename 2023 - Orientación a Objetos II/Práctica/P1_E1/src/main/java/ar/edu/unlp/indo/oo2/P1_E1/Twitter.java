package ar.edu.unlp.indo.oo2.P1_E1;
import  java.util.ArrayList;

public class Twitter {
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Twitter() {
		
	}
	
	public void crearUsuario( String nombre ) {
		// si no existe un usuario con este nombre, crear el usuario y agregar a la lista
		if( !usuarios.stream().anyMatch(usuario->usuario.getScreenName().equals(nombre)) ) {
			usuarios.add(new Usuario(nombre));
		}
	}
	
	public void eliminarUsuario ( Usuario user ) {
		Usuario aBorrar = usuarios.stream()
		.filter(usuario -> usuario.equals(user) )
		.findFirst().orElse(null);
		
		aBorrar.eliminarTweets();
		usuarios.remove(aBorrar);
	}

}
