package ar.edu.unlp.info.oo2.P1_E7;

import java.time.Duration;
import java.time.LocalDateTime;

public class ItemPending extends ToDoItemState{

	@Override
	public void start(ToDoItem toDo) {
		// TODO Auto-generated method stub
		toDo.changeState( new ItemInProgress() );
		toDo.setFechaInicio( LocalDateTime.now() ); // esto puede que es
	}

	@Override
	public void togglePause(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede pausar o reanudar un item no empezado");
	}

	@Override
	public void finish(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("No se puede finalizar un item no empezado");
	}

	@Override
	public Duration workedTime(ToDoItem toDo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Este item todavía no se inició");
	}

	@Override
	public void addComment(ToDoItem toDo, String comment) {
		// TODO Auto-generated method stub
		toDo.setComment(comment);		
	}

}
