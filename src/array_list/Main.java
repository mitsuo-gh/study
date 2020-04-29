package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
		//ArrayListのインスタンス化
	ArrayList<String> names = new ArrayList<String>();
	//ArrayList要素の追加
	names.add("みつお");
	names.add("たまこ");
	//ArrayList要素の挿入
	names.add(1, "あら");
	//ArrayList要素の変更
	names.set(2, "たまこ or たまお");
	//ArrayListのインスタンス化
	ArrayList<Integer> ages = new ArrayList<>();
	ages.add(32);
	ages.add(37);
	ages.add(0);

	//拡張for文
	for(String n : names) {
		System.out.println(n);
	}

	for(int i = 0; i < ages.size(); i++) {
		//取り出した要素の取り出しと連結
		sb.append(names.get(i) + "["+ ages.get(i) + "]\n");
	}
	String i = sb.toString();
	System.out.println(i);
	//要素が0かどうか調べる
	System.out.println(names.isEmpty());
	//引数の要素があるかどうかを調べる
	System.out.println(names.contains("あら"));
	//引数の要素が何番目の要素かを調べる
	System.out.println(names.indexOf("みつお"));
	//全ての要素の削除
//	names.clear();
//	//指定要素の削除
//	names.remove(2);
	
	//イテレータ(iterator)クラス
	Iterator<String> it = names.iterator();
	while(it.hasNext()) {
		String e = it.next();
		System.out.println(e);
	}

	}


}

