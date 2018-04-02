package Lessen2;

public class SimpleJanken {

	public static final int STONE = 0;    //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2;    //パー

	public static void main(String[] args) {
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//①プログラムが開始したことを表示する
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		System.out.println("【じゃんけん開始】");



		int player1WinCount = 0;
		int player2WinCount = 0;

		//乱数格納用変数
		double randomNum = 0;

		//じゃんけんを3回実施する
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//⑥Player2の勝った回数を加算する
		//⑦3回勝負が終わったか
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		for(int cnt = 0; cnt < 3; cnt++) {
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//②Player1が何を出すのかを決める
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■

			int player1Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomNumが0.0以上1.0未満の場合グー
				player1Hand = STONE;
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomNumが1.1以上2.0未満の場合チョキ
				player1Hand = SCISSORS;
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomNumが2.1以上3.0未満の場合パー
				player1Hand = PAPER;
				System.out.println("パー");
			}
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//③Player2が何を出すのかを決める
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			int player2Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomNumが0.0以上1.0未満の場合グー
				player2Hand = STONE;
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomNumが1.1以上2.0未満の場合チョキ
				player2Hand = SCISSORS;
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomNumが2.1以上3.0未満の場合パー
				player2Hand = PAPER;
				System.out.println("パー");
			}

			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//④どちらが勝ちか判定し、結果を表示する
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//Player1が勝つ場合
			if ((player1Hand == STONE && player2Hand == SCISSORS)
				|| (player1Hand == SCISSORS && player1Hand ==PAPER)
				|| (player1Hand == PAPER && player2Hand == STONE)) {
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//⑤Player1の勝った回数を加算する
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				player1WinCount++;
			//じゃんけんの結果を表示
			System.out.println("\nPlayer1が勝ちました！\n");
			} else if ((player1Hand == STONE && player2Hand == PAPER)
				|| (player1Hand == SCISSORS && player1Hand ==STONE)
				|| (player1Hand == PAPER && player2Hand == SCISSORS)){
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			//⑤Player2の勝った回数を加算する
			//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
				player2WinCount++;
				//じゃんけんの結果を表示
				System.out.println("\nPlayer2が勝ちました！\n");
			} else { //引き分けの場合
				//じゃんけんの結果を表示する
				System.out.println("\n引き分けです！\n");

			}
		}
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//⑧最終的な勝者を判定し、画面表示する
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		System.out.println("【じゃんけん終了】\n");
		//Player1の勝ち数が多いとき
		if(player1WinCount > player2WinCount) {
			//Player1の勝ちを表示
			System.out.println(player1WinCount + "対" + player2WinCount
					+"でPlayer1の勝ちです! \n");
		} else if (player1WinCount < player2WinCount) { //Player2の勝ち数が多いとき
			System.out.println(player1WinCount + "対" + player2WinCount
					+ "でPlayer2の勝ちです! \n");
		} else { //引き分けの表示
				System.out.println(player1WinCount + "対" + player2WinCount
						+ "で引き分けです! \n");
		}
	}

}
