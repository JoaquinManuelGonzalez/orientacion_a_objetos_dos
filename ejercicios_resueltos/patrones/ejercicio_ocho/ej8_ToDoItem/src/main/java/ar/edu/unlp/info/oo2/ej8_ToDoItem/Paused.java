package ar.edu.unlp.info.oo2.ej8_ToDoItem;

public class Paused extends State {

	public Paused(ToDoItem task) {
		super(task);
	}

	@Override
	public void togglePause() {
		this.getTask().changeState(new InProgress(this.getTask()));
	}

	@Override
	public void finish() {
		this.getTask().changeState(new Finished(this.getTask()));
	}
	
}
