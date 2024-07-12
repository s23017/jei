// s23017
// ソート途中の内容も出力する

class d50Q5kadai {
	public static void main(String[] args) {
		int[] num = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}

		int tmp;
		for(int i = 1; i < num.length; i++) {
			for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
				tmp = num[j];
				num[j] = num[j +1];
				num [j + 1] = tmp;
			}

			System.out.println("ソート途中");
			for (int val : num) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");

        System.out.print("ソート結果:");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
