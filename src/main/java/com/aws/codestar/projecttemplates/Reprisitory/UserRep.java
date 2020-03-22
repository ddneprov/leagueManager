package com.aws.codestar.projecttemplates.Reprisitory;

import com.aws.codestar.projecttemplates.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRep extends CrudRepository<User, String> {

    List<User> findByEmail(String email);

    public List<User> findAll();

}
