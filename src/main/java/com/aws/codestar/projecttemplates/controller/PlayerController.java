package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Reprisitory.PlayerRep;
import com.aws.codestar.projecttemplates.domain.Player;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerRep playerRep;

    @RequestMapping(value = "/setPlayer", method = RequestMethod.POST)
    public String  setNewPlayer(@RequestBody Player player){
        playerRep.save(player);
        return "OK" + "\n" + player.toString();
    }

    @RequestMapping(value = "/getPlayers", method = RequestMethod.GET)
    public String  getAllPlayers() throws JsonProcessingException {
        List<Player> players = playerRep.findAll();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(players);
    }
}