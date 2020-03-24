package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Integer teamId;

    private String teamName;
    private Integer teamNumberOfPlayers;
    private String teamLeague;
    private String teamZone;

    public Team(Integer teamId, String teamName, Integer teamNumberOfPlayers, String teamLeague, String teamZone) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamNumberOfPlayers = teamNumberOfPlayers;
        this.teamLeague = teamLeague;
        this.teamZone = teamZone;
    }

    public Team(String teamName, Integer teamNumberOfPlayers, String teamLeague, String teamZone) {
        this.teamName = teamName;
        this.teamNumberOfPlayers = teamNumberOfPlayers;
        this.teamLeague = teamLeague;
        this.teamZone = teamZone;
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

    public Integer getTeamNumberOfPlayers() {
        return teamNumberOfPlayers;
    }

    public void setTeamNumberOfPlayers(Integer numberOfPlayers) {
        this.teamNumberOfPlayers = numberOfPlayers;
    }

    public String getTeamLeague() {
        return teamLeague;
    }

    public void setTeamLeague(String teamLeague) {
        this.teamLeague = teamLeague;
    }

    public String getTeamZone() {
        return teamZone;
    }

    public void setTeamZone(String teamZone) {
        this.teamZone = teamZone;
    }

}
