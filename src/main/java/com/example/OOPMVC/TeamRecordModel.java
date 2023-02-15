package com.example.OOPMVC;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * POJO modeling team record data
 */
public class TeamRecordModel {
    private String teamName;
    private List<GameResultModel> gameResults;

    public TeamRecordModel(@JsonProperty("team_name") String teamName, @JsonProperty("win_loss_record") List<GameResultModel> gameResults) {
        this.teamName = teamName;
        this.gameResults = gameResults;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<GameResultModel> getGameResults() {
        return gameResults;
    }

    public void setGameResults(List<GameResultModel> gameResults) {
        this.gameResults = gameResults;
    }
}
