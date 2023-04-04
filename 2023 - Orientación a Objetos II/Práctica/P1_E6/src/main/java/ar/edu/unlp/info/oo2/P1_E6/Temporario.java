package ar.edu.unlp.info.oo2.P1_E6;

public class Temporario extends Empleado{
	
	private int horasTrabajo;
	
	public Temporario(String nom, int horas, boolean casado, int hijos) {
		super(nom,casado,hijos);
		this.horasTrabajo = horas;
	}

	@Override
	public double sueldoBasico() {
		// TODO Auto-generated method stub
		return 20000 + ( 300 * this.horasTrabajo );
	}

	@Override
	public double sueldoAdicional() {
		// TODO Auto-generated method stub
		double extra = 0;
		if ( this.getCasado() ) {
			extra += 5000;
		}
		return extra + ( 2000 * this.getCantHijos() );
	}


}
