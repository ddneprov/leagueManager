package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class League {

    @Id
    @GeneratedValue
    private Integer leagueId;

    /**
     * Название лиги
     */
    private String leagueName;

    /**
     * Зона в которой играет лига ( A или B )
     * 0 - A
     * 1 - B
     */
    private Byte leagueZone;

    /**
     * Формат турнира ( каждый с каждым / PlayOff )
     */
    private String leagueFormat;

    public League(Integer leagueId, String leagueName, Byte leagueZone, String leagueFormat) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.leagueZone = leagueZone;
        this.leagueFormat = leagueFormat;
    }

    public League(String leagueName, Byte leagueZone, String leagueFormat) {
        this.leagueName = leagueName;
        this.leagueZone = leagueZone;
        this.leagueFormat = leagueFormat;
    }

    public League(){}

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Byte getLeagueZone() {
        return leagueZone;
    }

    public void setLeagueZone(Byte leagueZone) {
        this.leagueZone = leagueZone;
    }

    public String getLeagueFormat() {
        return leagueFormat;
    }

    public void setLeagueFormat(String leagueFormat) {
        this.leagueFormat = leagueFormat;
    }
}
