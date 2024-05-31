// s23017
// 「チームAの勝利！」または「チームBの勝利！」または「引き分け！」を追加で表示する

class d48Q6kadai{
		public static void main(String[] args){
			if (args.length != 4) {
					System.out.println("数値を四つ指定してください");
					return;
		}

		Achievement teamA = new Achievement();
		teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		Achievement teamB = new Achievement();
		teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

		Match match = new Match();
		match.setAchievements(teamA, teamB);
		System.out.println(match.showResult());
		System.out.println(match.showWinner());
		}
	}

class Match {
		Achievement teamA;
		Achievement teamB;

		void setAchievements(Achievement a, Achievement b){
				teamA = a;
				teamB = b;
		}

		String showResult() {
				return
				"Team A:"  + winPoint(teamA.point, teamB.point, teamA.tryNumber) + ", Team B:" + winPoint(teamB.point, teamA.point, teamB.tryNumber);

		}

		String showWinner() {
				        int teamAPoints = winPoint(teamA.point, teamB.point, teamA.tryNumber);
        int teamBPoints = winPoint(teamB.point, teamA.point, teamB.tryNumber);

        if (teamAPoints > teamBPoints) {
            return "チームAの勝利！";
        } else if (teamAPoints < teamBPoints) {
            return "チームBの勝利！";
        } else {
            return "引き分け！";
        }
    }
				

		int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber){
				return matchPoint(teamXPoint, teamYPoint) + bonusPoint(teamXTryNumber);
		}

		int matchPoint(int teamXPoint, int teamYPoint) {
				if (teamXPoint == teamYPoint) {
						return 2;
				} else if (teamXPoint > teamYPoint) {
						return 4;
				} else if (teamYPoint - teamXPoint <= 7) {
						return 1;
				}
				return 0;
		}

		int bonusPoint(int tryNumber){
				return tryNumber >= 4 ? 1 : 0;
		}
}

class Achievement {
		int point;
		int tryNumber;

		void set(int teamPoint, int teamTryNumber){
				point = teamPoint;
				tryNumber  = teamTryNumber;
		}
}
