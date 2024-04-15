package ar.edu.unlp.info.oo2.ej8_ToDoItem;

import java.time.Duration;

public class Finished extends State {

	public Finished(ToDoItem task) {
		super(task);
		this.getTask().setFinishDate();
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
	public void addComment(String comment) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pending, pause o in-progress");
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(this.getTask().getStartDate(), this.getTask().getFinishDate());
	}

}
