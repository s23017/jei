// s23017
// コマンドラインから与えられて整数を指定するよう変更

class d50Q27kadai {
	public static void main(String[] args) {
		int control = Integer.parseInt(args[0]);
		String mode;

		switch (control) {
			case 1:
				mode = "warm";
				break;
			case 2:
				mode = "Cool";
				break;
			case 3:
				mode = "Wind";
				break;
			default:
				mode = "Wind";
				break;
		}
		System.out.println(mode);
	}
}
