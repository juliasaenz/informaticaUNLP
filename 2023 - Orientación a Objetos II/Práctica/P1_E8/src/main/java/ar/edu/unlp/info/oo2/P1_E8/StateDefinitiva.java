package ar.edu.unlp.info.oo2.P1_E8;

public class StateDefinitiva extends ExcursionState {

	@Override
	public void inscribir(Excursion exc, Usuario us) {
		// TODO Auto-generated method stub
		// agrega el usuario y si el cupo es máyor o igual al mínimo, cambia a definitiva
		
		if(exc.getCupoActual() <= exc.getCupoMax() ) {
			exc.agregarUsuario(us);
		} else {
			exc.cambiarState(new StateLlena());
			throw new RuntimeException(" La excursión está llena, no se hizo la inscripción");
		}
	}

	@Override
	public String informacion(Excursion exc)  {
		// TODO Auto-generated method stub
		return 
				"La excursión " + exc.getNombre() +
				" cuesta " + exc.getCosto() + 
				" empieza el " + exc.getFechaIni() + " y termina el " + exc.getFechaFin() +
				", encontrandose en " + exc.getPuntoEncuentro() +
				". Los mails de los inscriptos son: " + exc.getMails() + 
				". Faltan " + ( exc.getCupoMin() - exc.getCupoActual()) + " personas para alcanzar el cupo mínimo";
	}

}
