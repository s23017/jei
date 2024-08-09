// s23017
// Q26をアレンジして、列挙型で定義したConditionの要素を全てを出力する
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
