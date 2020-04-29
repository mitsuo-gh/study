package format;

public class Main {

	public static void main(String[] args) {
		//% 修飾 桁 型
		//【修飾】 [,]3桁ごとにカンマ [0]空き領域を0埋め [-]左寄せ [+]符号を強制表示
		//【桁】 全体, 小数点以下
		//[d]整数 [s]文字列 [f]小数 [b]真偽値
		//書式指定文字列を変数に格納
		String format = "■ 名前は：%-6s   ■ 職業は：%-5s   ■ 所持金は：¥ %,9d";

		//formatメソッドを使用して文字列を書式整形
		String s = String.format(format, "Mitsuo", "hero", 50000);
		String m = String.format(format, "Ara", "japan", 2000000);

		//出力
		System.out.println(s);
		System.out.println(m);

		//書式整形と同時に出力するprintfを使って出力
		System.out.printf("製品番号:%s-%03d", "SHV", 3);
	}

}
