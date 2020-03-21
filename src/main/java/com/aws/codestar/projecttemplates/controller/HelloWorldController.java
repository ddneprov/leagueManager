package com.aws.codestar.projecttemplates.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    private static final String MESSAGE_FORMAT = "Hello %s!";

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity helloWorldGet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }




    @RequestMapping(value = "newUser", method = RequestMethod.POST)
    public String setNewUser(@RequestBody User new_user){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        User user = new User(new_user.getUserName(), new_user.getUserEmail(), new_user.getUserPassword());
        databaseHandler.setNewUser(user);
        return "OK";
    }

    @RequestMapping(value = "newTeam", method = RequestMethod.POST)
    public String setNewTeam(@RequestBody Team new_team){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        Team team = new Team(1, new_team.getTeamName(), new_team.getNumberOfPlayers(), new_team.getTeamLeague());
        databaseHandler.setNewTeam(team);
        return "OK";
    }


    @RequestMapping(value = "getteams", method = RequestMethod.GET)
    public String  getAllTeams(){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        List<Team> teams = databaseHandler.getAllTeams();
        JSONArray json = new JSONArray();

        for (int i = 0; i < teams.size(); i++){
            JSONObject obj = new JSONObject();
            obj.put("teamId", teams.get(i).getTeamId());
            obj.put("teamName", teams.get(i).getTeamName());
            obj.put("numberOfPlayers", teams.get(i).getNumberOfPlayers());
            obj.put("teamLeague", teams.get(i).getTeamLeague());
            json.put(obj);
        }
        return json.toString();
    }
}
