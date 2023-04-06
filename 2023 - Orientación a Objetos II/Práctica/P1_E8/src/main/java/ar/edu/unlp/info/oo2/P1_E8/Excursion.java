package ar.edu.unlp.info.oo2.P1_E8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ExcursionState excursionS;
	
	public Excursion(String nom, LocalDate fInicio, LocalDate fFin, String pEnc, double cost, int cMx, int cMin) {
		this.nombre = nom;
		this.fechaInicio = fInicio;
		this.fechaFin = fFin;
		this.puntoEncuentro = pEnc;
		this.costo = cost;
		this.cupoMin = cMin;
		this.cupoMax = cMx;
		this.excursionS = new StateProvisoria(); // esto está bien?
	}
	
	public void inscribir(Usuario persona) {
		this.excursionS.inscribir(this, persona);
	}
	
	/* nuevas */
	public void cambiarState(ExcursionState nueState) {
		this.excursionS = nueState;
	}
	public void agregarUsuario(Usuario us) {
		this.usuarios.add(us);
	}
	public String getMails() {
		List<String> mails = this.usuarios.stream().map(usuario -> usuario.getMail()).collect(Collectors.toList());
		return String.join(", ", mails);
	}
	
	/* Getters */
	public int getCupoActual() {
		return this.usuarios.size();
	}
	public int getCupoMin() {
		return this.cupoMin;
	}
	public int getCupoMax() {
		return this.cupoMax;
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getCosto() {
		return this.costo;
	}
	public LocalDate getFechaIni() {
		return this.fechaInicio;
	} 
	public LocalDate getFechaFin() {
		return this.fechaFin;
	} 
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
}
