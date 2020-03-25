package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    /**
     * Имя пользователя
     */
    private String userFirstName;

    /**
     * Фамилия пользователя
     */
    private String userLastName;

    /**
     * Email пользователя
     */
    private String userEmail;

    /**
     * Пароль пользователя
     */
    private String userPassword;

    /**
     * Роль пользователя ( игрок/капитан )
     * 0 - обычный игрок
     * 1 - капитан команды
     */
    private Byte userIsACapitan;

    /**
     * ID Команды, в которой играет пользователь
     */
    private Integer userTeamId;

    /**
     *  Амплуа игрока ( нападающий, полузащитник, защитник, вратарь )
     */
    private String userAmplua;


    public User(Integer userId, String userFirstName, String userLastName, String userEmail, String userPassword,
                Byte userIsACapitan, Integer userTeamId, String userAmplua) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userIsACapitan = userIsACapitan;
        this.userTeamId = userTeamId;
        this.userAmplua = userAmplua;
    }

    public User(String userFirstName, String userLastName, String userEmail, String userPassword,
                Byte userIsACapitan, Integer userTeamId, String userAmplua){
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userIsACapitan = userIsACapitan;
        this.userTeamId = userTeamId;
        this.userAmplua = userAmplua;
    }

    public User(){}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userName) {
        this.userFirstName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Byte getUserIsACapitan() {
        return userIsACapitan;
    }

    public void setUserIsACapitan(Byte userIsACapitan) {
        this.userIsACapitan = userIsACapitan;
    }

    public Integer getUserTeamId() {
        return userTeamId;
    }

    public void setUserTeamId(Integer userTeam) {
        this.userTeamId = userTeam;
    }

    public String getUserAmplua() {
        return userAmplua;
    }

    public void setUserAmplua(String userAmplua) {
        this.userAmplua = userAmplua;
    }
}
