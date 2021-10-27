package highScores;

import gameEntries.GameEntry;

public class Scoreboard {
	
	private int numEntries = 0;
	private GameEntry[] board;
	private int capacity;
	
	public Scoreboard(int capacity) {
		this.capacity = capacity;
		board = new GameEntry[capacity];
	}
	
	/*
	public void addEntry(GameEntry entry) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		if (numEntries < board.length) {
			board[capacity-numEntries] = entry;
			numEntries++;
				
		
			}
	
		//}
		
		while (entry.getScore() > board[i].getScore()) { //this will only work if board[i] has a value in it!
			i++; //j will stop incrementing once entry is NOT greater than score of indice
		}
			j = i-1;
			while (numEntries >= board.length) {
				//if (j >= 2) { //while vs if??
				if (j >= 1) {
					//board[j-1] = entry; //remember, will not setScore(), because need to also include name of person who put highscore into the array

					//board[j] = entry;
					//board[j-2] = board[j-1]; //can only occur if board[j+1] exists. Thus, needs to still have space in the array
			
					board[j-1] = board[j];
					j--; //here, the last index to be replaced is [0], by [1]. the original value stored in [0] doesn't have to go anywhere
					
					board[i-1] = entry;
					}
			}
		}
		*/
	
	public void addEntry(GameEntry entry) {
		
		int newScore = entry.getScore();
		int j = capacity - 1;
		int k = 0;
		
		if (numEntries < board.length) {
			while (newScore < /*board[j].getScore()*/ 600) {
				j--;
			}
		}
		
		while ((k < j) && (k+1 <= capacity)) {
			board[k] = board[k+1];
			k++;
		}
		
		board[j].setScore(newScore);
	}
	
	public int getEntryByIndex(int index) {
		return board[index].getScore();
	}
}
	
	
	
	
	
	
	
	
	
	
	/*
	public void addEntry(GameEntry entry) {
		int newScore = entry.getScore();
		if (numEntries < board.length || newScore > board[numEntries-1].getScore()) {
			if (numEntries < board.length)
				numEntries++;
			int j = numEntries - 1;
			while (j > 0 && board[j-1].getScore() < newScore) {
				board[j] = board[j-1];
				j--;
			}
			board[j] = entry;
		}
	}
	*/
	
	
		//need to account for two different things: (1) if board is at full capacity, only add if new score is larger than one of the scores
		//in the scoreboard. Board doesn't have to be at full capacity.