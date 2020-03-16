package com.aws.codestar.projecttemplates.controller;

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
        System.out.print("\n\n\n123 GET\n");
        return ResponseEntity.ok(createResponse(name));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.print("\n\n\n123 POST\n");
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }



    @RequestMapping(value = "newuser", method = RequestMethod.POST)
    public String updateDB(@RequestBody User new_user){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        User user = new User(new_user.getUserName(), new_user.getUserEmail(), new_user.getUserPassword());
        databaseHandler.setNewUser(user);
        return "OK";
    }

    @RequestMapping(value = "getTeams", method = RequestMethod.GET)
    public void getMessageFormat(){
        DatabaseHandler databaseHandler = new DatabaseHandler();

        databaseHandler.getAllTeams();
        //return "OK";
    }

}
