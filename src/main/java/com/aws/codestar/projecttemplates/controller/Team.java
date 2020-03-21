package com.aws.codestar.projecttemplates.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Integer teamId;

    private String teamName;
    private Integer numberOfPlayers;
    private String teamLeague;

    public Team(Integer teamId, String teamName, Integer numberOfPlayers, String teamLeague) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.teamLeague = teamLeague;
    }

    public Team(String teamName, Integer numberOfPlayers, String teamLeague) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.teamLeague = teamLeague;
    }

    public Team() {}

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getTeamLeague() {
        return teamLeague;
    }

    public void setTeamLeague(String teamLeague) {
        this.teamLeague = teamLeague;
    }

}
