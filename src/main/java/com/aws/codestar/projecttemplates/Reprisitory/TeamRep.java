package com.aws.codestar.projecttemplates.Reprisitory;

import com.aws.codestar.projecttemplates.domain.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRep extends CrudRepository<Team, Integer> {
    public List<Team> findAll();
    Team findFirstByTeamId(Integer teamId);
    Team findFirstByTeamName(String teamEmail);
}

