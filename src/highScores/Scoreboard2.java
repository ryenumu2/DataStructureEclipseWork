package highScores;

import gameEntries.GameEntry;

public class Scoreboard2 {

	private int numEntries = 0;
	GameEntry[] board;
	private int capacity;

	public Scoreboard2(int capacity) {
		this.capacity = capacity;
		board = new GameEntry[capacity];
	}

public void addEntry(GameEntry entry) {
		
		int newScore = entry.getScore();
		int j = capacity - 1;
		//int k = 0;
		int k2 = 0;
		int k3 = 0;
		
		if (numEntries == 0) {
			board[capacity-1] = entry;
			numEntries++;
		} //purpose: always will add entry to last index if array is completely empty before
		else {
			if (numEntries < capacity) { //if capacity is 3, condition passes if number of Entries is 1 or 2: there are still empty boxes in array
				while (entry.getScore() < board[j].getScore()) { //while entry being passed in is less than each index starting from last index, going to the left 
					j--;
					if (board[j] == null) { //stop decrementing if current box is empty
						board[j] = entry; //condition that adds number to scoreboard when current scoreboard box is null
						numEntries++;
						return; //need to exit method once entry is added.
					}
				}
				//if above condition doesn't get turned on (i.e while statement above doesn't run, set variable k to j, as shown below)

				
				while ((k2 < j) && (board[k2] == null || board[k2].getScore() < entry.getScore())) { //k2 will increment, going up one index at a time, ONLY if the value is less than the entry trying to be added
					//remember: ideally, want to have the logic cleared out BEFORE you attempt the code, so make sure you are solid with the logic and can make sure it's foolproof!
					board[k2] = board[k2+1];//understand what this means: the left side will replace its value with whatever is in board[k2+1]!!
					k2++;
				}
				board[k2] = entry;
				//numEntries++;	
				return;
			}
			//need situation where numEntries is equal to capacity: if new score is greater than an index entry, need to displace lowest score to make way for it
			//this is much easier to implement
			
			if (numEntries == capacity) {
				while (j >= 0) {
					if (entry.getScore() > board[j].getScore()) {
						k3 = j;
						while (k3 >= 1) {
						board[k3-1] = board[k3];
						}
						board[j] = entry;
					}
					else {
					j--;
					}
					return;
				}
				
			}
		}
}

//when explaining video: break up problem into smaller pieces
//situation where array is completely empty: where will the first score be placed?
/*situation where array is not completely full: where do I put the new score? If the new score is greater than 
*the score already in the array, I need a separate situation that will move that array to the side, and 
*put the new score in that place. Otherwise, simply let the score be in the next empty array bin
*/
//situation where array is completely full, and need to add an entry into array that's 
//greater than lowest score in scoreboard, and remove lowest score as a result



/*
public static void main(String[] args) {
	//System.out.println("Hey");
	Scoreboard2 Scoreboard2 = new Scoreboard2(3);
	Scoreboard2.addEntry(new GameEntry("Tom", 500));
	System.out.println(Scoreboard2.board[2].getScore());
}
*/ 

//^ one way of trying to understand the different variables

}
