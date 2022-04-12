package _08_clean_code_refactoring.exercise;

public class TennisGame {
    public static final int ADVANTAGE = 1;
    public static final int WIN = 2;
    public static final int CONDITION = 4;
    public static String result;
    public static int tempScore;

    public static String getResult(int player1, int player2) {
        if (player1 == player2) {
            result = check2(player1);
        } else if (player1 >= CONDITION || player2 >= CONDITION) {
            result = check1(player1, player2);
        } else {
            result = check3(player1, player2);
        }
        return result;
    }

    public static String check1(int player1, int player2) {
        if ((player1 - player2) >= WIN) result = "player1 win";
        else if ((player1 - player2) == ADVANTAGE) result = "Advantage player1";
        else if ((player1 - player2) == -ADVANTAGE) result = "Advantage player2";
        else result = "player2 win";
        return result;
    }

    public static String check2(int tempScore) {
        switch (tempScore) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }


    public static String check3(int player1, int player2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1;
            else {
                result += "-";
                tempScore = player2;
            }
            switch (tempScore) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }
}
