public class GameManager {
    private static GameManager instance;
    private int score;

    private GameManager() {
        score = 0;
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void addScore(int points) {
        score += points;
        System.out.println("Puntuación: " + score);
    }

    public int getScore() {
        return score;
    }
}
