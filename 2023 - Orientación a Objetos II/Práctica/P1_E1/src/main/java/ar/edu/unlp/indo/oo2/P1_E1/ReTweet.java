package ar.edu.unlp.indo.oo2.P1_E1;

public class ReTweet extends Tweet{
	
	private Tweet original; 

	public ReTweet(Usuario usuario, Tweet twit) {
		super(usuario , twit.getTexto() );
		this.original = twit;
		// TODO Auto-generated constructor stub
	}
	

}
