package com.aws.codestar.projecttemplates.controller;

public class Team {

    private String teamName;
    private Integer numberOfPlayers;
    private String teamLeague;


    public Team(String teamName, Integer numberOfPlayers, String teamLeague) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.teamLeague = teamLeague;
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
