package BT1;

public class TennisGame {
    private int player1Score;
    private int player2Score;

    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRIRTY = 2;
    private static final int FORTY = 3;

    public TennisGame(){
        player1Score = 0;
        player2Score = 0;
    }

    public void player1Scored() {
        player1Score++;
    }

    public void player2Score(){
        player2Score++;
    }

    public String getScore(){
        if (player1Score >= 3 && player2Score >= 3){
            if (player1Score == player2Score){
                return "Deuce";
            } else if (player1Score > player2Score){
                return "Advantage player 1";
            } else {
                return "Advantage play 2";
            }
        } else if (player1Score >= 4 && player1Score - player2Score >= 2){
            return  "Win player 1";
        } else if (player2Score >= 4 && player2Score - player1Score >= 2){
            return "Win player 2";
        } else {
            return getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
        }
    }

    private String getPlayerScore(int score){
        switch (score){
            case LOVE:
                return  "Love";
            case  FIFTEEN:
                return "Fifteen";
            case THIRIRTY:
                return "Thỉty";
            case FORTY:
                return "Forty";
            default:
                return "";
        }
    }
}
