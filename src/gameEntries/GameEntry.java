package gameEntries;

public class GameEntry {
	
	private String name;
	private int score;

	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int s) {
		score = s;
	}
}