package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Integer teamId;

    /**
     *  Название команды
     */
    private String teamName;

    /**
     *  Количество игроков
     */
    private Integer teamNumberOfPlayers;

    /**
     *  Id лиги, в которой играет команда
     */
    private Integer teamLeagueId;

    public Team(Integer teamId, String teamName, Integer teamNumberOfPlayers, Integer teamLeagueId) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamNumberOfPlayers = teamNumberOfPlayers;
        this.teamLeagueId = teamLeagueId;
    }

    public Team(String teamName, Integer teamNumberOfPlayers, Integer teamLeagueId) {
        this.teamName = teamName;
        this.teamNumberOfPlayers = teamNumberOfPlayers;
        this.teamLeagueId = teamLeagueId;
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

    public Integer getTeamLeagueId() {
        return teamLeagueId;
    }

    public void setTeamLeagueId(Integer teamLeague) {
        this.teamLeagueId = teamLeague;
    }

}
