package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Reprisitory.LeagueRep;
import com.aws.codestar.projecttemplates.domain.League;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/league")
public class LeagueController {

    @Autowired
    LeagueRep leagueRep;

    @RequestMapping(value = "/setLeague", method = RequestMethod.POST)
    public String  setNewTeam(@RequestBody League league){
        leagueRep.save(league);
        return "OK" + "\n" + league.toString();
    }

    @RequestMapping(value = "/getLeagues", method = RequestMethod.GET)
    public String  getAllPlayers() throws JsonProcessingException {
        List<League> leagues = leagueRep.findAll();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(leagues);
    }
}
