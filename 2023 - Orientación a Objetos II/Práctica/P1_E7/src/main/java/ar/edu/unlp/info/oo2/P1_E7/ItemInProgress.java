package ar.edu.unlp.info.oo2.P1_E7;

import java.time.Duration;
import java.time.LocalDateTime;

public class ItemInProgress extends ToDoItemState{

	@Override
	public void start(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Este item ya fue empezado");
	}

	@Override
	public void togglePause(ToDoItem toDo) {
		// TODO Auto-generated method stub
		toDo.changeState( new ItemPaused() );
	}

	@Override
	public void finish(ToDoItem toDo) {
		// TODO Auto-generated method stub
		toDo.changeState( new ItemFinished() );
		toDo.setFechaFin( LocalDateTime.now() ); // esto puede que es

	}

	@Override
	public Duration workedTime(ToDoItem toDo) {
		// TODO Auto-generated method stub
		return Duration.between(toDo.getFechaInicio(), LocalDateTime.now());
	}

	@Override
	public void addComment(ToDoItem toDo, String comment) {
		// TODO Auto-generated method stub
		toDo.setComment(comment);	
	}

}
