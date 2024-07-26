package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScoreManager {

    private Connectiondatabase connectiondatabase;

    public ScoreManager(Connectiondatabase connectiondatabase) {
        this.connectiondatabase = connectiondatabase;
    }

    public int getHighestScore() {
        int highestScore = 0;
        String query = "SELECT MAX(score) AS highest_score FROM scores";

        try (Connection conn = connectiondatabase.connect();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                highestScore = rs.getInt("highest_score");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return highestScore;
    }

    public int getCurrentScore(int playerId) {
        int currentScore = 0;
        String query = "SELECT score FROM scores WHERE player_id = ? ORDER BY score_date DESC LIMIT 1";

        try (Connection conn = connectiondatabase.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, playerId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    currentScore = rs.getInt("score");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return currentScore;
    }

    public void addScore(int playerId, int score) {
        String query = "INSERT INTO scores (player_id, score) VALUES (?, ?)";

        try (Connection conn = connectiondatabase.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, playerId);
            stmt.setInt(2, score);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}