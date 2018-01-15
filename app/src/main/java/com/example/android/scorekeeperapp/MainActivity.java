package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScorMadrid = 0;
    int GoalMadrid = 0;
    int ShotsMadrid = 0;
    int FoulsMadrid = 0;

    int ScoreBarca = 0;
    int GoalBarca = 0;
    int ShotsBarca = 0;
    int FoulsBarca = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 3 point.
     */

    public void GoalMadrid(View v) {
        ScorMadrid = ScorMadrid + 1;

        displayForTeamA(ScorMadrid);

    }


    /**
     * Increase the score for Team A by 2 point.
     */
    public void ShotsMadrid(View v) {
        ShotsMadrid = ShotsMadrid + 1;

        displayShotsForTeamA(ShotsMadrid);


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void FoulsMadrid(View v) {
        FoulsMadrid = FoulsMadrid + 1;

        displayFoulsForTeamA(FoulsMadrid);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreMadrid);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreMadridFoul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreMadridShots);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team A by 3 point.
     */

    public void GoalBarca(View v) {
        ScoreBarca = ScoreBarca + 1;

        displayForTeamB(ScoreBarca);

    }


    /**
     * Increase the score for Team A by 2 point.
     */
    public void ShotsBarca(View v) {
        ShotsBarca = ShotsBarca + 1;

        displayShotsForTeamB(ShotsBarca);


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void FoulsBarca(View v) {
        FoulsBarca = FoulsBarca + 1;

        displayFoulsForTeamB(FoulsBarca);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreBarca);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreBarcaFoul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ScoreBarcaShots);
        scoreView.setText(String.valueOf(score));
    }

    public void ResetButton(View v) {

        ScorMadrid = 0;
        GoalMadrid = 0;
        ShotsMadrid = 0;
        FoulsMadrid = 0;

        ScoreBarca = 0;
        GoalBarca = 0;
        ShotsBarca = 0;
        FoulsBarca = 0;


        displayForTeamB(ScoreBarca);
        displayForTeamA(ScorMadrid);
        displayShotsForTeamB(ShotsBarca);
        displayShotsForTeamA(ShotsMadrid);
        displayFoulsForTeamB(FoulsBarca);
        displayFoulsForTeamA(FoulsMadrid);


    }


}
