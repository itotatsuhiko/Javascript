package _2Lesson5;

public class CyclicTactics implements Tactics {

	/**
	 * 戦略を読み,じゃんけんの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す
	 * Player.STONE    ：グー
	 * Player.SCISSORS ：チョキ
	 * Player.PAPER    ：パー
	 *
	 * @return じゃんけんの手
	 **/
	int hand = -1;
	public int readTactics() {
		hand += 1;
		return hand;
	}
}
