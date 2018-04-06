package _2Lesson9.Fantan;

import _2Lesson8.Card;
import _2Lesson8.Hand;
import _2Lesson8.Master;
import _2Lesson8.Player;
import _2Lesson8.Rule;
import _2Lesson8.Table;

public class Fantan {
	public static void main(String args[]) {
		// 進行役の生成
		Master master = new FantanMaster();
		// テーブルの生成
		Table table = new FantanTable();
		// ルールの生成
		Rule rule = new FantanRule();
		// プレイヤーの生成
		Player murata = new FantanPlayer("村田",master,table,rule);
		Player yamada = new FantanPlayer("山田",master,table,rule);
		Player saito = new FantanPlayer("斎藤",master,table,rule);
		// プレイヤーを登録
		master.registerPlayer(murata);
		master.registerPlayer(yamada);
		master.registerPlayer(saito);
		// トランプを生成する
		Hand Trump = createTrump();
		// ゲームの準備をする
		master.prepareGame(Trump);
		// ゲームを開始する
		master.startGame();
	}

	/**
	 * 52枚のトランプを生成する。
	 *
	 * @return トランプを格納したDeal
	 */
	private static Hand createTrump() {
		Hand trump = new Hand();
		//各スート52枚のカードを生成する
		for (int number = 1; number <= Card.CARD_NUM; number++) {
			trump.addCard(new Card(Card.SUIT_CLUB, number));
			trump.addCard(new Card(Card.SUIT_DIAMOND, number));
			trump.addCard(new Card(Card.SUIT_HEART, number));
			trump.addCard(new Card(Card.SUIT_SPADE, number));
		}
		 return trump;
	}
}
