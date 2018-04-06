package _2Lesson9.OldMaid;

import java.util.ArrayList;

import _2Lesson8.Card;
import _2Lesson8.Table;

/**
 * ばば抜きのテーブルを表すクラス。
 **/
public class OldMaidTable implements Table {
	/** 捨てられたカードを保持しておくためのリスト **/
	private ArrayList disposedCards_ = new ArrayList();

 	/**
 	 * カードを捨てる。
 	 *
 	 * @param cards 捨てるカード
 	 **/
	public void putCard(Card[] cards) {
		for (int index = 0; index < cards.length; index++) {
			// 捨てられたカードを表示する
			System.out.print(cards[index] + " ");
			// 捨てられたカードはリストに追加して保持しておく。
			disposedCards_.add(cards[index]);
		}
		System.out.println("を捨てました");
	}
 	/**
 	 * カードを見る。
 	 *
 	 * @return テーブルに置かれたカードを表す配列
 	 **/
	public Card[][] getCards() {
		// ばば抜きではカードを見る必要はないため、nullを返す
		return null;
	}
}
