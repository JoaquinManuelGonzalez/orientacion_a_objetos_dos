package ar.edu.unlp.info.oo2.ej1_B_parte_2_extensiones;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;

public class BlackListHandler extends ConsoleHandler {

	private List<String> blackList;
	
	public BlackListHandler() {
		super();
		this.blackList = new ArrayList<String>();
	}
	
	public void addToBlackList(String word) {
		this.blackList.add(word);
	}
	
	public void removeFromBlackList(String word) {
		this.blackList.remove(word);
	}
	
	@Override
	public void publish(LogRecord record) {
		String message = record.getMessage();
		for (String word : this.blackList) {
			if (message.contains(word)) {
				record.setMessage(message.replace(word, "***"));
			}
		}
		super.publish(record);
	}
	
}
