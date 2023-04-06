package ar.edu.unlp.info.oo2.P1_E8;

public class StateProvisoria extends ExcursionState {

	@Override
	public void inscribir(Excursion exc, Usuario us) {
		// TODO Auto-generated method stub
		// agrega el usuario y si el cupo es máyor o igual al mínimo, cambia a definitiva
		exc.agregarUsuario(us);
		if(exc.getCupoActual() >= exc.getCupoMin() ) {
			exc.cambiarState(new StateDefinitiva());
		}
	}

	@Override
	public String informacion(Excursion exc) {
		// TODO Auto-generated method stub
		return 
				"La excursión " + exc.getNombre() +
				" cuesta " + exc.getCosto() + 
				" empieza el " + exc.getFechaIni() + " y termina el " + exc.getFechaFin() +
				", encontrandose en " + exc.getPuntoEncuentro() +
				". Faltan " + ( exc.getCupoMin() - exc.getCupoActual()) + " personas para alcanzar el cupo mínimo";
	}

}
