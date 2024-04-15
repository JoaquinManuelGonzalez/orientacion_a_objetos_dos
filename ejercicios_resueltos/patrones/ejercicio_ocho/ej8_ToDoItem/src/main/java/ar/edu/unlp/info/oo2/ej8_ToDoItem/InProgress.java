package ar.edu.unlp.info.oo2.ej8_ToDoItem;

public class InProgress extends State {

	public InProgress(ToDoItem task) {
		super(task);
		this.getTask().setStartDate();
	}

	@Override
	public void togglePause() {
		this.getTask().changeState(new Paused(this.getTask()));
	}

	@Override
	public void finish() {
		this.getTask().changeState(new Finished(this.getTask()));
	}

}
