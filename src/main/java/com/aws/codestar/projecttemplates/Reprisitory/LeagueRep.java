package com.aws.codestar.projecttemplates.Reprisitory;

import com.aws.codestar.projecttemplates.domain.League;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeagueRep extends CrudRepository<League, String> {
    public List<League> findAll();
}
