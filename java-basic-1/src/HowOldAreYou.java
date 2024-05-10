// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			while(true){
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			if (line.equalsIgnoreCase("q") || line.equalsIgnoreCase("e")) {
				System.out.println("プログラムを終了します。");//入力がqあるいはeの場合は終了
				break;
			}
			int age = Integer.parseInt(line);

			if (age < 0 || age >= 120) {
				System.out.println("年齢が不正です。再入力してください。");
				continue;
			}

			int birthYear = 2024 - age;
			int age2030 = age + 6;

			String era;
			int yearInEra;

			if (birthYear >= 2019) {
				era = "令和";
				yearInEra = birthYear - 2018;
			} else if (birthYear >= 1989) {
				era = "平成";
				yearInEra = birthYear - 1988;
			} else if (birthYear >= 1926) {
				era = "昭和";
				yearInEra = birthYear - 1925;
			} else if (birthYear >= 1912) {
				era = "大正";
				yearInEra = birthYear - 1911;
			} else {
				era = "明治";
				yearInEra = birthYear - 1867;
			}

			System.out.println("2030年には" + age2030  + "歳です。");
                System.out.println("誕生年は" + era + yearInEra + "年です。");
            }

		}catch(IOException e) {
			System.out.println(e);
		}


	}
}

//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

