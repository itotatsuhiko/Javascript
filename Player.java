package Lessen3;
/**
 * じゃんけんのプレイヤーを表すクラス。
 * @author tatsuhiko.ito
 *
 */
public class Player {
	//じゃんけんの手を表すクラス
	public static final int STONE = 0;      //グー
	public static final int SCISSORS = 1;   //チョキ
	public static final int PAPER = 2;      //パー

	//----------------------------------
	//プレイヤークラスの属性
	//----------------------------------
	/*プレイヤーの名前*/
	private String name_;

	/*プレイヤーの勝った回数*/
	private int winCount_ = 0;

	//----------------------------------
	//プレイヤークラスの操作
	//----------------------------------
	/**じゃんけんの手をだす
	 *
	 * @return じゃんけんの手
	 * **/
	public int showHand() {
		//①実際の処理
		double randomNum;
		randomNum = Math.random() * 3;
		int hand = 0;
//伊：		int playerHand = 0;
		if (randomNum < 1) {
			//randomNumが0.0以上1.0未満の場合グー
//伊：			playerHand = STONE;
			hand = STONE;
			System.out.println("グー");
		} else if (randomNum < 2) {
			//randomNumが1.1以上2.0未満の場合チョキ
//伊：			playerHand = SCISSORS;
			hand = SCISSORS;
			System.out.println("チョキ");
		} else if (randomNum < 3) {
			//randomNumが2.1以上3.0未満の場合パー
//伊:			playerHand = PAPER;
			hand = PAPER;
			System.out.println("パー");
		}
//伊:		return playerHand;
		return hand;
	}

	/**
	 * 審判から勝敗を聞く
	 *
	 * @param result true:勝ち,false:負け
	 * */
	public void notifyResult(boolean result) {
		//②実際の処理
		if (result = true) {
//伊:			winCount_++;
			winCount_ += 1;
		}
	}

	/**自分の勝った回数を答える
	 *
	 * @return 勝った回数
	 * **/
	public int getWinCount() {
		//③実際の処理

//伊:		System.out.println(winCount_);
		return winCount_;
	}
}
