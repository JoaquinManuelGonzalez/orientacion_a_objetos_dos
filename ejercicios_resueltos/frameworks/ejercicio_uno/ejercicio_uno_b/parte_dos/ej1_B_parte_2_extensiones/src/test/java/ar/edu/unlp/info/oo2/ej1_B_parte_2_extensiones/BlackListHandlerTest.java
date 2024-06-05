package ar.edu.unlp.info.oo2.ej1_B_parte_2_extensiones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackListHandlerTest {

	private BlackListHandler handler;
    private List<String> blacklist;

    @BeforeEach
    void setUp() {
        blacklist = new ArrayList<>();
        blacklist.add("switch-statements");
        blacklist.add("feature-envy");
        handler = new BlackListHandler();
    }

    @Test
    void testPublish_WithBlacklistedWord() {
        LogRecord record = new LogRecord(Level.INFO, "I love switch-statements");
        handler.publish(record);
        assertEquals("I love ***", record.getMessage());
    }

    @Test
    void testPublish_WithoutBlacklistedWord() {
        LogRecord record = new LogRecord(Level.INFO, "This is a normal message.");
        handler.publish(record);
        assertEquals("This is a normal message.", record.getMessage());
    }

    @Test
    void testAddToBlacklist() {
        handler.addToBlackList("bad-smells");
        LogRecord record = new LogRecord(Level.INFO, "You have to code with bad-smells");
        handler.publish(record);
        assertEquals("You have to code with ***", record.getMessage());
    }

    @Test
    void testRemoveFromBlacklist() {
    	handler.removeFromBlackList("bad-smells");
        LogRecord record = new LogRecord(Level.INFO, "You have to code with bad-smells");
        handler.publish(record);
        assertEquals("You have to code with bad-smells", record.getMessage());
    }

    @Test
    void testPublish_WithMultipleBlacklistedWords() {
        LogRecord record = new LogRecord(Level.INFO, "This code has feature-envy and switch-statements");
        handler.publish(record);
        assertEquals("This code has *** and ***", record.getMessage());
    }

}
