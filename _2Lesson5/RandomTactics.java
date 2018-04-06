package _2Lesson5;

import _2Lesson3_4.Player;

/*
 * ランダムに手を決める戦略クラス
 */
public class RandomTactics implements Tactics {

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

	public int readTactics() {
		//	プレイヤーの手
		int hand = 0;
		//0以上3未満の少数として乱数を得る
		double randomNum = Math.random() * 3;
		if (randomNum < 1) {
			//randomNumが0以上１未満の場合グー
			hand = Player.STONE;
		} else if (randomNum < 2) {
			//randomNumが1以上2未満の場合チョキ
			hand = Player.SCISSORS;
		} else if (randomNum < 3) {
			//randomNumが2以上3未満の場合パー
			hand = Player.PAPER;
		}
		//決定した手を戻り値として返す
		return hand;
	}
}
