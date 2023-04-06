package ar.edu.unlp.info.oo2.P1_E7;

import java.time.Duration;
import java.time.LocalDateTime;

public class ItemFinished extends ToDoItemState{
	

	@Override
	public void start(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Este item ya fue empezado");
	}

	@Override
	public void togglePause(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Este item ya fue finalizado");
	}

	@Override
	public void finish(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Este item ya fue finalizado");
	}

	@Override
	public Duration workedTime(ToDoItem toDo) {
		// TODO Auto-generated method stub
		return Duration.between(toDo.getFechaInicio(), toDo.getFechaFin());
	}

	@Override
	public void addComment(ToDoItem toDo, String comment) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se pueden agregar comentariso a items finalizados");
	}

}
