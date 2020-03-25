package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Reprisitory.UserRep;
import com.aws.codestar.projecttemplates.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRep userRep;

    @RequestMapping(value = "/setUser", method = RequestMethod.POST)
    public String  setNewUser(@RequestBody User user){
        userRep.save(user);
        return "OK" + "\n" + user.toString();
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String  getAllUsers() throws JsonProcessingException {
        List<User> users = userRep.findAll();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(users);
    }
}
