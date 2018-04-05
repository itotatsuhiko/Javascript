package _2Lesson3_4;

/**
 * ジャンケンの審判を表すクラス。
 */
public class Judge {
	/**
	 * ジャンケンを開始する。
     *
     * @param murata 判定対象プレイヤー1
     * @param yamada 判定対象プレイヤー2
     */
	public void StartJanken(Player murata, Player yamada) {
		//実際の処理
		//じゃんけんの開始を宣言する
		System.out.println("じゃんけん開始");
		//じゃんけんを3回実施
		for (int cnt = 0; cnt < 3; cnt++) {
			//何回戦目か表示
			System.out.println("【" + (cnt + 1) + "回戦目】");
			//プレイヤーの手を見て、どちらが勝ちかを判定する
			Player winner = judgeJanken(murata, yamada);

			if(winner != null) {
				//勝者の表示
				System.out.println(winner.getName() + "が勝ちました");
				//勝ったプレイヤーへ結果を伝える  ---------------③
				winner.notifyResult(true);
			} else {
				//引き分けの場合
				System.out.println("引き分けです");
			}
		}
		//じゃんけんの終了を宣言する
		System.out.println("【じゃんけん終了】");

		//最終的な勝者を判定
		Player finalWinner = judgeFinalWinner(murata, yamada);
		//結果の表示
		System.out.println(murata.getWinCount() +
				"対" + yamada.getWinCount() + "で" );
		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "の勝ちです！");
		} else {
			//引き分けの場合
			System.out.println("引き分けです");
		}
	}
	/**
	 * 「ジャンケン、ポン！」と声をかけ、
	 * プレイヤーの手を見て、どちらが勝ちかを判定する。
	 *
	 * @param murata 判定対象プレイヤー1
	 * @param yamada 判定対象プレイヤー2
	 * @return 勝ったプレイヤー。引き分けの場合は null を返す。
	 */
	private Player judgeJanken(Player murata, Player yamada) {

		Player winner = null;
		//プレイヤー１の手を出す  ---------------------①
		int player1hand = murata.showHand();
		//プレイヤー２の手を出す  ---------------------②
		int player2hand = yamada.showHand();

		//それぞれの手を表示
		printHand(player1hand);
		System.out.print(" .VS ");
		printHand(player2hand) ;
		System.out.println("\n");

		//プレイヤー１が勝つ場合
		if ( (player1hand == Player.STONE && player2hand == Player.SCISSORS)
				|| (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
				|| 	(player1hand == Player.PAPER && player2hand == Player.STONE) ) {
			winner = murata;
		//プレイヤー２が勝つ場合
		} else if ((player1hand == Player.STONE && player2hand == Player.PAPER)
				|| (player1hand == Player.SCISSORS && player2hand == Player.STONE)
				|| 	(player1hand == Player.PAPER && player2hand == Player.SCISSORS)) {
			winner = yamada;
		}
		//どちらでもない場合は引き分け(nullを返す)
		return winner;
	}

	/**
	* 最終的な勝者を判定する。
	*
	* @param murata 判定対象プレイヤー1
	* @param yamada 判定対象プレイヤー2
	* @return 勝ったプレイヤー。引き分けの場合は null を返す。
	*/
	private Player judgeFinalWinner(Player murata,Player yamada) {
		Player winner = null;
		//player1から勝ち数を聞く  -----------------------①
		int player1WinCount = murata.getWinCount();
		//player2から勝ち数を聞く  -----------------------①
		int player2WinCount = yamada.getWinCount();

		if (player1WinCount > player2WinCount) {
			//プレイヤー１の勝ち
			winner = murata;
		} else if (player1WinCount < player2WinCount) {
			//プレイヤー２の勝ち
			winner = yamada;
		}
		//どちらでもない場合は引き分け(nullを返す)
		return winner;
	}


    /**
	* ジャンケンの手を表示する。
	*
	* @param hand ジャンケンの手
	*/
	private void printHand(int hand) {
		switch (hand) {
			case Player.STONE :
				System.out.print("グー");
				break;
			case Player.SCISSORS :
				System.out.print("チョキ");
				break;
			case Player.PAPER :
				System.out.print("パー");
				break;

				default :
					break;
		}
	}
}
