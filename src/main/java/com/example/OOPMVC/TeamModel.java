package com.example.OOPMVC;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * POJO modeling team data
 */
public class TeamModel {
    private String teamName;
    private List<PlayerModel> players;

    public TeamModel(@JsonProperty("team_name") String teamName, @JsonProperty("players") List<PlayerModel> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<PlayerModel> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerModel> players) {
        this.players = players;
    }
}
