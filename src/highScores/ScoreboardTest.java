package highScores;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gameEntries.GameEntry;
//import Scoreboard;

class ScoreboardTest {
	
	Scoreboard e;
	Scoreboard2 f;
	
	GameEntry five;
	GameEntry two;
	GameEntry six;
	GameEntry[] board;

	@BeforeEach
	void setUpBeforeClass() throws Exception { //make sure tests aren't static!
		int capacity = 3;
		e = new Scoreboard(capacity);
		f = new Scoreboard2(capacity);
		five = new GameEntry("Tom", 500);
		two = new GameEntry("Jim", 200);
		six = new GameEntry("John", 600);
		board = new GameEntry[capacity];
	}
	
	@Test
	void testCapacity() {
		assertEquals(3, board.length);
	}
	
	@Test
	void throwOutOfBoundsError() {
		assertTrue(board[2] == null);
		//assertTrue(board[3] == null);
	}
	
	@Test
	void testNull() {
		assertEquals(null, board[0]);
	}

	@Test
	void testAddFirstEntryToList() throws HighScoreErrorException {
		
		//e.addEntry(five);
		//e.addEntry(two);
		//e.addEntry(six);
		
		f.addEntry(five);
		assertEquals(500, f.board[2].getScore());	//important: need to reference board of Scoreboard2, NOT board by itself, since this will be null even after addEntry() is done
		//assertEquals(200, e.getEntryByIndex(2));
		//assertEquals(600, e.getEntryByIndex(0));
	}
	
	@Test
	void testAddEntryToList() throws HighScoreErrorException {
		
		//e.addEntry(five);
		//e.addEntry(two);
		//e.addEntry(six);
		
		f.addEntry(five);
		assertEquals(500, f.board[2].getScore());	//important: need to reference board of Scoreboard2, NOT board by itself, since this will be null even after addEntry() is done
		f.addEntry(two);
		assertEquals(200, f.board[1].getScore());
		f.addEntry(six);
		//assertEquals(200, e.getEntryByIndex(2));
		//assertEquals(600, f.board[0].getScore());
		assertEquals(200, f.board[0].getScore()); //200 moves to index 0 after adding 600 in, which goes to index 2 and 500 goes to index 1
	}
	
	@Test
	void testAddEntryToFullList() throws HighScoreErrorException {
		int capacity = 4;
		f = new Scoreboard2(capacity);
		GameEntry eight = new GameEntry("Alana", 800);
		GameEntry nine = new GameEntry("Larry", 900);
		GameEntry eleven = new GameEntry("Gabby", 1100);

		f.addEntry(five);
		assertEquals(500, f.board[3].getScore());	//important: need to reference board of Scoreboard2, NOT board by itself, since this will be null even after addEntry() is done
		f.addEntry(two);
		assertEquals(200, f.board[2].getScore());
		f.addEntry(six);
		//assertEquals(200, e.getEntryByIndex(2));
		//assertEquals(600, f.board[0].getScore());
		assertEquals(200, f.board[1].getScore());
		f.addEntry(eight);
		assertEquals(800, f.board[3].getScore());
		f.addEntry(nine);
		assertEquals(500, f.board[0].getScore());
		f.addEntry(eleven);
		assertEquals(600, f.board[0].getScore());


	}
}
