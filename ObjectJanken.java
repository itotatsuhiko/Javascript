package Lessen3;

/***
 * オブジェクト指向によるじゃんけんプログラム
 *
 * @author tatsuhiko.ito
 *
 */

public class ObjectJanken {

	public static void main(String[] args) {
		//審判(斎藤さん)のインスタンス生成
		Judge saito = new Judge();
		//プレイヤー1(村田さん)の生成
		Player murata = new Player("村田さん");
		//プレイヤー1(村田さん)の生成
		Player yamada = new Player("山田さん");

		//村田さん,山田さんをプレイヤーとしてじゃんけんを開始する。
		saito.startJanken(murata, yamada);

	}

}
