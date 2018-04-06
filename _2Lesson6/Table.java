package _2Lesson6;

import java.util.ArrayList;

/**
 * テーブルを表すクラス。
 **/
public class Table {
	/** 捨てられたカードを保持しておくためのリスト */
	private ArrayList disposedCards_ = new ArrayList();

	/**
	 * カードを捨てる。
	 *
	 * @param card 捨てるカードの配列
	 */
	public void disposedCard(Card card[]) {
		for (int index = 0; index < card.length; index++) {
			System.out.print(card[index] + " ");
		}
		System.out.print("をすてました");
		// ステラカードはリストに追加して保持しておく
		disposedCards_.add(card);
	}


}
