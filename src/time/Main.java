package time;
import java.util.Calendar;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
//		//日付と時間の勉強
//		//long型の日付を取得するメソッド
		long start = System.currentTimeMillis();
//		//ここで何らかの時間がかかる処理
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		long end = System.currentTimeMillis();
//		//処理時間を計算して出力
		System.out.println(end - start);
//
//		//Dateクラスのインスタンス化
		Date d = new Date();
//		//現在日時の出力
		System.out.println(d);
//		//long型の日時のを出力
		System.out.println(d.getTime());
		Date past = new Date(1587866475470L);
		System.out.println(past);

		//カレンダークラス
		//6つのint型からDateインスタンスを生成
		Calendar c = Calendar.getInstance();
		c.set(2020,11,7,8,30,30);
		Date date = c.getTime();
		System.out.println(date);
//		//Dateインスタンスから6つのint型を生成
		Calendar calendar = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		final String DATE = "%4d年%02d月%02d日%02d時%02d分%02d秒";
		System.out.printf(DATE,year, month, day, hour, minute, second);
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.DAY_OF_MONTH);
		

	}

}
