package Lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Lesson3.Player;

/**
 * 標準入力によりじゃんけんの手をユーザに聞くクラス
 **/
public class AskTactics implements Tactics {
	/**
	/**
	 * 戦略を読み,じゃんけんの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す
	 * Player.STONE    ：グー
	 * Player.SCISSORS ：チョキ
	 * Player.PAPER    ：パー
	 *
	 * @return じゃんけんの手
	 * */
	public int readTactics() {
		BufferedReader br
				= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n じゃんけんの手を入力してください。");
		System.out.println("0: グー\n");
		System.out.println("1: チョキ\n");
		System.out.println("2: パー\n");
		System.out.println("? ");

		int hand = 0;

		while (true) {
			try {
				//入力文字を受け取る
				String inputStr = br.readLine();
				//入力文字を数字に変換する。
				hand = Integer.parseInt(inputStr);

				//1～2のいずれかが入力されたらループを抜ける
				if (hand == Player.STONE
						|| hand == Player.SCISSORS
						|| hand == Player.PAPER) {
					break;
				} else {
					System.out.println("入力が正しくありません。再度入力してください。");
					System.out.println("? ");
				}
			} catch (Exception ex) {
				System.out.println("入力が正しくありません。再度入力してください。");
				System.out.println("? ");
			}
		}
		return hand;
	}

}
