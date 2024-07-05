// s23017
// 列挙型の課題
// Q26をアレンジして、列挙型で定義したConditionの要素を全てを出力する課題です
// その場合、Condition.values().lengthで要素の数を取得できる
// そして、Condition.values()[i]で要素値を取得できます
enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
	public static void main(String[] args){
        for (Condition condition : Condition.values()) {
            System.out.println("Condition: " + condition);
        }
        Condition c = Condition.SNOW;
        System.out.println("Condition is " + c);
	}
}
