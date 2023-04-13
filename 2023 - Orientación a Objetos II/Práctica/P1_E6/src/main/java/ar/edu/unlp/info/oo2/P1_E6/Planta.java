package ar.edu.unlp.info.oo2.P1_E6;

public class Planta extends Empleado{
	private int antiguedad;

	public Planta(String nom, boolean casado, int cantH, int antiguedad) {
		super(nom, casado, cantH);
		this.antiguedad = antiguedad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoBasico() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public double sueldoAdicional() {
		// TODO Auto-generated method stub
		double extra = 0;
		if ( this.getCasado() ) {
			extra += 5000;
		}
		return  extra + ( 2000 * this.getCantHijos() ) + ( 2000 * this.antiguedad );
	}


}
