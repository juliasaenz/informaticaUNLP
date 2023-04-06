package ar.edu.unlp.info.oo2.P1_E7;

import java.time.Duration;

public abstract class ToDoItemState {

	public abstract void start(ToDoItem toDo);
	
	public abstract void togglePause(ToDoItem toDo);
	
	public abstract void finish(ToDoItem toDo);
	
	public abstract Duration workedTime(ToDoItem toDo);
	
	public abstract void addComment(ToDoItem toDo, String comment);
}
