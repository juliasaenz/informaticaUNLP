package ar.edu.unlp.info.oo2.P1_E6;

public class Pasante extends Empleado {
	
	private int cantExamenes;


	public Pasante(String nom, boolean casado, int cantH, int cantE) {
		super(nom, casado, cantH);
		this.cantExamenes = cantE;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoBasico() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public double sueldoAdicional() {
		// TODO Auto-generated method stub
		return 2000 * this.cantExamenes;
	}


}
