package _2Lesson3_4;

import _2Lesson5.RandomTactics;
import _2Lesson5.Tactics;

/**
 * オブジェクト指向によるじゃんけんプログラム
 */
public class ObjectJanken {
	public static void main(String[] args) {
		//審判(斎藤さん)のインスタンス生成
//		Judge saito = new Judge();
		Judge judge = new Judge();
		//プレイヤー1(村田さん)の生成
//		Player murata = new Player("村田さん");
		Player murata = new Murata("村田さん");
		Tactics murataTactics = new RandomTactics();
		murata.setTactics(murataTactics);

		//プレイヤー2(山田さん)の生成
//		Player yamada = new Player("山田さん");
		Player yamada = new Yamada("山田さん");

		Tactics yamadaTactics = new RandomTactics();
		murata.setTactics(yamadaTactics);

		//村田さんと山田さんをプレイヤーとしてじゃんけんを開始する
		judge.StartJanken(murata, yamada);
	}
}
