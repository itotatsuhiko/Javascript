package _2Lesson2;
/**
 * オブジェクト指向を使用しないジャンケンプログラム
 */
public class SimpleJanken {
	//じゃんけんの手を表す定数
	public static final int STONE = 0;     //グー
	public static final int SCISSORS = 1;  //チョキ
	public static final int PAPER = 2;     //パー



	// ■■■■■■■■■■■■■■■■■■■■■■■■
	// 　プログラムのスタートはここから
	// ■■■■■■■■■■■■■■■■■■■■■■■■

	public static void main (String[] args) {

		//プレイヤー1の勝ち数
		int player1WinCount = 0;
		//プレイヤー2の勝ち数
		int player2WinCount = 0;

		// ■■■■■■■■■■■■■■■■■■■■■■■■
		// ①ゲーム開始の宣言
		// ■■■■■■■■■■■■■■■■■■■■■■■■
		System.out.println("【ゲーム開始】");

		//じゃんけんを3回実施
		// ■■■■■■■■■■■■■■■■■■■■■■■■
		// ⑥ 勝負した回数を加算する
		// ⑦ 3回勝負が終わったか
		// ■■■■■■■■■■■■■■■■■■■■■■■■
		for (int cnt = 0; cnt < 3; cnt++) {
			//②～⑤の処理を記述
			//乱数を格納するための変数
			double randomNum = 0;
			// ■■■■■■■■■■■■■■■■■■■■■■■■
			// ②プレイヤー1が何を出すか決める
			// ■■■■■■■■■■■■■■■■■■■■■■■■
			int player1Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomNumが0.0以上1.0未満の場合、グー
				player1Hand = STONE;
				//プレイヤー１の手を表示
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomNumが1.0以上2.0未満の場合、チョキ
				player1Hand = SCISSORS;
				//プレイヤー１の手を表示
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomNumが2.0以上2.0未満の場合、パー
				player1Hand = PAPER;
				//プレイヤー１の手を表示
				System.out.println("パー");
			}

			System.out.println(" VS ");

			// ■■■■■■■■■■■■■■■■■■■■■■■■
			// ③プレイヤー2が何を出すか決める
			// ■■■■■■■■■■■■■■■■■■■■■■■■
			int player2Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomNumが0.0以上1.0未満の場合、グー
				player2Hand = STONE;
				//プレイヤー１の手を表示
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomNumが1.0以上2.0未満の場合、チョキ
				player2Hand = SCISSORS;
				//プレイヤー１の手を表示
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomNumが2.0以上2.0未満の場合、パー
				player2Hand = PAPER;
				//プレイヤー１の手を表示
				System.out.println("パー");
			}

			// ■■■■■■■■■■■■■■■■■■■■■■■■
			// ④どちらが勝ちかを判定し、結果を表示
			// ■■■■■■■■■■■■■■■■■■■■■■■■
			//プレイヤー1が勝つ場合
			if ((player1Hand == STONE && player2Hand == SCISSORS)
					|| (player1Hand == SCISSORS && player2Hand == PAPER)
					|| (player1Hand == PAPER && player2Hand == STONE)) {

				// ■■■■■■■■■■■■■■■■■■■■■■■■
				// ⑤プレイヤー1の勝った回数を加算する
				// ■■■■■■■■■■■■■■■■■■■■■■■■
				player1WinCount++;

				//じゃんけんの結果を表示
				System.out.println("プレイヤー1が勝ちました！");

			} else if ((player1Hand == STONE && player2Hand == PAPER)
					|| (player1Hand == SCISSORS && player2Hand == STONE)
					|| (player1Hand == PAPER && player2Hand == SCISSORS)) {

				// ■■■■■■■■■■■■■■■■■■■■■■■■
				// ⑤プレイヤー2の勝った回数を加算する
				// ■■■■■■■■■■■■■■■■■■■■■■■■
				player2WinCount++;

				//じゃんけんの結果を表示
				System.out.println("プレイヤー2が勝ちました！");

			} else {
				//引き分けの場合
				//じゃんけんの結果を表示
				System.out.println("引き分けです");
			}
		}

		// ■■■■■■■■■■■■■■■■■■■■■■■■
		// ⑧最終的な判定し、画面に表示
		// ■■■■■■■■■■■■■■■■■■■■■■■■
		System.out.println("【じゃんけん終了】");
		//プレイヤーの勝ち数が多いとき
		if (player1WinCount > player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "でプレイヤー1の勝ちです");
		} else if (player1WinCount < player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "でプレイヤー2の勝ちです");
		} else if  (player1WinCount == player2WinCount) {
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "引き分けです");

		}
	}
}
