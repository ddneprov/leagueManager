package com.aws.codestar.projecttemplates.controller;


import com.aws.codestar.projecttemplates.Reprisitory.TeamRep;
import com.aws.codestar.projecttemplates.domain.Team;
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
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamRep teamRep;

    @RequestMapping(value = "/setTeam", method = RequestMethod.POST)
    public String  setNewTeam(@RequestBody Team team){
        teamRep.save(team);
        return "OK" + "\n" + team.toString();
    }

    @RequestMapping(value = "/getTeams", method = RequestMethod.GET)
    public String  getAllTeams() throws JsonProcessingException {
        List<Team> teams = teamRep.findAll();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(teams);
    }
}
