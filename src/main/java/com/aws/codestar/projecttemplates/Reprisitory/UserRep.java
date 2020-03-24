package com.aws.codestar.projecttemplates.Reprisitory;

import com.aws.codestar.projecttemplates.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRep extends CrudRepository<User, String> {

    //public List<User> findByEmail(String email);
    public List<User> findAll();
}
