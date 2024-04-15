package ar.edu.unlp.info.oo2.ej8_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime finishDate;
	private List<String> comments;
	private State state = new Pending(this);
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<String>();
	}
	
	public void setStartDate() {
		this.startDate = LocalDateTime.now();
	}
	
	public void setFinishDate() {
		this.finishDate = LocalDateTime.now();
	}
	
	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getFinishDate() {
		return finishDate;
	}
	
	public List<String> getComments() {
		return this.comments;
	}
	
	public State getState() {
		return this.state;
	}
	
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.getState().start();
	}
	
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.getState().addComment(comment);
	}
	
	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		return this.getState().workedTime();
	}
	
	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.getState().finish();
	}
	
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.getState().togglePause();
	}
	
	public void changeState(State newState) {
		this.state = newState;
	}

}
