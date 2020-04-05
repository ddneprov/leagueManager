package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer playerId;

    /**
     * Имя пользователя
     */
    private String playerFirstName;

    /**
     * Фамилия пользователя
     */
    private String playerLastName;

    /**
     * Email пользователя
     */
    private String playerEmail;

    /**
     * Пароль пользователя
     */
    private String playerPassword;

    /**
     * Роль пользователя ( игрок/капитан )
     * 0 - обычный игрок
     * 1 - капитан команды
     */
    private Byte playerIsACapitan;

    /**
     * ID Команды, в которой играет пользователь
     */
    private Integer playerTeamId;

    /**
     *  Амплуа игрока ( нападающий, полузащитник, защитник, вратарь )
     */
    private String playerAmplua;

    public Player(Integer playerId, String playerFirstName, String playerLastName, String playerEmail, String playerPassword,
                  Byte playerIsACapitan, Integer playerTeamId, String playerAmplua) {
        this.playerId = playerId;
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.playerIsACapitan = playerIsACapitan;
        this.playerTeamId = playerTeamId;
        this.playerAmplua = playerAmplua;
    }

    public Player(String playerFirstName, String playerLastName, String playerEmail, String playerPassword,
                  Byte playerIsACapitan, Integer playerTeamId, String playerAmplua) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.playerIsACapitan = playerIsACapitan;
        this.playerTeamId = playerTeamId;
        this.playerAmplua = playerAmplua;
    }

    public Player(){}

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    public String getPlayerPassword() {
        return playerPassword;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public Byte getPlayerIsACapitan() {
        return playerIsACapitan;
    }

    public void setPlayerIsACapitan(Byte playerIsACapitan) {
        this.playerIsACapitan = playerIsACapitan;
    }

    public Integer getPlayerTeamId() {
        return playerTeamId;
    }

    public void setPlayerTeamId(Integer playerTeamId) {
        this.playerTeamId = playerTeamId;
    }

    public String getPlayerAmplua() {
        return playerAmplua;
    }

    public void setPlayerAmplua(String playerAmplua) {
        this.playerAmplua = playerAmplua;
    }
}
