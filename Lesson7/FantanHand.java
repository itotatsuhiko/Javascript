package Lesson7;

import java.util.ArrayList;

import Lesson6.Card;
import Lesson6.Hand;


/**
 * 七並べプログラム。
 */
public class FantanHand extends Hand {
	/* 手札にあるカードを保持するためのリスト */
	private ArrayList hand_ = new ArrayList();
	/**
	 * カードを見る
	 **/
	public void lookCard() {
		//実際の処理

	}
	public Card pickCard() {
		Card pickedCard = (Card) hand_.remove(0);
		return pickedCard;
	}
}
