package ar.edu.unlp.info.oo2.ej8_ToDoItem;

import java.time.Duration;

public class Pending extends State {

	public Pending(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {
		this.getTask().changeState(new InProgress(this.getTask()));
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause, in-progress o finished");
	}

}
