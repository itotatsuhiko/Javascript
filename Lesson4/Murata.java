package Lesson4;

import Lesson3.Player;

public class Murata extends Player {
	/**
	 *プレイヤーを継承した村田さんクラス
	 *
	 **/
	public Murata(String name) {
		super(name);
	}

	/**
	 * じゃんけんの手を出す。
	 * スーパークラスの同名メソッドをオーバーライドしている
	 *
	 * @return じゃんけんの手
	 *
	 **/

	public int showHand() {
		//必ずグーを出す
		return STONE;
	}

///*
//	/**
//	 * じゃんけんのプレイヤーを表すクラス。
//	 * @author tatsuhiko.ito
//	 *
//	 */
//
//   //じゃんけんの手を表すクラス
//	public static final int STONE = 0;      //グー
//	public static final int SCISSORS = 1;   //チョキ
//	public static final int PAPER = 2;      //パー
//
//	//----------------------------------
//	//プレイヤークラスの属性
//	//----------------------------------
//	/*プレイヤーの名前*/
//	private String name_;
//
//	/*プレイヤーの勝った回数*/
//	private int winCount_ = 0;
//
//	//----------------------------------
//	//プレイヤークラスの操作
//	//----------------------------------
//
//	/*プレイヤークラスのコンストラクタ
//	 *
//	 * @param name 名前
//	 *
//	 * */
//
////	public void Player (String name) {
//	public Murata (String name) {  //Lesson4
//	this.name_=name;
//	}
//	/**じゃんけんの手をだす
//	 *
//	 * @return じゃんけんの手
//	 * **/
//	public int showHand() {
//		//①実際の処理
//		double randomNum;
//		randomNum = Math.random() * 3;
//		int hand = 0;
//		if (randomNum < 1) {
//			//randomNumが0.0以上1.0未満の場合グー
//			hand = STONE;
//			System.out.println("グー");
//		} else if (randomNum < 2) {
//			//randomNumが1.1以上2.0未満の場合チョキ
//			hand = SCISSORS;
//			System.out.println("チョキ");
//		} else if (randomNum < 3) {
//			//randomNumが2.1以上3.0未満の場合パー
//			hand = PAPER;
//			System.out.println("パー");
//		}
//		//決定した手を戻り値として返す
//		return hand;
//	}
//
//	/**
//	 * 審判から勝敗を聞く
//	 *
//	 * @param result true:勝ち,false:負け
//	 * */
//	public void notifyResult(boolean result) {
//		//②実際の処理
//		if (result = true) {
//			winCount_ += 1;
//		}
//	}
//
//	/**自分の勝った回数を答える
//	 *
//	 * @return 勝った回数
//	 * **/
//	public int getWinCount() {
//		//③実際の処理
//		return winCount_;
//	}
//	/*
//	 * 自分の名前を答える
//	 *
//	 * @return 名前;
//	 */
//	public String getName() {
//		return name_;
//	}

}

