package com.example.android.scorekeeper;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCadsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increases the Team A score by 1 goal.
     */
    public void addGoalForTeamA(View v) {
        goalsTeamA += 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    /**
     * Increases the Team B score by 1 goal.
     */
    public void addGoalForTeamB(View v) {
        goalsTeamB += 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    /**
     * Increases the Team A yellow card count by 1.
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardsTeamA += 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    /**
     * Increases the Team B yellow card count by 1.
     */
    public void addYellowCardForTeamB(View v) {
        yellowCadsTeamB += 1;
        displayYellowCardsForTeamB(yellowCadsTeamB);
    }

    /**
     * Increases the Team B red card count by 1.
     */
    public void addRedCardForTeamA(View v) {
        redCardsTeamA += 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    /**
     * Increases the Team B red card count by 1.
     */
    public void addRedCardForTeamB(View v) {
        redCardsTeamB += 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Resets all the values to 0. Ready for a new game!
     */
    public void reset(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCadsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayYellowCardsForTeamB(yellowCadsTeamB);
        displayRedCardsForTeamA(redCardsTeamA);
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays the yellow card count for team A.
    public void displayYellowCardsForTeamA(int cards) {
        TextView cardsView = (TextView) findViewById(R.id.team_a_yellow_cards);
        cardsView.setText(String.valueOf(cards));
    }

    // Displays the yellow card count for team B.
    public void displayYellowCardsForTeamB(int score) {
        TextView cardsView = (TextView) findViewById(R.id.team_b_yellow_cards);
        cardsView.setText(String.valueOf(score));
    }

    // Displays the red card count for team A.
    public void displayRedCardsForTeamA(int score) {
        TextView cardsView = (TextView) findViewById(R.id.team_a_red_cards);
        cardsView.setText(String.valueOf(score));
    }

    // Displays the red card count for team B.
    public void displayRedCardsForTeamB(int score) {
        TextView cardsView = (TextView) findViewById(R.id.team_b_red_cards);
        cardsView.setText(String.valueOf(score));
    }

}
