package com.aws.codestar.projecttemplates.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class DatabaseHandler extends Config {
    Connection dbConnection;

//    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
//        String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow";
//        String connectionString = "jdbc:mysql://" +
//                dbHost + ":" + dbPort + "/" + dbName;// + timezone;
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
//        return dbConnection;
//    }


//    public void setNewUser(User user){
//
//        String request = "INSERT INTO " + Const.USERS_TABLE +
//                "(" + Const.USER_NAME + "," + Const.USER_EMAIL + "," + Const.USER_PASSWORD + ")" +
//                "VALUES(?,?,?)";
//
//        try{
//            PreparedStatement preparedStatement = getDbConnection().prepareStatement(request);
//
//            preparedStatement.setString(1,user.getUserName());
//            preparedStatement.setString(2,user.getUserEmail());
//            preparedStatement.setString(3,user.getUserPassword());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//
//
//    public void setNewTeam(Team team){
//        String request = "INSERT INTO " + Const.TEAMS_TABLE +
//                "(" + Const.TEAM_NAME + "," + Const.TEAM_NUMBER_OF_PLAYERS + "," + Const.TEAM_LEAGUE + ")" +
//                "VALUES(?,?,?)";
//
//        try{
//            PreparedStatement preparedStatement = getDbConnection().prepareStatement(request);
//
//            preparedStatement.setString(1,team.getTeamName());
//            preparedStatement.setInt(2,team.getNumberOfPlayers());
//            preparedStatement.setString(3,team.getTeamLeague());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//
//
//    public List<Team> getAllTeams(){
//        String request = "SELECT " + Const.TEAM_ID
//                        + " ," + Const.TEAM_NAME
//                        + " ," + Const.TEAM_NUMBER_OF_PLAYERS
//                        + " ," + Const.TEAM_LEAGUE
//                        + " FROM " + Const.TEAMS_TABLE;
//        try{
//            Statement st = getDbConnection().createStatement();
//            ResultSet rs = st.executeQuery(request);
//
//            List<Team> dbTeams = new ArrayList<Team>();
//            while (rs.next()){
//
//                Integer teamId = rs.getInt("teamId");
//                String teamName = rs.getString("teamName");
//                Integer numberOfPlayers = rs.getInt("numberOfPlayers");
//                String teamLeague = rs.getString("teamLeague");
//
//                Team dbTeam = new Team(teamId, teamName, numberOfPlayers, teamLeague);
//                dbTeams.add(dbTeam);
//            }
//
//            return dbTeams;
//
//        } catch (SQLException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        return null;
//    }
}
