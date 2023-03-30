package ar.edu.unlp.indo.oo2.P1_E1;
import  java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	
	public Usuario( String nombre ) {
		this.screenName = nombre; 
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public void crearTweet( String texto ) {
		// Si el texto tiene la cantidad de caracteres, crea un twit 
		// y lo agrega a los twits del usuario
		if( texto.length() > 0 && texto.length() <= 280 ) {
			tweets.add(new Tweet(this, texto));
		}
	}
	
	public String getUltimoTweet() {
		return tweets.get(tweets.size() - 1).getTexto();
	}
	
	public void reTweet ( Tweet twit ) {
		tweets.add(new ReTweet(this, twit));
	}
	
	public void eliminarTweets() {
		// Elimina todos los twits del usuario
		this.tweets.clear();
	}
	

}
