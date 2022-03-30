public class Challenge {
	public static String rps(String s1, String s2) {
		// lógica para definir o vencedor ou empate.
		if (s1 == s2) {
			return "TIE";
		} else if ((s1 == "rock" && s2 == "scissors") || (s1 == "scissors" && s2 == "paper")
				|| (s1 == "paper" && s2 == "rock")) {
			return "Player 1 wins";
		} else {
			return "Player 2 wins";
		}
	}
}
