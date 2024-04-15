package ar.edu.unlp.info.oo2.ej8_ToDoItem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	
	private ToDoItem taskSinIniciar;
	private ToDoItem taskInProgress;
	private ToDoItem taskPaused;
	private ToDoItem taskFinished;

	@BeforeEach
	void setUp() throws Exception {
		taskSinIniciar = new ToDoItem("task 1");
		taskInProgress = new ToDoItem("task 2");
		taskPaused = new ToDoItem("task 3");
		taskFinished = new ToDoItem("task 4");
		
		taskInProgress.changeState(new InProgress(taskInProgress));
		taskPaused.changeState(new Paused(taskPaused));
		taskFinished.changeState(new Finished(taskFinished));
	}

	@Test
	void testTaskSinIniciarStart() {
		taskSinIniciar.start();
		assertTrue(taskSinIniciar.getState() instanceof InProgress);
	}
	
	@Test
	void testTaskSinIniciarFinish() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskSinIniciar.finish();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Test
	void testTaskSinIniciarWorkedTime() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskSinIniciar.workedTime();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pause, in-progress o finished");
	}
	
	@Test
	void testTaskSinIniciarAddComment() {
		taskSinIniciar.addComment("hola");
		assertEquals(1, taskSinIniciar.getComments().size());
	}
	
	@Test
	void testTaskSinIniciarTogglePause() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskSinIniciar.togglePause();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Test
	void testTaskPausedStart() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskPaused.start();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pending");
	}
	
	@Test
	void testTaskPausedFinish() {
		taskPaused.finish();
		assertTrue(taskPaused.getState() instanceof Finished);
	}
	
	@Test
	void testTaskPausedWorkedTime() {
		/*
		 * No se puede testear porque las fechas varían por
		 * milisegundos.
		 */
	}
	
	@Test
	void testTaskPausedAddComment() {
		taskPaused.addComment("hola");
		assertEquals(1, taskPaused.getComments().size());
	}
	
	@Test
	void testTaskPausedTogglePause() {
		taskPaused.togglePause();
		assertTrue(taskPaused.getState() instanceof InProgress);
	}
	
	@Test
	void testTaskInProgressStart() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskInProgress.start();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pending");
	}
	
	@Test
	void testTaskInProgressFinish() {
		taskInProgress.finish();
		assertTrue(taskInProgress.getState() instanceof Finished);
	}
	
	@Test
	void testTaskInProgressWorkedTime() {
		/*
		 * No se puede testear porque las fechas varían por
		 * milisegundos.
		 */
	}
	
	@Test
	void testTaskInProgressAddComment() {
		taskInProgress.addComment("hola");
		assertEquals(1, taskInProgress.getComments().size());
	}
	
	@Test
	void testTaskInProgressTogglePause() {
		taskInProgress.togglePause();
		assertTrue(taskInProgress.getState() instanceof Paused);
	}
	
	@Test
	void testTaskFinishedStart() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskFinished.start();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pending");
	}
	
	@Test
	void testTaskFinishedFinish() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskFinished.finish();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Test
	void testTaskFinishedWorkedTime() {
		/*
		 * No se puede testear porque las fechas varían por
		 * milisegundos.
		 */
	}
	
	@Test
	void testTaskFinishedAddComment() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskFinished.addComment("hola");
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pending, pause o in-progress");
	}
	
	@Test
	void testTaskFinishedTogglePause() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			taskFinished.togglePause();
			});
        assertEquals(excepcion.getMessage(), "El objeto ToDoItem no se encuentra en pause o in-progress");
	}

}
