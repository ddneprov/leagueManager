package com.aws.codestar.projecttemplates.Reprisitory;

import com.aws.codestar.projecttemplates.domain.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRep extends CrudRepository<Player, String> {
    public List<Player> findAll();
    public Player findFirstByPlayerId(Integer playerId);
}
