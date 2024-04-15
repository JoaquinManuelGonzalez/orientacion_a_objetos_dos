package ar.edu.unlp.info.oo2.ej8_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
	
	private ToDoItem task;

	public State(ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return task;
	}
	
	public Duration workedTime() {
		return Duration.between(this.getTask().getStartDate(), LocalDateTime.now());
	}
	
	public void start() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pending");
	}
	
	public void addComment(String comment) {
		this.getTask().getComments().add(comment);
	}
	
	public abstract void togglePause();
	
	public abstract void finish();
	

}
