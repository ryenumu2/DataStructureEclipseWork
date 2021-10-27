package october_plus_2021;

public class domino {
	
	static int MOD = 1_000_000_007;
	
	static long[] dp = new long[] {1,0,0,0};
	
	//0b00: 0
	//0b01: 1
	//0b10: 2
	//0b11: 3
	
	static long[] ndp = new long[4];
	
	
	public static void main(String[] args) {
		for (long ele: dp) {
			System.out.println(ele);
		} //will print out: 1 0 0 0
		
		ndp[0b00] = (dp[0b00] + dp[0b11]) % MOD;
		
		dp = ndp;
	}
	
	
	
}