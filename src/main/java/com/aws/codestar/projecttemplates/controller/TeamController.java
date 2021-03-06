package com.aws.codestar.projecttemplates.controller;


import com.aws.codestar.projecttemplates.Reprisitory.TeamRep;
import com.aws.codestar.projecttemplates.domain.Team;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
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

    @RequestMapping(value = "/getTeamById", method = RequestMethod.GET)
    public String  getTeams(@RequestParam Integer teamId) throws JsonProcessingException {
        Team team = teamRep.findFirstByTeamId(teamId);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(team);
    }

    @RequestMapping(value = "/getTeamByName", method = RequestMethod.GET)
    public String  getTeamByName(@RequestParam String teamName) throws JsonProcessingException {
        Team team = teamRep.findFirstByTeamName(teamName);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(team);
    }
}
