package ar.edu.unlp.info.oo2.P1_E7;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;

public abstract class ToDoItem {
	
	private String name;
	private ToDoItemState state;
	private String comment;
	private LocalDateTime fechaInicio, fechaFin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new ItemPending();
	}
	
	public void start() {
		this.state.start(this);
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);
		
	}
	
	public void addComment(String comment) {
		this.state.addComment(this, comment);
	}
	
	/* Estos son los métodos que me generan duda */
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void changeState(ToDoItemState newState) {
		this.state = newState;
	}
	
	public void setFechaInicio(LocalDateTime ini ) {
		this.fechaInicio = ini;
	}
	
	public LocalDateTime getFechaInicio() {
		return this.fechaInicio;
	}
	
	public void setFechaFin(LocalDateTime ini ) {
		this.fechaFin = ini;
	}
	
	public LocalDateTime getFechaFin() {
		return this.fechaFin;
	}

}
