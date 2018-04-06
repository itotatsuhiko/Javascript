package _2Lesson5;

/*
 * じゃんけん戦略インターフェース
 * */
public interface Tactics {
	/*
	 * 戦略をよみ,じゃんけんの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す
	 * Player.STONE      ：グー
	 * Player.SCISSORS   ：チョキ
	 * Player.PAPER      ：パー
	 *
	 * @return じゃんけんの手
	 * */

	public int readTactics();
}
