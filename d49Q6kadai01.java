/* d49Q6kadai01.java
s23017
StringBuilderクラスを使って与えられてあ引数を連結し、表示する課題
実行の際は引数を受け付ける設計
{実行例}
> java d49Q6kadai01 IT カレッジ 沖縄
ITカレッジ沖縄
*/

import java.lang.StringBuilder;

public class d49Q6kadai01 {
	public static void main (String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < args.length; i++) {
			sb.append(args[i]);
		}
		System.out.println(sb.toString());
	}
}
