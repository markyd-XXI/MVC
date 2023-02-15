package com.example.OOPMVC;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO modeling game result data
 */
public class GameResultModel {
    private String opponent;
    private String result;
    private String score;

    public GameResultModel(@JsonProperty("opponent") String opponent, @JsonProperty("result") String result, @JsonProperty("score") String score) {
        this.opponent = opponent;
        this.result = result;
        this.score = score;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
