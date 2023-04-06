package ar.edu.unlp.info.oo2.P1_E8;

public class StateLlena extends ExcursionState {
	
	@Override
	public void inscribir(Excursion exc, Usuario us) {
		// TODO Auto-generated method stub
		throw new RuntimeException(" La excursión está llena, no se hizo la inscripción");
	}

	@Override
	public String informacion(Excursion exc) {
		// TODO Auto-generated method stub
		return 
				"La excursión " + exc.getNombre() +
				" cuesta " + exc.getCosto() + 
				" empieza el " + exc.getFechaIni() + " y termina el " + exc.getFechaFin() +
				", encontrandose en " + exc.getPuntoEncuentro(); }

}
